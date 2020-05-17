package com.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // it should rel path
        features="C:\\Users\\supriya.soni\\Documents\\Study material\\Testing\\Project_Demo\\automation_testing_demoApp\\src\\test\\java\\com\\demo\\features\\Login.feature",
        glue={"com/demo/stepDefinitions"},
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
        monochrome = true,
        strict = true,
        dryRun = false
        )
public class TestRunner
{

}

// tagging for run all the features files