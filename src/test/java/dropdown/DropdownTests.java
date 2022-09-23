package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTests extends BaseTests {
    @Test
    public void TestSelectOption(){
       var dropDownPage= homePage.clickDropDown();
       String option="Option 1";
       dropDownPage.selectFormDropDown(option);
       var selectedOption=dropDownPage.getSelectedOptions();
       assertEquals(selectedOption.size(),1,"Incorrect number of selection");
       assertTrue(selectedOption.contains(option),"Option not selected");

    }
}
