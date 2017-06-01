package com.tiagolimadev.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        glue = "com.tiagolimadev.bdd.steps",
        features = "classpath:cucumber/calculadora.feature"
)
public class RunCalculadoraTest {
}
