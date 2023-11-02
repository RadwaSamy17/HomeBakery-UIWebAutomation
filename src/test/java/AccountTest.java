import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountTest extends Base{
    @Test
    public void clickCreateAccount(){
        var createAccount = homePage.clickAccount();
        createAccount.clickCreateAccountButton();
        createAccount.setFirstName("Dazai");
        createAccount.setLastnameField("Kudo");
        createAccount.setEmailField("dazai@gmail.com");
        createAccount.setPassword("123456789");
        createAccount.clickCreateMyAccountButton();
    }
    @Test
    public void clickLogin(){
        var login = homePage.clickAccount();
        login.setEmailField("dazai17@gmail.com");
        login.setPassword("123456789");
        login.clickLogintButton();
        assertEquals(login.getWelcomeText(),"Welcome back, Dazai!");
    }
}
