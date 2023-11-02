import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OpenInstaTest extends Base {
    @Test
    public void openInsta(){
        var openInsta = homePage.clickOpenInsta();
        assertEquals(openInsta.getCurrentURL(),"https://www.instagram.com/home_bakery/");
    }
}
