package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;

    public static WebDriver getDriver() throws IOException {
        if (driver == null) {

            String browser = getProperty("browser");
            switch (browser) {
                case ("chrome"):
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case ("firefox"):
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

            }

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
    public static WebDriver closeDriver(){
        if(driver!=null){
            driver.quit();
        }
      return driver;
    }

    public static String getProperty(String propertyKey) throws IOException {

        Properties pop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Owner\\IdeaProjects\\E2EProject1\\src\\main\\java\\common\\data.properties");
        pop.load(fis);
        String returnProperties = pop.getProperty(propertyKey);

        return returnProperties;

    }
    public void getScreenShut(String name) throws IOException {

       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src, new File("C:\\TestCase\\"+name+"screenshot.png"));


    }


}
