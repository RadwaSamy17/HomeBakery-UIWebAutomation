package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By createAccountButton = By.xpath("//a[contains(.,'Create An Account')]");
    private By loginButton = By.xpath("//button[contains(.,'Login')]");
    private By creatMyAccountButton = By.xpath("//button[contains(.,'Create My Account')]");
    private By firstnameField =By.name("customer[first_name]");
    private By lastnameField =By.name("customer[last_name]");
    private By emailField =By.name("customer[email]");
    private By passwordField =By.name("customer[password]");
    private By welcomeText =By.xpath("//*[@id=\"main\"]/div/header/div/p");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }
    public void clickCreateMyAccountButton(){
        driver.findElement(creatMyAccountButton).click();
    }
    public void clickLogintButton(){
        driver.findElement(loginButton).click();
    }
    public void setFirstName(String firstname){
        driver.findElement(firstnameField).sendKeys(firstname);
    }
    public void setLastnameField(String lastname){
        driver.findElement(lastnameField).sendKeys(lastname);
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public String getWelcomeText(){
        return driver.findElement(welcomeText).getText();
    }

}
