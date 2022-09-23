package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username); //send keys simply means type it
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    // SecureAreaPage is the return type because when clicking LoginButton there is an action(new page opens) the we have return a handl with this page
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);

    }
}
