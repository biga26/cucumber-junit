package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class FindTransactionStepDefsCopy {

    @Given("the user is on login page")
    public void theUserIsOnLoginPage(){
        Driver.getDriver().get("http://zero.webappsecurity.com/login.html");
    }

    @Given("user logins with username {string} and {string}")
    public void userLoginsWithUsernameAndPassword(String username, String password){
        Driver.getDriver().findElement(By.id("user_login")).sendKeys(username);
        Driver.getDriver().findElement(By.id("user_password")).sendKeys(password);
        Driver.getDriver().navigate().back();
    }


    public void theUserNavigatetoMenu(String string){
        Driver.getDriver().findElement(By.id("account_activity_link")).click();
    }


    public void theUseraccessesthefindTransactiontab(){
        Driver.getDriver().findElement(By.linkText("Find Transactions")).click();
    }



    





}
