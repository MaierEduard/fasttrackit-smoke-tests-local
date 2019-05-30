package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.fasttrackit",
        features = "src/test/resources/features/products-sorting.feature",tags = "~@ignore",
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/productSorting.json"}
)

public class ProductSortingRunner {
}
