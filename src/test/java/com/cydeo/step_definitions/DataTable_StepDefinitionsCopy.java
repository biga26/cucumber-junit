package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPageCopy;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DataTable_StepDefinitionsCopy {


    @Then("user should see fruits I like in list")
    public void userShouldSeeFruitsILike(List<String> fruits){

        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }

    @Given("User is on dropdown of pracice cydep")
    public void userIsOnDropdownPage(){
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("user should see below info in month dropdown")
    public void  userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths){

        DropdownsPageCopy dropdownsPageCopy = new DropdownsPageCopy();

        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPageCopy.monthDropdown);

        Assert.assertEquals(expectedMonths,actualMonths);

    }



}
