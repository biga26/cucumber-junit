package com.cydeo.step_definitions;

import com.cydeo.pages.DicePageCopy;
import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class DiceStepDefsCopy {


    @Given("user enters dice job url")
    public void enterPage(){
        System.out.println("Go to page");
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }

    @When("user enters word")
    public void enterWord(){
        DicePageCopy dicePageCopy = new DicePageCopy();
        dicePageCopy.keywordBox.sendKeys("java");
        dicePageCopy.zipBox.sendKeys("11223" + Keys.ENTER);

    }

    @When("push search button")
    public void pushSearchButton(){
        DicePageCopy dicePageCopy = new DicePageCopy();
        dicePageCopy.button.click();
    }


    @Then("user gets total job number")
    public void getTotalJobCount(){
        DicePageCopy dicePageCopy = new DicePageCopy();
        System.out.println("Job number: " + dicePageCopy.totalJobs.getText());
    }



}
