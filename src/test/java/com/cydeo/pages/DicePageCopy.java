package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DicePageCopy {

    public DicePageCopy(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;

    @FindBy(id = "google-location-search")
    public WebElement zipBox;

    @FindBy(id = "submitSearch-button")
    public WebElement button;

    @FindBy(id = "totalJobCount")
    public WebElement totalJobs;


}
