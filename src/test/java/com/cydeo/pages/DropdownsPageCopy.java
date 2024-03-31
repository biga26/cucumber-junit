package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownsPageCopy {

    public DropdownsPageCopy(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;

}
