package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser() {
        //open browser
        browserSelector.openBrowser();
        driver.get("https://www.asda.com/");
    }

    @AfterMethod
    public void closeBrowser() {
        //close browser
        driver.quit();
    }
}

