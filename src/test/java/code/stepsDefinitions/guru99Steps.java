package code.stepsDefinitions;

import code.pages.guru99GatewayHome;
import code.pages.guru99GatewayOrderSuccess;
import code.pages.guru99GatewayPaymentPage;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class guru99Steps extends BrowserUtils {

    guru99GatewayHome guru99GatewayHome=new guru99GatewayHome();
    guru99GatewayOrderSuccess guru99GatewayOrderSuccess=new guru99GatewayOrderSuccess();
    guru99GatewayPaymentPage guru99GatewayPaymentPage=new guru99GatewayPaymentPage();


    @Given("The user wants to go to Payment Website")
    public void the_user_wants_to_go_to_payment_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        setWaitTime();

    }
    @When("The user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy() {
        guru99GatewayHome.getQuantityDropDown("1");
        guru99GatewayHome.getBuyNow();


    }
    @Then("The user wants to provide payment information")
    public void the_user_wants_to_provide_payment_information() {
        guru99GatewayPaymentPage.setCardNumber("4567891234786514");
        guru99GatewayPaymentPage.setMonth("10");
        guru99GatewayPaymentPage.setYear("2022");
        guru99GatewayPaymentPage.setCvv_code("123");

    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        guru99GatewayPaymentPage.setPayButton();

    }
    @Then("The user wants to verify message is successful")
    public void the_user_wants_to_verify_message_is_successful() {
        guru99GatewayOrderSuccess.setVerificationText("Payment successfull!");}

    @When("The user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
        guru99GatewayHome.getQuantityDropDown(string);
        guru99GatewayHome.getBuyNow();
    }
    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        guru99GatewayPaymentPage.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        guru99GatewayPaymentPage.setMonth(string);
    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        guru99GatewayPaymentPage.setYear(string);
    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99GatewayPaymentPage.setCvv_code(string);
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99GatewayOrderSuccess.setVerificationText(string);
    }
    @Then("The user wants to provide enter payment information as following")
    public void the_user_wants_to_provide_enter_payment_information_as_following(Map<String,String> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get("CNumber"));
        guru99GatewayPaymentPage.setMonth(dataTable.get("EMonth"));
        guru99GatewayPaymentPage.setYear(dataTable.get("EYear"));
        guru99GatewayPaymentPage.setCvv_code(dataTable.get("CvvCode"));

    }

    @When("The user wants to buy elephant toy as following quantity")
    public void the_user_wants_to_buy_elephant_toy_as_following_quantity(List<List<String>> dataTable) {
        guru99GatewayHome.getQuantityDropDown(dataTable.get(1).get(0));
        guru99GatewayHome.getBuyNow();
    }
    @Then("The user wants to provide enter payment information as following as a List")
    public void the_user_wants_to_provide_enter_payment_information_as_following_as_a_list(List<List<String>> dataTable) {
        guru99GatewayPaymentPage.setCardNumber(dataTable.get(1).get(0));
        guru99GatewayPaymentPage.setMonth(dataTable.get(1).get(1));
        guru99GatewayPaymentPage.setYear(dataTable.get(1).get(2));
        guru99GatewayPaymentPage.setCvv_code(dataTable.get(1).get(3));
    }


}
