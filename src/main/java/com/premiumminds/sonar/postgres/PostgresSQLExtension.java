package com.premiumminds.sonar.postgres;

import org.sonar.api.Plugin;
import org.sonar.api.PropertyType;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import static com.premiumminds.sonar.postgres.PostgresSqlLanguage.FILE_EXCLUSIONS_KEY;
import static com.premiumminds.sonar.postgres.PostgresSqlLanguage.FILE_SUFFIXES_DEFAULT_VALUE;
import static com.premiumminds.sonar.postgres.PostgresSqlLanguage.FILE_SUFFIXES_KEY;
import static com.premiumminds.sonar.postgres.PostgresSqlSensor.DEFAULT_PROTOBUF_RECURSION_LIMIT;
import static com.premiumminds.sonar.postgres.PostgresSqlSensor.PROTOBUF_RECURSION_LIMIT_KEY;

public class PostgresSQLExtension implements Plugin {

    private static final String CATEGORY = "PostgreSQL";
    @Override
    public void define(Context context) {

        context.addExtensions(PostgresSqlLanguage.class,
                PostgresSqlRulesDefinition.class,
                PostgresSqlQualityProfile.class,
                PostgresSQLExclusionsFileFilter.class);

        context.addExtension(PropertyDefinition.builder(FILE_SUFFIXES_KEY)
                .defaultValue(FILE_SUFFIXES_DEFAULT_VALUE)
                .name("File Suffixes")
                .description("List of suffixes of Postgres files to analyze.")
                .onQualifiers(Qualifiers.PROJECT)
                .category(CATEGORY)
                .multiValues(true)
                .build());

        context.addExtension(PropertyDefinition.builder(FILE_EXCLUSIONS_KEY)
                .name("File exclusions")
                .description("List of file path patterns to be excluded from analysis of PostgreSQL files.")
                .onQualifiers(Qualifiers.PROJECT)
                .category(CATEGORY)
                .multiValues(true)
                .build());

        context.addExtension(PropertyDefinition.builder(PROTOBUF_RECURSION_LIMIT_KEY)
                .name("Protobuf recursion limit")
                .description("Maximum nesting depth when reading PostgreSQL syntax trees. Must be positive. "
                        + "Higher limits may require a larger JVM thread stack.")
                .type(PropertyType.INTEGER)
                .defaultValue(Integer.toString(DEFAULT_PROTOBUF_RECURSION_LIMIT))
                .onQualifiers(Qualifiers.PROJECT)
                .category(CATEGORY)
                .build());

        context.addExtension(PostgresSqlSensor.class);
    }
}
