package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver; // we create it to store the driver in HomePage method
  // if there is more a method use form authentication ,it will have to define it here
    //  private By formAuthenticationLink= By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver; // what will pass here in driver is the actual driver that has launched the browser already

    }
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickDownDrop(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public LoginPage clickFormAuthentication(){
       // driver.findElement(formAuthenticationLink).click();
        clickLink("From Authentication");
        return new LoginPage(driver);

    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
