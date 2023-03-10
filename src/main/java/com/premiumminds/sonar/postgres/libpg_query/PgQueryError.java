package com.premiumminds.sonar.postgres.libpg_query;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PgQueryError extends Structure {
    /**
     * exception message<br>
     * C type : char*
     */
    public Pointer message;
    /**
     * source function of exception (e.g. SearchSysCache)<br>
     * C type : char*
     */
    public Pointer funcname;
    /**
     * source of exception (e.g. parse.l)<br>
     * C type : char*
     */
    public Pointer filename;
    /** source of exception (e.g. 104) */
    public int lineno;
    /** char in query at which exception occurred */
    public int cursorpos;
    /**
     * additional context (optional, can be NULL)<br>
     * C type : char*
     */
    public Pointer context;
    public PgQueryError() {
        super();
    }
    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("message", "funcname", "filename", "lineno", "cursorpos", "context");
    }
    /**
     * @param message exception message<br>
     * C type : char*<br>
     * @param funcname source function of exception (e.g. SearchSysCache)<br>
     * C type : char*<br>
     * @param filename source of exception (e.g. parse.l)<br>
     * C type : char*<br>
     * @param lineno source of exception (e.g. 104)<br>
     * @param cursorpos char in query at which exception occurred<br>
     * @param context additional context (optional, can be NULL)<br>
     * C type : char*
     */
    public PgQueryError(Pointer message, Pointer funcname, Pointer filename, int lineno, int cursorpos, Pointer context) {
        super();
        this.message = message;
        this.funcname = funcname;
        this.filename = filename;
        this.lineno = lineno;
        this.cursorpos = cursorpos;
        this.context = context;
    }
    public PgQueryError(Pointer peer) {
        super(peer);
    }
    public static class ByReference extends PgQueryError implements Structure.ByReference {

    };
    public static class ByValue extends PgQueryError implements Structure.ByValue {

    };
}
