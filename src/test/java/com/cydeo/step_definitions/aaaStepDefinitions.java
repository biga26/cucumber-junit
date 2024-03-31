package com.cydeo.step_definitions;

import com.cydeo.pages.aaaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class aaaStepDefinitions {

    aaaPage aaaPage = new aaaPage();

    @Given("user is on calculator page")
    public void user_is_on_calculator_page_aaa(){
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("user clicks {string} on calculator")
    public void user_clicks_on_calculator_aaa(String button){
        aaaPage.button_a01(button).click();
        String inputText = aaaPage.input.getText().trim();
        System.out.println(inputText);
        Assert.assertEquals("right", inputText,button);
        System.out.println("aaa");
    }

    @Then("result should be {string} on calculator")
    public void result_on_calculator(String expectedResult){
        String actualResult = new aaaPage().output.getText().trim();
        System.out.println("asdas"+expectedResult);
    }






}
