package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPageCopy;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTable_StepDefinitionsCopy {

    WebTableLoginPageCopy webTableLoginPageCopy = new WebTableLoginPageCopy();

    @Given("user goes to login page2")
    public void userGoesToLoginPage2(){
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters login {string} text")
    public void userEnterUsername2(String string){
        webTableLoginPageCopy.inputUsername.sendKeys(string);
    }

    @When("user enters password {string} text")
    public void userEntersPassword2(String string){
        webTableLoginPageCopy.inputPassword.sendKeys(string);
    }


    @When("And user click login button2")
    public void userClickLoginButton(){
        webTableLoginPageCopy.loginButton2.click();
    }


    @Then("userShould see url contains orders")
    public void userSHouldSeeUrlContainsOrders(){
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters user {string} and password {string} and login")
    public void userEntersUsernamePassword(String username, String password){
        webTableLoginPageCopy.login(username,password);

    }


}
