package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
   private By figureBox=By.className("figure");
    private By boxCaption= By.className("figurecaption");
    public HoversPage(WebDriver driver){
        this.driver=driver;
    }
   public FigureCaption hoverOverFigure(int index){
       WebElement figure=driver.findElements(figureBox).get(index-1);
       Actions action= new Actions(driver);
       action.moveToElement(figure).perform();

       return new FigureCaption(figure.findElement(boxCaption));
   }
   public class FigureCaption{
        private WebElement caption;
        public FigureCaption(WebElement caption){
            this.caption=caption;
        }
   }
}
