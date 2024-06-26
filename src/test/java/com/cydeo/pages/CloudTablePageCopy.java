package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class CloudTablePageCopy {

    public CloudTablePageCopy(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button/span[.='New']")
    public WebElement newPerson;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;


    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button/span[.='Delete']")
    public WebElement deletePerson;

    @FindBy(xpath = "(//div/button[.='Delete'])[2]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//td[.='No matching records found']")
    public WebElement errorMessage;


    public WebElement getNewPerson(String firstName, String lastName){
        return Driver.getDriver().findElement(By.xpath("//td[.='"+firstName+" "+lastName+"']"));
    }






}
