package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown= By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    // we will add selenium support dependency, it contains a class called select and this what we need to select object from dropdown
    public void selectFormDropDown(String option){

        Select dropdownElement= findDropDownElement();
        dropdownElement.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
       List<WebElement> selectedElement= findDropDownElement().getAllSelectedOptions();
       return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
       // inside this ma I pass lambde expression so I want to say for every element that's inside of this list
        //I want yo to take this action  and once you get the text of every element I want you to collect all of those
        //and to a new list and that will be a list of strings
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
