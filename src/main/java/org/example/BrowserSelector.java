package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils
{

    LoadProperty loadProperty = new LoadProperty();
    public void openBrowser()
    { String browserName=loadProperty.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome"))
        { WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else {
            System.out.println("Please enter valid browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
    }

}
