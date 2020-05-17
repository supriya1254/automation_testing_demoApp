package com.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    //remove and it will read from folder
    static String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";

    public TestBase() {
        try{
            prop = new Properties();
            //rel path should be there
            FileInputStream fis = new FileInputStream("C:\\Users\\supriya.soni\\Documents\\Study material\\Testing\\Project_Demo\\automation_testing_demoApp\\src\\test\\java\\com\\demo\\config\\config.properties");
            prop.load(fis);
        }catch (IOException exception){
            exception.getMessage();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LAOD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }

    public static void closeWindow()    {
        driver.close();
        driver.quit();
    }

}
