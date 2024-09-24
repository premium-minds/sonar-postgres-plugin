package com.premiumminds.sonar.postgres;

import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

public class PostgresSqlLanguage extends AbstractLanguage {

    public static final String NAME = "PostgreSQL";
    public static final String KEY = "postgres-language";
    public static final String FILE_SUFFIXES_KEY = "sonar." + KEY + ".file.suffixes";
    public static final String FILE_EXCLUSIONS_KEY = "sonar." + KEY + ".exclusions";
    public static final String FILE_SUFFIXES_DEFAULT_VALUE = "sql";


    private final Configuration config;

    public PostgresSqlLanguage(Configuration config) {
        super(KEY, NAME);
        this.config = config;
    }

    @Override
    public String[] getFileSuffixes() {
        return config.getStringArray(FILE_SUFFIXES_KEY);
    }
}
