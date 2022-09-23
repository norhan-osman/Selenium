package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

// all of our test cases will inherit BaseTests
public class LoginTests extends BaseTests {
    // in order to run this as a test we need to use an annotation from testng
    @Test // that lets testng know that this will be a test method
    public void testSuccessfulLogin(){

        LoginPage loginPage= homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword");
        // because clickLoginButton() return a secure area page we create a handle to save it
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        // I need t verify if the alert text is what i expect or not
        // and selenium-webdriver is just automate the actions on the browser not verify
        // , so we need to add a verification or assertion tool to our framework
       assertTrue( secureAreaPage.getAlertText().contains("You logged into a secure area!"),"The message is incorrect");
    }
}
