package com.cph.testass1.numerals;

import com.cph.testass1.NumericConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

public class NumeralsTest {

    NumericConverter converter;
    String result;

    @Given("I have a numerals converter")
    public void i_have_a_converter() {
        converter = new NumericConverter();
    }

    @When("I convert {int} to Romanina numeral")
    public void i_add_and(Integer r) {
        result = converter.convert(r);
    }

    @Then("I should get {string}")
    public void i_Should_get(String expectedResult) {
        assertTrue(result.equals(expectedResult));
    }
}
