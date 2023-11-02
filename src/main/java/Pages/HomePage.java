package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver =driver;
    }
    private void clickButton( String linkText){
        driver.findElement(By.xpath(linkText)).click();
    }
    public OptionDetails clickViewOptiondetails(){
        clickButton("//*[@id=\'collection-slider-16299935478d1ec16e\']/div/div[2]/div/div/div/div[1]/a");
        return new OptionDetails(driver);
    }
    public OpenInsta clickOpenInsta(){
        clickButton("//*[@id=\"shopify-section-1630011991bb5507cc\"]/section/div/div[1]/div/a");
        return new OpenInsta(driver);
    }
    public KitchenPage clickKitchen(){
        clickButton("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[3]/a");
        return new KitchenPage(driver);
    }
    public OurStoryPage clickOurStory (){
        clickButton("//a[contains(.,'Our StoryOur Story')]");
        return new OurStoryPage(driver);
    }
    public ExperiancePage clickExperiance (){
        clickButton("//a[contains(.,'ExperiencesExperiences')]");
        return new ExperiancePage(driver);
    }
    public ContactPage clickContact(){
        clickButton("//*[@id=\"section-header\"]/div/div[3]/nav/ul/li[1]/a");
        return new ContactPage(driver);
    }
    public AccountPage clickAccount(){
        clickButton("//*[@id=\"section-header\"]/div/div[3]/nav/ul/li[2]/a");
        return new AccountPage(driver);
    }
    public ShopPage clickShop(){
        clickButton("//a[contains(.,'Shop Now')]");
        return new ShopPage(driver);
    }
}
