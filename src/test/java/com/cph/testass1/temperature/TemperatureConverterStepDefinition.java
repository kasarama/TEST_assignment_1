package com.cph.testass1.temperature;

import com.cph.testass1.TemperatureConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureConverterStepDefinition {
    TemperatureConverter converter;
    double fahrenheits;
    double celsius;

    @Given("I have a converter")
    public void I_have_a_converter() {
        converter = new TemperatureConverter();
    }

    @When("I convert {double} degree Fahrenheits to Celsius")
    public void i_convert_fahrenheits_to_celsius(double f) {
        fahrenheits = f;
        celsius = converter.convert(fahrenheits);
    }

    @Then("I should get {double} Celsius")
    public void i_should_get(double expectedResult) {
        assertEquals(expectedResult, celsius, 0.001);
    }

}
