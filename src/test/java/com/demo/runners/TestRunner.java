package com.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/com/demo/features/",
        glue={"com/demo/stepDefinitions"},
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
        tags = {"@test", "~@bug","~@Smoke"},
        monochrome = true,
        strict = true,
        dryRun = false
        )
public class TestRunner
{

}
