import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShopTest extends Base{
    @Test
    public void clickShop(){
        var shop = homePage.clickShop();
        By item1 = By.xpath("//a[@data-id='41522875433123']");
        By item2 = By.xpath("//a[@data-id='41522828345507']");
        shop.addItemToCart(item2);
        shop.closeCart();
        shop.addItemToCart(item1);
        shop.clickCheckoutButton();
        shop.clickPickupButton();
        shop.selectDate();
        shop.setPhone("0123456789");
        shop.clickProceedButton();
        assertEquals(shop.getTitle(),"Delivery method");
    }
}
