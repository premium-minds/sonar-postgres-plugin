package com.premiumminds.sonar.plpgsql.rules;

import jakarta.json.JsonObject;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.sensor.SensorContext;

public class DoStmt implements Stmt {

    @Override
    public void validate(SensorContext context, InputFile file, TextRange textRange, JsonObject jsonObject) {

    }
}