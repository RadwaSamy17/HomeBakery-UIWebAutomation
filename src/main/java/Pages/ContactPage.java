package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By nameField= By.name("contact[name]");
    private By emailField = By.name("contact[email]");
    private By numberField = By.name("contact[number]");
    private By messageField = By.name("contact[body]");
    private By submitButton = By.xpath("//*[@id=\"contact_form\"]/button");
    private By status = By.xpath("//*[@id=\"contact_form\"]/p");
    private By location = By.xpath("//*[@id=\"shopify-section-page-contact-template\"]/div/div[1]/ul/li[3]/div/span");
    private By FAQ = By.xpath("//*[@id=\"shopify-section-page-contact-template\"]/div/div[1]/ul/li[4]/div/span");

    //*[@id="nav-FAQ"]/div/div/div/div/div[1]
    //*[@id="nav-FAQ"]/div/div/div/div/div[2]
    public ContactPage(WebDriver driver){
        this.driver = driver;
    }
    public void setNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setNumberField(String number){
        driver.findElement(numberField).sendKeys(number);
    }
    public void setMessageField(String message){
        driver.findElement(messageField).sendKeys(message);
    }
    public By getSubmitButton(){
        return submitButton;
    }
    public By getLocation(){
        return location;
    }
    public By getFAQ(){
        return FAQ;
    }
    public void clickSubmitButton(By button ){
        driver.findElement(button).click();
    }
    public String getAlertText(){
        return driver.findElement(status).getText();
    }
    public void clickDetails(){
        driver.findElement(By.xpath("//span[contains(.,'When will my order be delivered?')]")).click();
    }
}
