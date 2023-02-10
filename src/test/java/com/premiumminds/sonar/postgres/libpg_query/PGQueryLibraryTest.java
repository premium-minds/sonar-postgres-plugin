package com.premiumminds.sonar.postgres.libpg_query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.google.protobuf.InvalidProtocolBufferException;
import com.premiumminds.sonar.postgres.protobuf.ParseResult;
import com.premiumminds.sonar.postgres.protobuf.RawStmt;
import com.premiumminds.sonar.postgres.protobuf.ScanResult;
import com.premiumminds.sonar.postgres.protobuf.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PGQueryLibraryTest {

    @Test
    void pg_query_parse() {
        final String query = "select bar from foo;";
        final PgQueryParseResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_parse(query);
        assertNull(result.error);

        assertEquals("{\"version\":150001,\"stmts\":[{\"stmt\":{\"SelectStmt\":{\"targetList\":[{\"ResTarget\":{\"val\":{\"ColumnRef\":{\"fields\":[{\"String\":{\"sval\":\"bar\"}}],\"location\":7}},\"location\":7}}],\"fromClause\":[{\"RangeVar\":{\"relname\":\"foo\",\"inh\":true,\"relpersistence\":\"p\",\"location\":16}}],\"limitOption\":\"LIMIT_OPTION_DEFAULT\",\"op\":\"SETOP_NONE\"}},\"stmt_len\":19}]}",
                result.parse_tree.getString(0));

        PGQueryLibrary.INSTANCE.pg_query_free_parse_result(result);
    }

    @Test
    void pg_query_parse_protobuf() throws InvalidProtocolBufferException {
        final String query = "select bar from foo;";

        final PgQueryProtobufParseResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_parse_protobuf(query);
        assertNull(result.error);

        final ParseResult parseResult = ParseResult.parseFrom(result.parse_tree.data.getByteArray(0, result.parse_tree.len));
        assertEquals(1, parseResult.getStmtsCount());

        final RawStmt stmt = parseResult.getStmts(0);
        assertTrue(stmt.getStmt().hasSelectStmt());
        assertFalse(stmt.getStmt().hasIndexStmt());
        assertFalse(stmt.getStmt().hasInsertStmt());
        assertFalse(stmt.getStmt().hasDeleteStmt());
        assertFalse(stmt.getStmt().hasUpdateStmt());
        assertFalse(stmt.getStmt().hasCreateStmt());
        assertFalse(stmt.getStmt().hasDropStmt());

        assertEquals(1, stmt.getStmt().getSelectStmt().getTargetListCount());
        assertEquals(Collections.singletonList("bar"), stmt.getStmt()
                .getSelectStmt()
                .getTargetListList()
                .stream()
                .map(n -> n.getResTarget().getVal().getColumnRef().getFieldsList())
                .flatMap(List::stream)
                .map(x -> x.getString().getSval())
                .collect(Collectors.toList()));

        assertEquals(1, stmt.getStmt().getSelectStmt().getFromClauseCount());
        assertEquals(Collections.singletonList("foo"), stmt.getStmt()
                .getSelectStmt()
                .getFromClauseList()
                .stream()
                .map(n -> n.getRangeVar().getRelname())
                .collect(Collectors.toList()));

        PGQueryLibrary.INSTANCE.pg_query_free_protobuf_parse_result(result);
    }

    @Test
    void pg_query_scan() throws InvalidProtocolBufferException {
        final String query = "select bar from foo;";
        final PgQueryScanResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_scan(query);
        assertNull(result.error);

        final ScanResult scanResult = ScanResult.parseFrom(result.pbuf.data.getByteArray(0, result.pbuf.len));

        assertEquals(5, scanResult.getTokensCount());

        assertEquals(Arrays.asList("bar", "foo"), scanResult.getTokensList()
                .stream()
                .filter(st -> st.getToken().equals(Token.IDENT))
                .map(st -> query.substring(st.getStart(), st.getEnd()))
                .collect(Collectors.toList()));

        PGQueryLibrary.INSTANCE.pg_query_free_scan_result(result);

    }

    @Test
    public void pg_query_parse_plpgsql() {
        final String query = "CREATE OR REPLACE FUNCTION cs_fmt_browser_version(v_name varchar, \n" +
                "                                                  v_version varchar) \n" +
                "RETURNS varchar AS $$\n" +
                "BEGIN \n" +
                "    IF v_version IS NULL THEN \n" +
                "        RETURN v_name; \n" +
                "    END IF; \n" +
                "    RETURN v_name || '/' || v_version; \n" +
                "END;\n" +
                "$$ LANGUAGE plpgsql;";

        final PgQueryPlpgsqlParseResult.ByValue result = PGQueryLibrary.INSTANCE.pg_query_parse_plpgsql(query);
        assertNull(result.error);

        assertEquals("[\n" +
                        "{\"PLpgSQL_function\":{\"datums\":[{\"PLpgSQL_var\":{\"refname\":\"v_name\",\"datatype\":{\"PLpgSQL_type\":{\"typname\":\"UNKNOWN\"}}}},{\"PLpgSQL_var\":{\"refname\":\"v_version\",\"datatype\":{\"PLpgSQL_type\":{\"typname\":\"UNKNOWN\"}}}},{\"PLpgSQL_var\":{\"refname\":\"found\",\"datatype\":{\"PLpgSQL_type\":{\"typname\":\"UNKNOWN\"}}}}],\"action\":{\"PLpgSQL_stmt_block\":{\"lineno\":2,\"body\":[{\"PLpgSQL_stmt_if\":{\"lineno\":3,\"cond\":{\"PLpgSQL_expr\":{\"query\":\"v_version IS NULL\"}},\"then_body\":[{\"PLpgSQL_stmt_return\":{\"lineno\":4,\"expr\":{\"PLpgSQL_expr\":{\"query\":\"v_name\"}}}}]}},{\"PLpgSQL_stmt_return\":{\"lineno\":6,\"expr\":{\"PLpgSQL_expr\":{\"query\":\"v_name || '/' || v_version\"}}}}]}}}}\n" +
                        "]",
                result.plpgsql_funcs.getString(0));

        PGQueryLibrary.INSTANCE.pg_query_free_plpgsql_parse_result(result);
    }
}