import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends Base{
    @Test
    public void contactTest(){
        var contact = homePage.clickContact();
        contact.setNameField("Dazai");
        contact.setEmailField("dazai17@gmail.com");
        contact.setNumberField("123456789");
        contact.setMessageField("Thanks a lot for the items");
        contact.clickSubmitButton(contact.getSubmitButton());
        assertTrue(contact.getAlertText().contains("Your message has been successfully sent."),"Alert! your message hasn't been sent");
        contact.clickSubmitButton(contact.getLocation());
        contact.clickSubmitButton(contact.getFAQ());

    }
}
