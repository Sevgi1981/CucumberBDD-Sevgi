package code.stepsDefinitions.labsSeteps;

import code.pages.labsPages.lab2Home;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class lab2Steps extends BrowserUtils {

lab2Home lab2Home=new lab2Home();

    @Given("The user wants to see Guru Demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("guruTarifPlan"));
        setWaitTime();
        lab2Home.setWebSite();


    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        lab2Home.setAddTariffPlan();
        Actions action=new Actions(Driver.getDriver());
        action.moveByOffset(0,0).click().build().perform();

    }
    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_headerr(String string) {
        lab2Home.setVerifyTariffHeader(string);


    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
        lab2Home.setMonthlyRental(dataTable.get("Monthly Rental"));
        lab2Home.setFreeLocalMin(dataTable.get("Free Local Minutes"));
        lab2Home.setFreeInterMin(dataTable.get("Free International Minutes"));
        lab2Home.setFreeSMSPack(dataTable.get("Free SMS Pack"));
        lab2Home.setLocalPerMinChar(dataTable.get("Local Per Minutes Charges"));
        lab2Home.setInterPerMinChar(dataTable.get("International Per Minutes Charges"));
        lab2Home.setSMSchar(dataTable.get("SMS Per Charges"));

    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        lab2Home.setSubmitButton();

    }
    @Then("The user wants to verify Message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        lab2Home.setVerificationTariffPlan(string);

    }



}
