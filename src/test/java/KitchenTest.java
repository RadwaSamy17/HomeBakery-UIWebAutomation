import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KitchenTest extends Base {
    @Test
    public void openKitchen (){
        var kitchen = homePage.clickKitchen();
        String title = kitchen.getkitchenTitle();
        assertEquals(title,"An all day dining concept by the");
        kitchen.clickInstaButton(kitchen.getInstaButton());
        kitchen.switchToInsta();
        assertEquals(kitchen.getCurrentURL(),"https://www.instagram.com/home_bakery/");

    }
}
