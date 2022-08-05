package com.dekosas.Runners;

/*
 *@author Rafael Chica.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",

        glue = "com.dekosas.StepDefinition",
        snippets = SnippetType.CAMELCASE
)
public class LoginRunner {
}
