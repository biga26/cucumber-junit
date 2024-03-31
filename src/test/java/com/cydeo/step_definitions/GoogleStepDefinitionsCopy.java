package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPageCopy;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitionsCopy {


    GoogleSearchPageCopy googleSearchPageCopy = new GoogleSearchPageCopy();

    @Given("user goes to Google page")
    public void userIsOnGooglePage(){
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see Google Title")
    public void userShouldSeeGoogleTitle(){
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println(expectedTitle);
    }

    @When("user types {string} and click enter")
    public void  userTypesAndClicksEnter(String apple){
        googleSearchPageCopy.searchBox.sendKeys(apple + Keys.ENTER);
    }


    public void userSeesInTheGoogleTitle(String string){
        String expectedTitle = string + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!", expectedTitle, actualTitle);
    }


    @When("user type {string} and clicks enter")
    public void userTypesAndClicksEnterButton(String searchword){
        googleSearchPageCopy.searchBox.sendKeys(searchword + Keys.ENTER);
    }

    public void userShouldTheResult(String expectedCapital){
        String actualValue = googleSearchPageCopy.getCapital();
        Assert.assertEquals(expectedCapital,actualValue);
    }





}
