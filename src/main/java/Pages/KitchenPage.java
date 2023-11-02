package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KitchenPage {
    private WebDriver driver;
    //private By kitchenTitle = By.xpath("//span[contains(@data-aos,'reveal-line')]");
    private By kitchenTitle = By.cssSelector("div.text-line > span.aos-line");
    private By instaButton = By.xpath("//a[@href='https://www.instagram.com/home_bakery']");
    public KitchenPage(WebDriver driver){
        this.driver = driver;
    }
    public By getInstaButton(){
        return instaButton;
    }
    public String getkitchenTitle(){
        return driver.findElement(kitchenTitle).getText();
    }
    public void clickInstaButton(By button){
        driver.findElement(button).click();
    }
    public void switchToInsta(){
        //driver.switchTo().window(driver.getWindowHandle());
        String originalWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
