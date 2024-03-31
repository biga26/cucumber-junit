package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.pages.CalculatorPageCopy;
import com.cydeo.pages.PercentageCalculatorPageCopy;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CalculatorStepDefsCopy {








    @Given("testThis")
    public void asdasd(){
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("push {string}")
    public void teaasdasd(String button5){
        new CalculatorPageCopy().button(button5).click();
        //System.out.println();
        System.out.println("a");
    }

    @Then("result is {string}")
    public void result(String expectedResult){
        String actualResult = new CalculatorPageCopy().outPut.getText().trim();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Given("go to calculator percentage page")
    public void userIsOnPercentageCalculatorPage(){
        System.out.println("User is on percentage page");
        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
    }



    @Then("user should see following calculation results")
    public void userShouldSeeFollowingCalculationResults(Map<String,String> valuesMap){
        System.out.println("Values =" + valuesMap);
        PercentageCalculatorPageCopy percentageCalculatorPageCopy = new PercentageCalculatorPageCopy();
        percentageCalculatorPageCopy.percent.sendKeys("5");


    }











}
