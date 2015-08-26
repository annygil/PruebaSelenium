/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author ubitica-01
 */
public class NewTest {
    private WebDriver driver;
    @Test
    public void testEasy(){
        driver.get("http://www.guru99.com/selenium-tutorial.html");
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Free Selenium Tutoriales"));
    }
    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
    
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
