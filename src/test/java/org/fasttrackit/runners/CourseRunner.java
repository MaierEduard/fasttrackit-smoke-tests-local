package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "org.fasttrackit",
        features = "src/test/resources/features/course.feature",
        tags = {"~@PLM"},
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/course.json"})


public class CourseRunner {
}
