package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage {
    private WebDriver driver;
    private By closeButton = By.xpath("//button[@data-drawer-id='sidebar-cart']");
    private By checkoutButton = By.xpath("//*[@id=\"sidebar-cart\"]/form/div[2]/a");
    private By pickupButton =By.xpath("//*[@id=\"precheckout-form\"]/div[1]/div/label[3]");
    private By phoneNumber = By.name("attributes[Pickup - Phone Number]");
    private  By proceedButton = By.name("checkout");
    public ShopPage(WebDriver driver){
        this.driver=driver;
    }
    public void addItemToCart(By item){
        driver.findElement(item).click();
    }
    public void closeCart(){
        driver.findElement(closeButton).click();
    }
    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void clickPickupButton(){
        driver.findElement(pickupButton).click();
    }
    public void selectDate(){
        driver.findElement(By.name("attributes[Pickup Date]")).click();
        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[11]")).click();
    }
    public void setPhone(String number){
        driver.findElement(phoneNumber).sendKeys(number);
    }
    public void clickProceedButton(){
        driver.findElement(proceedButton).click();
    }
    public String getTitle(){
        return driver.findElement(By.xpath("//*[@id=\"Form0\"]/div[1]/div/div[2]/div[1]/div/section[1]/div/h2")).getText();
    }
}
