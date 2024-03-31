package com.cydeo.step_definitions;

import com.cydeo.pages.CloudTablePageCopy;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;

public class CloudTablesCopy {

    CloudTablePageCopy cloudTablePageCopy = new CloudTablePageCopy();
    String firstName;
    String lastName;


    @Given("User is going cloudTable homepage")
    public void UserIsOnCloudTablesHomepage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));



    }

    @When("user click on new button on homepage")
    public void userClicksOnNewButton(){
        cloudTablePageCopy.newPerson.click();

    }

    @When("user enters {string} to FirstName")
    public void userEntersFirstNameField(String firstName){
        cloudTablePageCopy.firstName.sendKeys(firstName);
        this.firstName = firstName;
        System.out.println(firstName);
    }

    @And("user enters {string} to LastName")
    public void userEntersLastnameField(String lastName){
        cloudTablePageCopy.lastName.sendKeys(lastName);
        this.lastName = lastName;
    }

    @When("user enters {string} to position")
    public void userEntersPosition(String position){
        cloudTablePageCopy.positionBox.sendKeys(position);
        System.out.println(position);
    }

    @When("user enters {string} to salary")
    public void userEntersSalaryField(String salary){
        cloudTablePageCopy.salary.sendKeys(salary);
        System.out.println(salary);
    }

    @When("user click Create button")
    public void userClicksCreateButton(){
        cloudTablePageCopy.createButton.click();
    }

    @Then("user should be able to find person at the search box {string}")
    public void userShouldBeAbleToFindPerson(String situation){
        cloudTablePageCopy.searchBox.clear();
        cloudTablePageCopy.searchBox.sendKeys(this.firstName + " " + this.lastName);
        if(situation.equals("positive")){
            Assert.assertTrue(cloudTablePageCopy.getNewPerson(firstName,lastName).isDisplayed());
        }else if(situation.equals("negative")){
            Assert.assertTrue(cloudTablePageCopy.errorMessage.isDisplayed());
        }
    }

    @Then("user deletes the person created")
    public void userDeletesCreatedPerson(){
        BrowserUtils.sleep(2);
        cloudTablePageCopy.getNewPerson(firstName,lastName).click();
        cloudTablePageCopy.deletePerson.click();
        cloudTablePageCopy.confirmDelete.click();
        BrowserUtils.sleep(2);
    }









}
