package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExperiancePage{
    private WebDriver driver;
    private By experianceTitle = By.cssSelector("h5.text-line span");
    private By instaButton = By.xpath("//a[@href='https://www.instagram.com/home_bakery']");
    public ExperiancePage(WebDriver driver){
        this.driver = driver;
    }
    public String getExperianceTitle(){
        return driver.findElement(experianceTitle).getText();
    }
    public By getExperianceInstaButton(){
        return instaButton;
    }
    public void clickExperianceInstaButton(By button){
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
