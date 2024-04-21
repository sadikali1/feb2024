package com.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepsdef {
	
	int a, b, result;
	
	@Given("I am a calculator")
	public void i_am_a_calculator() {
	    System.out.println("I am a calculator");
	}

	
	@Given("two integer numbers {int} and {int}")
	public void two_integer_numbers_and(int int1, int int2) {
		a = int1;
		b = int2;
	}


	@When("I added both numbers")
	public void i_added_both_numbers() {
		result = a + b;
	}


	@Then("I verify result is {int}")
	public void i_verify_result_is(int expectedResult) {
		Assert.assertEquals(expectedResult, result);
	}

}
