package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionDetails {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//*[@id=\'product_form_7225704644771\']/div/div[3]/button");
    private By plusButton = By.xpath("//*[@id=\'product_form_7225704644771\']/div/div[2]/div/div/span[2]");
    private By minusButton = By.xpath("//*[@id=\'product_form_7225704644771\']/div/div[2]/div/div/span[1]");
    private By numberValue =By.xpath(("//*[@id=\'product_form_7225704644771\']/div/div[2]/div/div/input"));
    private By boxNumber =By.xpath("//*[@id=\'popover-7225704644771-product-template-inside-box\']/div/div/button[2]");
    private By boxNumberList = By.xpath("//*[@id=\'product_form_7225704644771\']/div/div[1]/div[2]/button");
    private By allergensButton = By.xpath("//*[@id=\"shopify-section-product-template\"]/section/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/h4");
    private By orderInfoButton = By.xpath("//*[@id=\"shopify-section-product-template\"]/section/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/h4");
    public OptionDetails(WebDriver driver){
        this.driver =driver;
    }

    public void clickPlusButton(){
        driver.findElement(plusButton).click();
    }
    public void clickMinusButton(){
        driver.findElement(minusButton).click();
    }

    public String getNumberValue(){
        return driver.findElement(numberValue).getAttribute("value");
    }

    public void chooseBoxNumber(){
        driver.findElement(boxNumberList).click();
        driver.findElement(boxNumber).click();
    }

    public By getAllergensButton() {
        return allergensButton;
    }
    public By getOrderInfoButton(){
        return orderInfoButton;
    }

    public void clickDetails(By title){
        driver.findElement(title).click();
    }
    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

}
