package com.co.demo.runners;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/serenityLogin.feature",
        glue = "com.co.demo.stepdefinitions",
        //tags = "@successLogin",
        //plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SerenityLoginRunner {
    public static void test() throws IOException, InvalidFormatException{

    }


}
