import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OptionDetailsTest extends Base{
    @Test
    public void addToCard(){
        var addOption = homePage.clickViewOptiondetails();
        addOption.chooseBoxNumber();
        addOption.clickPlusButton();
        addOption.clickPlusButton();
        addOption.clickMinusButton();
        assertEquals(addOption.getNumberValue(),"2");
        addOption.clickDetails(addOption.getAllergensButton());
        addOption.clickDetails(addOption.getOrderInfoButton());
        addOption.addToCart();
    }
}
