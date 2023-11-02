import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OurStoryTest extends Base {
    @Test
    public void storyTest(){
        var story =homePage.clickOurStory();
        String title = story.getStoryTitle();
        assertEquals(title,"The story began in a home");
    }
}
