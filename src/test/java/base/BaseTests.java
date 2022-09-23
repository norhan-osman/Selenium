package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");   //we use get method to launch the browser

        homePage=new HomePage(driver);
       /* List<WebElement> Links=driver.findElements(By.tagName("a"));
        System.out.println(Links.size());
        WebElement inputsElement= driver.findElement(By.linkText("Inputs"));//return a singular web element and then we can make any action we need
        inputsElement.click();
        System.out.println(driver.getTitle()); */


    }
    @AfterClass
    public void tearDown(){
        driver.quit(); //quit close all of the windows that open, but .close() close only this window

    }
    // we no longer need main to run our test testng will come in and find what it is that wants to run

    /*
    public static void main(String args[]){
        BaseTests test=new BaseTests();
        test.setUp();


    }*/
}
