package com.tiagolimadev.bdd.steps;

import com.tiagolimadev.tads.test.calculadora.Calculadora;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculadoraSteps {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Given("^eu tenho uma calculadora$")
    public void eu_tenho_uma_calculadora() throws Throwable {
        assertNotNull(calculadora);
    }

    @When("^eu somo (\\d+) e (\\d+)$")
    public void eu_somo_e(int arg1, int arg2) throws Throwable {
        calculadora.somar(arg1, arg2);
    }

    @Then("^o resultado deve ser (\\d+)$")
    public void o_resultado_deve_ser(int result) throws Throwable {
        assertEquals(result, calculadora.getResultadoSoma());
    }
}
