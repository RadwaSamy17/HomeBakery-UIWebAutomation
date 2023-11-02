import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\HomeBakery\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        goHome();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://homebakery.ae/");
        homePage=new HomePage(driver);
    }
    @AfterClass
    public void shutDown(){
        driver.quit();
    }
}
