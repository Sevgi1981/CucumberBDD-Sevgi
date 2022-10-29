package code.pages.labsPages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class lab2Home extends BrowserUtils {

    public lab2Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    private static final Logger logger=Logger.getLogger(lab2Home.class);

    @FindBy(xpath = "//a[.='Demo Site']")
    private WebElement webSite;
    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement addTariffPlan;
    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement verifyTariffHeader;
    @FindBy(id = "rental1")
    private WebElement MonthlyRental;
    @FindBy(id = "local_minutes")
    private WebElement FreeLocalMin;
    @FindBy(id = "inter_minutes")
    private WebElement FreeInterMin;
    @FindBy(id = "sms_pack")
    private WebElement FreeSMSPack;
    @FindBy(id = "minutes_charges")
    private WebElement LocalPerMinChar;
    @FindBy(id = "inter_charges")
    private WebElement InterPerMinChar;
    @FindBy(id = "sms_charges")
    private WebElement SMSchar;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement SubmitButton;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement VerificationTariffPlan;

    public void setVerificationTariffPlan(String verificationtariffPlan) {
        Assert.assertEquals(verificationtariffPlan,VerificationTariffPlan.getText());
        logger.info("Congratulation Tariff Plan Verification has passed");
    }

    public void setSubmitButton() {
        SubmitButton.click();
    }

    public void setMonthlyRental(String monthlyrental) {
        MonthlyRental.sendKeys(monthlyrental);
    }

    public void setFreeLocalMin(String freelocalMin) {
        FreeLocalMin.sendKeys(freelocalMin);
    }

    public void setFreeInterMin(String freeinterMin) {
        FreeInterMin.sendKeys(freeinterMin);
    }

    public void setFreeSMSPack(String freeSMSpack) {
        FreeSMSPack.sendKeys(freeSMSpack);
    }

    public void setLocalPerMinChar(String localperMinChar) {
        LocalPerMinChar.sendKeys(localperMinChar);
    }

    public void setInterPerMinChar(String interperMinChar) {
        InterPerMinChar.sendKeys(interperMinChar);
    }

    public void setSMSchar(String SMSChar) {
        SMSchar.sendKeys(SMSChar);
    }

    public void setVerifyTariffHeader(String verifytariffHeader) {
        Assert.assertEquals(verifytariffHeader,verifyTariffHeader.getText());
        logger.info("AddTariffHeader Verification has passed");

    }

    public void setAddTariffPlan() {
        addTariffPlan.click();
    }


    public void setWebSite() {
        Assert.assertEquals("Demo Site",webSite.getText());
        logger.info("Demo Site Verification has passed");

    }
}
