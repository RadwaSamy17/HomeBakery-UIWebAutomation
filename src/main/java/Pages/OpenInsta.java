package Pages;

import org.openqa.selenium.WebDriver;

public class OpenInsta {
    private  WebDriver driver;
    public OpenInsta(WebDriver driver){
        this.driver=driver;
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
