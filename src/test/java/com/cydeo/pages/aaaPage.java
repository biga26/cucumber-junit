package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aaaPage {


    public aaaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement button_a01(String buttonText){
        return Driver.getDriver().findElement(By.xpath("//span[.='"+buttonText+"']"));
    }

    @FindBy(id = "sciInPut")
    public WebElement input;

    @FindBy(id = "sciOutPut")
    public WebElement output;







}
