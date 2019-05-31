package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "org.fasttrackit",
        features = "src/test/resources/features/cursuri-it-online.feature",
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/cursuri-it-online.json"})

public class CursuriItOnlineRunner {
}
