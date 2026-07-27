package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import com.BaseClass;
import com.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	PomClass t1 = new PomClass(driver);
	
	@Given("User Launches the Application")
	public void user_launches_the_application() {
	    maximize();
	}
	@Given("User Clicks the Test Online Button")
	public void user_clicks_the_test_online_button() {
	    moveToElement(t1.testOnlineBtn);
	    clickElement(t1.testOnlineBtn);
	}
	@Given("User Clicks the link given Below")
	public void user_clicks_the_link_given_below() {
	    moveToElement(t1.testLink);
	    clickElement(t1.testLink);
	    WindowHandletoChild();
	}
	@Given("User Clicks the Suitable profile for test")
	public void user_clicks_the_suitable_profile_for_test() {
		moveToElement(t1.demoPref);
	    clickElement(t1.demoPref);
	}
	@Given("User Enters the Password")
	public void user_enters_the_password() {
	   sendKeys(t1.passField, "demo");
	   clickElement(t1.loginBtn);
	}
	@Then("User Navigated into the Dashboard")
	public void user_navigated_into_the_dashboard() {
	    String Actual = getText(t1.dashboardVali);
	    String Expected = "My Dashboard";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("User Clicks the Third Party option presented in the dashboard")
	public void user_clicks_the_third_party_option_presented_in_the_dashboard() {
	   clickElement(t1.thirdPartyBtn);
	}
	@When("User Clicks the New Third party option")
	public void user_clicks_the_new_third_party_option() {
	    clickElement(t1.newThirdParty);
	}
	@When("User enters the {string} name")
	public void user_enters_the_name(String Thirdparty) {
	    sendKeys(t1.thirdPartyName, Thirdparty);
	}
	@When("User enters the {string}")
	public void user_enters_the(String alias) {
	   sendKeys(t1.aliasName, alias);
	}
	@When("User Clicks the prospectus checkbox")
	public void user_clicks_the_prospectus_checkbox() {
	    clickElement(t1.prospCb);
	}
	@When("User Enters the {string} in the address column")
	public void user_enters_the_in_the_address_column(String Address) {
	    sendKeys(t1.adressField, Address);
	}
	@When("User Enters the {string} in the zipcode column")
	public void user_enters_the_in_the_zipcode_column(String Zipcode) {
	  sendKeys(t1.zipCode, Zipcode);
	}
	@When("User Enters the {string} city column")
	public void user_enters_the_city_column(String City) {
	    sendKeys(t1.cityName, City);
	}
	@When("User Enters the {string} phone column")
	public void user_enters_the_phone_column(String Phone) {
	    sendKeys(t1.phoneField, Phone);
	}
	@When("User Eners the {string} mobile column")
	public void user_eners_the_mobile_column(String Mobile ) {
	    sendKeys(t1.mobileField, Mobile);
	}
	@When("User Enters the {string} fax column")
	public void user_enters_the_fax_column(String Fax ) {
	    sendKeys(t1.faxFiled, Fax);
	}
	@When("User Enters the {string} mail column")
	public void user_enters_the_mail_column(String Email) {
	    sendKeys(t1.emailField, Email);
	}
	@When("User selects the refuse mass email option")
	public void user_selects_the_refuse_mass_email_option() {
	   clickElement(t1.refuseMail);
	   sendKeys(t1.yesRefEmail, "Yes");
	   enterKey(t1.yesRefEmail);
	}
	@When("User Enters the {string} number")
	public void user_enters_the_number(String TIN ) {
	    sendKeys(t1.tinNo, TIN);
	}
	@When("User Enters the {string} TAX number")
	public void user_enters_the_tax_number(String SRVC) {
	   sendKeys(t1.srvcNo, SRVC);
	}
	@When("User Enters the {string} prf column")
	public void user_enters_the_prf_column(String PAN) {
	   sendKeys(t1.panNo, PAN);
	}
	@When("User Enters the {string} prof column")
	public void user_enters_the_prof_column(String Prof4) {
	  sendKeys(t1.prof4Field, Prof4);
	}
	@When("User Enters the {string} Id")
	public void user_enters_the_id(String VAT) {
	  sendKeys(t1.prof5Field, VAT);
	}
	@When("User Select the Sales Tax Checkbox")
	public void user_select_the_sales_tax_checkbox() {
	   clickElement(t1.sertaxCb);
	}
	@When("User select the Second tax")
	public void user_select_the_second_tax() {
	  clickElement(t1.sectaxCb);
	}
	@When("User Select the third Tax")
	public void user_select_the_third_tax() {
	    clickElement(t1.thirdtaxCb);
	}
	@When("User Clicks more option")
	public void user_clicks_more_option() {
	    clickElement(t1.moreOption);
	}
	@When("User Selects the Third Party Type")
	public void user_selects_the_third_party_type() {
	    clickElement(t1.thirdPartyType);
	    sendKeys(t1.typeField, "Startup");
	    enterKey(t1.typeField);
	}
	@When("User Selects the workforce")
	public void user_selects_the_workforce() {
	   clickElement(t1.workForce);
	   sendKeys(t1.forceField, "51-100");
	   enterKey(t1.forceField);
	   
	}
	@When("User Select the establishment of the company date")
	public void user_select_the_establishment_of_the_company_date() {
	   clickElement(t1.comStartDate);
		sendKeys(t1.comStartDate, "28/06/2025");
	    
	}
	@When("User Enters the {string} of the company")
	public void user_enters_the_of_the_company(String Capital ) {
	   sendKeys(t1.comCaptial, Capital);
	}
	@When("User select the default language")
	public void user_select_the_default_language() {
	   clickElement(t1.language);
	   sendKeys(t1.langField, "English");
	   enterKey(t1.langField);
	}
	

	@When("User Select the payment type")
	public void user_select_the_payment_type() {
	   clickElement(t1.paymentTerms);
	   sendKeys(t1.termField, "30");
	   enterKey(t1.termField);
	}



	@When("User Select the payment method")
	public void user_select_the_payment_method() {
	    clickElement(t1.paymentType);
	    sendKeys(t1.methodField, "cash");
	    enterKey(t1.methodField);
	}
	@When("User Select the Currency")
	public void user_select_the_currency() {
	    
	}
	@When("User enters the {string} height column")
	public void user_enters_the_height_column(String height) {
	    sendKeys(t1.heightField, height);
	}
	@When("User Enters the {string} weight column")
	public void user_enters_the_weight_column(String weight) {
	    sendKeys(t1.weightField, weight);
	}
	@When("User Enters the {string} profes column")
	public void user_enters_the_profes_column(String profession) {
	    sendKeys(t1.professionField, profession);
	}
	@When("User Select the Birth Date")
	public void user_select_the_birth_date() {
	    sendKeys(t1.birthDate, "27/06/2001");
	    
	}
	@When("User Clicks the Create third party button")
	public void user_clicks_the_create_third_party_button() {
		moveToElement(t1.createBtn);
	    clickElement(t1.createBtn);
	}
	@Then("User Creates the Third party prospectus Sucessfully")
	public void user_creates_the_third_party_prospectus_sucessfully() {
	    String Actual = getText(t1.validation);
	    String Expected = "Naveenraj";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	
	@When("User Clicks the thirdparty option")
	public void user_clicks_the_thirdparty_option() {
	    clickElement(t1.thirdPartyBtn);
	}
	@When("User Clicks the List option")
	public void user_clicks_the_list_option() {
	    clickElement(t1.listOption);
	}
	@When("User enters the third party name in the search field")
	public void user_enters_the_third_party_name_in_the_search_field() {
	   sendKeys(t1.listsearch, "naveenraj");
	   enterKey(t1.listsearch);
	}
	@Then("the created third party name will appear sucessfully")
	public void the_created_third_party_name_will_appear_sucessfully() {
	    String Actual = getText(t1.listvali);
	    String Expected = "Naveenraj (kiaq)";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("User clicks the third party profile")
	public void user_clicks_the_third_party_profile() {
	   clickElement(t1.thirdpartyPro);
	}
	@When("User clicks the Contact and address details")
	public void user_clicks_the_contact_and_address_details() {
	    
	    clickElement(t1.condetails);
	    clickElement(t1.conPro);
	}
	@When("User clicks the Diasble button")
	public void user_clicks_the_diasble_button() {
		moveToElement(t1.disableBtn);
		clickElement(t1.disableBtn);
	   
	}
	@Then("Status turns into Closed as expected")
	public void status_turns_into_closed_as_expected() {
	    String Actual = getText(t1.disableVali);
	    String Expected ="Closed";
	   assertEquals(Expected, Actual);
	   System.out.println(Actual);
	}
	@Then("User Again Click the Reactivated")
	public void user_again_click_the_reactivated() {
	    moveToElement(t1.reactivateBtn);
	    clickElement(t1.reactivateBtn);
	}
	@Then("Status turns into Open as expected")
	public void status_turns_into_open_as_expected() {
	    String Actual = getText(t1.reactivateVali);
	    String Expected = "Open";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("User Clicks the modify button")
	public void user_clicks_the_modify_button() {
	   moveToElement(t1.modifyBtn);
	   clickElement(t1.modifyBtn);
	}
	@When("User edit the {string} in the page")
	public void user_edit_the_in_the_page(String jobposition) {
	    sendKeys(t1.jobField, jobposition);
	    moveToElement(t1.saveBtn);
	    clickElement(t1.saveBtn);
	}
	@Then("modification of the job position is sucessfull")
	public void modification_of_the_job_position_is_sucessfull() {
	    String Actual = getText(t1.modifyVali);
	    String Expected = "software test engineer";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@Given("user clicks the services module pressented in the dashboard")
	public void user_clicks_the_services_module_pressented_in_the_dashboard() {
	    clickElement(t1.servicesBtn);
	}
	@When("user clicks the new services option")
	public void user_clicks_the_new_services_option() {
	    clickElement(t1.newservices);
	    
	}
	@When("user enters the {string} in the product column")
	public void user_enters_the_in_the_product_column(String productref) {
	    sendKeys(t1.perfRef, productref);
	}
	@When("user enters the {string} in the label column")
	public void user_enters_the_in_the_label_column(String label) {
	   sendKeys(t1.labelField, label);
	}
	@When("user select the sell status")
	public void user_select_the_sell_status() {
	   clickElement(t1.sellStatus);
	   sendKeys(t1.sellField, "for sale");
	   enterKey(t1.sellField);
	}
	@When("user select the purchase status")
	public void user_select_the_purchase_status() {
	    clickElement(t1.purchaseStatus);
	    sendKeys(t1.purchaseField, "Not for purchase");
	    enterKey(t1.purchaseField);
	}
	@When("user enters the {string} in the column")
	public void user_enters_the_in_the_column(String description) {
	 switchToFrame(t1.descriptionField);
	 clickElement(t1.desFiled);
	 sendKeys(t1.desFiled, description);
	 SwitchtoParentFrame();
		
	}
	@When("user enters the {string} in the url column")
	public void user_enters_the_in_the_url_column(String publicUrl) {
	    sendKeys(t1.urlField, publicUrl);
	}
	@When("user enters the {string} in the duration column")
	public void user_enters_the_in_the_duration_column(String duration) {
		moveToElement(t1.durationField);
	    sendKeys(t1.durationField, duration);
	}

	@When("user click the mandatory period check box")
	public void user_click_the_mandatory_period_check_box() {
	    clickElement(t1.mandatoryCb);
	}
	@When("user enters the {string} in the notes column")
	public void user_enters_the_in_the_notes_column(String notes) {
	  sendKeys(t1.noteField, notes);
	}
	@When("user enters the {string} in the selling column")
	public void user_enters_the_in_the_selling_column(String sellingPrice) {
	   sendKeys(t1.sellPriceField, sellingPrice);
	}
	@When("user enters the {string} in the min column")
	public void user_enters_the_in_the_min_column(String minimumSellingPricering) {
	    sendKeys(t1.minimumPriceField, minimumSellingPricering);
	}
	@When("User Select the tax rate")
	public void user_select_the_tax_rate() {
	   clickElement(t1.taxRate);
	   sendKeys(t1.taxRateField, "12.5");
	   enterKey(t1.taxRateField);
	}
	@When("user select the account code sale")
	public void user_select_the_account_code_sale() {
	    clickElement(t1.acccodesale);
	    sendKeys(t1.saleField, "142");
	    enterKey(t1.saleField);
	}
	@When("user select the account code sale export")
	public void user_select_the_account_code_sale_export() {
	    clickElement(t1.saleexp);
	    sendKeys(t1.saleExpField, "109");
	    enterKey(t1.saleExpField);
	}
	@When("user select the account code purchase")
	public void user_select_the_account_code_purchase() {
	   clickElement(t1.purchase);
	   sendKeys(t1.accPurchaseField, "280");
	   enterKey(t1.accPurchaseField);
	}
	@When("user select the account code purchase import")
	public void user_select_the_account_code_purchase_import() {
	   clickElement(t1.purImport);
	   sendKeys(t1.purImportField, "174");
	   enterKey(t1.purImportField);
	}
	@When("User clicks the create button")
	public void user_clicks_the_create_button() {
	    clickElement(t1.createBtn);
	}
	@Then("User creates the new services sucessfully")
	public void user_creates_the_new_services_sucessfully() {
	    String  Actual = getText(t1.servicesVali);
	    String Expected = "Web_Application";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	





}
