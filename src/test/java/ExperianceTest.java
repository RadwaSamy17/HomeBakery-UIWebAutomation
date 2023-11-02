import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExperianceTest extends Base {
    @Test
    public void experianceTest(){
        var experiance = homePage.clickExperiance();
        String title = experiance.getExperianceTitle();
        assertEquals(title,"Events & Catering");
        experiance.clickExperianceInstaButton(experiance.getExperianceInstaButton());
        experiance.switchToInsta();
        assertEquals(experiance.getCurrentURL(),"https://www.instagram.com/home_bakery/");
    }
}
