package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurStoryPage {
    private WebDriver driver;
    private By storyTitle = By.cssSelector("span.aos-line.aos-init.aos-animate");
    public OurStoryPage(WebDriver driver){
        this.driver = driver;
    }
    public String getStoryTitle(){
        return driver.findElement(storyTitle).getText();
    }
}
