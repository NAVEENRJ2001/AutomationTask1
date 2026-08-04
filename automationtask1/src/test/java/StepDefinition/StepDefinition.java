package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.sql.ClientInfoStatus;

import com.BaseClass;
import com.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

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
	public void user_eners_the_mobile_column(String Mobile) {
		sendKeys(t1.mobileField, Mobile);
	}

	@When("User Enters the {string} fax column")
	public void user_enters_the_fax_column(String Fax) {
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
	public void user_enters_the_number(String TIN) {
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
	public void user_enters_the_of_the_company(String Capital) {
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
		String Expected = "Closed";
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
		clickElement(t1.serCreateBtn);
	}

	@Then("User creates the new services sucessfully")
	public void user_creates_the_new_services_sucessfully() {
		String Actual = getText(t1.servicesVali);
		String Expected = "Web_Application_demo1";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("User Clicks the services option")
	public void user_clicks_the_services_option() {
		clickElement(t1.servicesBtn);
	}

	@When("User Clicks the List option in services module")
	public void user_clicks_the_list_option_in_services_module() {
		clickElement(t1.serListBtn);
	}

	@When("User enters the {string} name in the search field")
	public void user_enters_the_name_in_the_search_field(String productref) {
		sendKeys(t1.serListField, productref);
		enterKey(t1.serListField);
	}

	@Then("the created productref name will appear sucessfully")
	public void the_created_productref_name_will_appear_sucessfully() {
		String Actual = getText(t1.serListVali);
		String Expected = "Web_Application_demo2";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the product ref profile")
	public void user_clicks_the_product_ref_profile() {
		clickElement(t1.productprofile);
	}

	@When("user clicks the modify button presented in the services")
	public void user_clicks_the_modify_button_presented_in_the_services() {
		moveToElement(t1.serModifyBtn);
		clickElement(t1.serModifyBtn);
	}

	@When("user changed the {string} in services")
	public void user_changed_the_in_services(String string) {
		sendKeys(t1.labelModField, string);
	}

	@When("user changed the sell status as not for sale")
	public void user_changed_the_sell_status_as_not_for_sale() {
		dropDown(t1.sellStatusModi, "Not for sale");
		enterKey(t1.sellStatusModi);
	}

	@When("user clicks the save button")
	public void user_clicks_the_save_button() {
		clickElement(t1.SersaveBtn);
	}

	@Then("user modify the changes sucessfully as {string}")
	public void user_modify_the_changes_sucessfully_as(String expected) {
		switch (expected) {
		case "labelstatus":
			String Actual = getText(t1.modifyVali1);
			String Expected = "Software Company";
			assertEquals(Expected, Actual);
			System.out.println(Actual);
			break;

		case "sellstatus":
			String Actual1 = getText(t1.modifyVali2);
			String Expected1 = "Not for sale";
			assertEquals(Expected1, Actual1);
			System.out.println(Actual1);
			break;
		}
	}

	@When("user clicks the project option in the dashboard")
	public void user_clicks_the_project_option_in_the_dashboard() {
		clickElement(t1.projectBtn);
	}

	@When("user clicks the new project")
	public void user_clicks_the_new_project() {
		clickElement(t1.newProject);
	}

	@When("user enters the {string} in the labelcolumn")
	public void user_enters_the_in_the_labelcolumn(String label) {
		sendKeys(t1.proLabelField, label);
	}

	@When("user clicks the usage checkbox")
	public void user_clicks_the_usage_checkbox() {
		clickElement(t1.usageCb);
	}

	@When("user enters the {string} in the thirdparty column")
	public void user_enters_the_in_the_thirdparty_column(String thirdparty) {
		clickElement(t1.thirdpartyBox);
		sendKeys(t1.thirdpartyField, thirdparty);
		enterKey(t1.thirdpartyField);
	}

	@When("user enters the {string} in the lead column")
	public void user_enters_the_in_the_lead_column(String leadstatus) {
		clickElement(t1.leadStatusBox);
		sendKeys(t1.leadStatusField, leadstatus);
		enterKey(t1.leadStatusField);
	}

	@When("user enter the {string} in the amount column")
	public void user_enter_the_in_the_amount_column(String leadamount) {
		sendKeys(t1.leadAmountField, leadamount);
	}

	@When("user enters the {string} in the budget column")
	public void user_enters_the_in_the_budget_column(String budget) {
		sendKeys(t1.budgetField, budget);
	}

	@When("user enters the {string} in the date column")
	public void user_enters_the_in_the_date_column(String date) {
		sendKeys(t1.dateOfEnd, date);
	}

	@When("user enters the {string} in the project description column")
	public void user_enters_the_in_the_project_description_column(String description) {
		switchToFrame(t1.proDescriptionField);
		clickElement(t1.prodesField);
		sendKeys(t1.prodesField, description);
		SwitchtoParentFrame();
	}

	@When("user select the tag")
	public void user_select_the_tag() {

	}

	@When("user enters the {string} in the visibility column")
	public void user_enters_the_in_the_visibility_column(String visibility) {
		clickElement(t1.visibilityBox);
		sendKeys(t1.visibilityField, visibility);
		enterKey(t1.visibilityField);
	}

	@When("user enters the {string} status in the column")
	public void user_enters_the_status_in_the_column(String assignme) {
		clickElement(t1.assignmeBox);
		sendKeys(t1.assignmeField, assignme);
		enterKey(t1.assignmeField);
	}

	@When("user enters the {string} in the priority column")
	public void user_enters_the_in_the_priority_column(String priority) {
		clickElement(t1.priorityBox);
		sendKeys(t1.priorityField, priority);
		enterKey(t1.priorityField);
	}

	@When("user clicks the create draft button")
	public void user_clicks_the_create_draft_button() {
		clickElement(t1.proCreateBtn);
	}

	@Then("user creats the new project Sucessfully")
	public void user_creats_the_new_project_sucessfully() {
		String Actual = getText(t1.proValidation);
		String Expected = "Automation[Naveenraj (kiaq)]".trim();
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("User Clicks the project option")
	public void user_clicks_the_project_option() {
		clickElement(t1.projectBtn);
	}

	@When("User Clicks the List option in projects module")
	public void user_clicks_the_list_option_in_projects_module() {
		clickElement(t1.proListBtn);
	}

	@When("User enters the {string} name in the project search field")
	public void user_enters_the_name_in_the_project_search_field(String projectlabel) {
		sendKeys(t1.proLabelSearch, projectlabel);
		enterKey(t1.proLabelSearch);
	}

	@Then("the created project label  name will appear sucessfully")
	public void the_created_project_label_name_will_appear_sucessfully() {
		moveToElement(t1.proSearchVali);
		String Actual = getText(t1.proSearchVali);
		String Expected = "Automation";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the project option for task creation")
	public void userClicksTheProjectOptionForTaskCreation() {
		clickElement(t1.projectBtn);
	}

	@When("user clicks the new task option")
	public void userClicksTheNewTaskOption() {
		clickElement(t1.newTask);
	}

	@When("user enters the {string} in the task column")
	public void userEntersTheInTheTaskColumn(String label) {
		sendKeys(t1.taskLabelField, label);
	}

	@When("user enters the {string} details in the child project column")
	public void userEntersTheDetailsInTheChildProjectColumn(String Childproject) {
		clickElement(t1.chlidProBox);
		sendKeys(t1.chlidProField, Childproject);
		enterKey(t1.chlidProField);
	}

	@When("user enters the {string} details in the assigned to column")
	public void userEntersTheDetailsInTheAssignedToColumn(String assignedto) {
		clickElement(t1.assignedToBox);
		sendKeys(t1.assignedToField, assignedto);
		enterKey(t1.assignedToField);
	}

	@When("user select the billable details")
	public void userSelectTheBillableDetails() {
		dropDown(t1.billableBox, "Yes");
	}

	@When("user enters the startdate in the start dae column")
	public void userEntersTheStartdateInTheStartDaeColumn() {
		clickElement(t1.startDate);
	}

	@When("user enters the {string} in the end date column")
	public void userEntersTheInTheEndDateColumn(String enddate) {
		sendKeys(t1.endDateField, enddate);
		dropDownByValue(t1.endDateHr, "10");
		dropDownByValue(t1.endDateMin, "45");
	}

	@When("user enters the {string} in the workload column")
	public void userEntersTheInTheWorkloadColumn(String workload) {
		sendKeys(t1.plannedWorkload, workload);
	}

	@When("user enters the realprogress in the proress column")
	public void userEntersTheRealprogressInTheProressColumn() {
		dropDownByValue(t1.realProgressBox, "90");
	}

	@When("user enters the {string} in task description column")
	public void userEntersTheInTaskDescriptionColumn(String description) {
		switchToFrame(t1.taskDescription);
		clickElement(t1.taskDesField);
		sendKeys(t1.taskDesField, description);
		SwitchtoParentFrame();
	}

	@When("user enters the {string} of the task")
	public void userEntersTheOfTheTask(String budget) {
		sendKeys(t1.taskbudgetField, budget);
	}

	@When("user clicks the add button")
	public void userClicksTheAddButton() {
		clickElement(t1.taskAddButton);
	}

	@Then("user creats the new task sucessfully")
	public void userCreatsTheNewTaskSucessfully() {
		String Actual = getText(t1.taskVali);
		String Expected = "Automation Project";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the commerce area option in  the dashboard")
	public void userClicksTheCommerceAreaOptionInTheDashboard() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the new proposal option")
	public void userClicksTheNewProposalOption() {
		clickElement(t1.newProposal);
	}

	@When("user enters the {string} name in the customer column")
	public void userEntersTheNameInTheCustomerColumn(String refcustomer) {
		sendKeys(t1.refCustomerField, refcustomer);
	}

	@When("user enters the {string} thirdpart name in the column")
	public void userEntersTheThirdpartNameInTheColumn(String customer) {
		clickElement(t1.customerBox);
		sendKeys(t1.customerBoxField, customer);
		enterKey(t1.customerBoxField);
	}

	@When("user enters the {string} of the payment")
	public void userEntersTheOfThePayment(String source) {
		clickElement(t1.sourceBox);
		sendKeys(t1.sourceBoxField, source);
		enterKey(t1.sourceBoxField);
	}

	@When("user enters the {string} of the order")
	public void userEntersTheOfTheOrder(String availability) {
		clickElement(t1.delayBox);
		sendKeys(t1.delayBoxField, availability);
		enterKey(t1.delayBoxField);
	}

	@When("user enters the {string} date of the order")
	public void userEntersTheDateOfTheOrder(String delivery) {
		sendKeys(t1.deliveryDateField, delivery);
	}

	@When("user Enters the {string} for create commercial proposal")
	public void userEntersTheForCreateCommercialProposal(String project) {
		clickElement(t1.projectBox);
		sendKeys(t1.projectBoxField, project);
		enterKey(t1.projectBoxField);
	}

	@When("user enters the {string} value for proposal")
	public void userEntersTheValueForProposal(String currency) {
		clickElement(t1.currencyBox);
		sendKeys(t1.currencyBoxField, currency);
		enterKey(t1.currencyBoxField);
	}

	@When("user Enters the {string} notes for the proposal")
	public void userEntersTheNotesForTheProposal(String publics) {
		sendKeys(t1.publicNotesField, publics);
	}

	@When("user enters the {string} notes for the commercial proposal")
	public void userEntersTheNotesForTheCommercialProposal(String privates) {
		sendKeys(t1.privateNotesField, privates);
	}

	@When("user clicks the propsal create draft button")
	public void userClicksThePropsalCreateDraftButton() {
		clickElement(t1.proposalCreateBtn);
	}

	@Then("user creates the proposal sucessfully")
	public void userCreatesTheProposalSucessfully() {
		String Actual = getText(t1.proposalVali);
		String Expected = "- Automation Project";
		assertEquals(Actual, Expected);
		System.out.println(Actual);
	}

	@When("user clicks the commerce option in dashboard for list")
	public void userClicksTheCommerceOptionInDashboardForList() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the list option")
	public void userClicksTheListOption() {
		clickElement(t1.proposalList);
	}

	@When("user enters the {string} in the search bar")
	public void userEntersTheInTheSearchBar(String refcustomer) {
		sendKeys(t1.searchRefCus, refcustomer);
	}

	@Then("user gets the created proposal")
	public void userGetsTheCreatedProposal() {
		String Actual = getText(t1.proposalSearchVali);
		String Expected = "Amirtha";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user Clicks the commerce option in dashboard for create sales order")
	public void userClicksTheCommerceOptionInDashboardForCreateSalesOrder() {
		clickElement(t1.commerceBtn);

	}

	@When("user clicks the new sales order option")
	public void userClicksTheNewSalesOrderOption() {
		clickElement(t1.newSale);
	}

	@When("user enters the {string} in the sale order")
	public void userEntersTheInTheSaleOrder(String refcus) {
		sendKeys(t1.salesClientField, refcus);
	}

	@When("user enters the {string} for the sale order creation")
	public void userEntersTheForTheSaleOrderCreation(String customer) {
		clickElement(t1.saleCustomerBox);
		sendKeys(t1.saleCustomerBoxField, customer);
		enterKey(t1.saleCustomerBoxField);
	}

	@When("user enters the planned {string} date in the sale order")
	public void userEntersThePlannedDateInTheSaleOrder(String deliver) {
		sendKeys(t1.plannedDeliveryDate, deliver);
		dropDownByValue(t1.deliveryHr, "17");
		dropDownByValue(t1.deliveryMin, "00");
	}

	@When("user enters the availability {string} in the sale order")
	public void userEntersTheAvailabilityInTheSaleOrder(String delay) {
		clickElement(t1.saleDelayBox);
		sendKeys(t1.saleDelayBoxField, delay);
		enterKey(t1.saleDelayBoxField);
	}

	/*
	 * @When("user enters the {string} method in the column") public void
	 * userEntersTheMethodInTheColumn(String shipping) {
	 * clickElement(t1.saleShippingBox); sendKeys(t1.saleShippingField, shipping);
	 * enterKey(t1.saleShippingField);
	 */
	// }

	@When("user enter the {string} of the cash for the sale order")
	public void userEnterTheOfTheCashForTheSaleOrder(String source) {
		clickElement(t1.saleSourceBox);
		sendKeys(t1.saleSourceBoxField, source);
		enterKey(t1.saleSourceBoxField);
	}

	@When("user enters the {string} for the create the sale order")
	public void userEntersTheForTheCreateTheSaleOrder(String project) {
		clickElement(t1.saleProjectBox);
		sendKeys(t1.saleProjectBoxField, project);
		enterKey(t1.saleProjectBoxField);
	}

	@When("user enter the {string} terms for the sale order")
	public void userEnterTheTermsForTheSaleOrder(String inco) {
		clickElement(t1.incoTermsBox);
		sendKeys(t1.incoTermField, inco);
		enterKey(t1.incoTermField);
	}

	@When("user enters the {string} field in the sale order creation")
	public void userEntersTheFieldInTheSaleOrderCreation(String custom) {
		sendKeys(t1.customField, custom);
	}

	@When("user enters the {string} notes for sale order")
	public void userEntersTheNotesForSaleOrder(String publics) {
		sendKeys(t1.salePublicNotesField, publics);
	}

	@When("user enters the {string} notes for creation of sale order")
	public void userEntersTheNotesForCreationOfSaleOrder(String privates) {
		sendKeys(t1.salePrivateNotesField, privates);
	}

	@When("user clicks the sale order create draft button")
	public void userClicksTheSaleOrderCreateDraftButton() {
		clickElement(t1.saleCreateBtn);
	}

	@Then("user creates the sale order sucessfully")
	public void userCreatesTheSaleOrderSucessfully() {
		String Actual = getText(t1.saleCreateVali);
		assertEquals(Actual, getText(t1.saleCreateVali));
		System.out.println(Actual);
	}

	@When("user clicks the commerce option for sale order validation")
	public void userClicksTheCommerceOptionForSaleOrderValidation() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the list in sale order section")
	public void userClicksTheListInSaleOrderSection() {
		clickElement(t1.saleList);
	}

	@When("user enter the {string} name in the thirdparty column for sale search")
	public void userEnterTheNameInTheThirdpartyColumnForSaleSearch(String thirdpart) {
		sendKeys(t1.saleSearchBox, thirdpart);
		enterKey(t1.saleSearchBox);
	}

	@Then("User gets the created sale order sucessfully")
	public void userGetsTheCreatedSaleOrderSucessfully() {
		String Actual = getText(t1.saleSearchVali);
		String Expected = "Gokul";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the new price request option")
	public void userClicksTheNewPriceRequestOption() {
		clickElement(t1.commerceBtn);
		clickElement(t1.newPriceReq);
	}

	@When("user enters the {string} in the new price request list")
	public void userEntersTheInTheNewPriceRequestList(String vendor) {
		clickElement(t1.vendorBox);
		sendKeys(t1.vendorField, vendor);
		enterKey(t1.vendorField);
	}

	@When("user enters the {string} terms in the new price list")
	public void userEntersTheTermsInTheNewPriceList(String payment) {
		clickElement(t1.termBox);
		sendKeys(t1.payTermField, payment);
		enterKey(t1.payTermField);
	}

	@When("user enters the {string} date in the new price list")
	public void userEntersTheDateInTheNewPriceList(String delivery) {
		sendKeys(t1.ddField, delivery);
	}

	@When("user enters the {string} details in the new price list")
	public void userEntersTheDetailsInTheNewPriceList(String project) {
		clickElement(t1.proBox);
		sendKeys(t1.proBoxField, project);
		enterKey(t1.proBoxField);
	}

	@When("user clicks the new price request create button")
	public void userClicksTheNewPriceRequestCreateButton() {
		clickElement(t1.priceCreateBtn);
	}

	@Then("user creates the new price request sucessfully")
	public void userCreatesTheNewPriceRequestSucessfully() {
		String Actual = getText(t1.priceReqVali);
		assertEquals(Actual, getText(t1.priceReqVali));
		System.out.println(Actual);
	}

	@When("user clicks the commerce option for new price  validation")
	public void userClicksTheCommerceOptionForNewPriceValidation() {
		clickElement(t1.commerceBtn);

	}

	@When("user clicks the list in new price request section")
	public void userClicksTheListInNewPriceRequestSection() {
		clickElement(t1.priceList);
	}

	@When("user enter the {string} name in the vendor column for new price search")
	public void userEnterTheNameInTheVendorColumnForNewPriceSearch(String vendor) {
		sendKeys(t1.vendorSearch, vendor);
		enterKey(t1.vendorSearch);
	}

	@Then("User gets the created new price sucessfully")
	public void userGetsTheCreatedNewPriceSucessfully() {
		String Actual = getText(t1.priceSearchVali);
		String Expected = "KVN productions";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the commerce option for the create new purchase order")
	public void userClicksTheCommerceOptionForTheCreateNewPurchaseOrder() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the new purchase order option")
	public void userClicksTheNewPurchaseOrderOption() {
		clickElement(t1.newPurchase);
	}

	@When("user enters the {string} in the new purchase order")
	public void userEntersTheInTheNewPurchaseOrder(String vendor) {
		clickElement(t1.purchaseVendorBox);
		sendKeys(t1.purchaseVendorField, vendor);
		enterKey(t1.purchaseVendorField);
	}

	@When("user enters the {string} in the ref column")
	public void userEntersTheInTheRefColumn(String refvendor) {
		sendKeys(t1.refVendorField, refvendor);
	}

	@When("user enters the {string} delivery date of the purchase order")
	public void userEntersTheDeliveryDateOfThePurchaseOrder(String palnned) {
		sendKeys(t1.purchaseDdField, palnned);
	}

	@When("user enters the {string} for the new purchase order")
	public void userEntersTheForTheNewPurchaseOrder(String project) {
		clickElement(t1.projectBox);
		sendKeys(t1.projectBoxField, project);
		enterKey(t1.projectBoxField);
	}

	@When("user enters the {string} for the creation of new purchase")
	public void userEntersTheForTheCreationOfNewPurchase(String currency) {
		clickElement(t1.currencyBox);
		sendKeys(t1.currencyBoxField, currency);
		enterKey(t1.currencyBoxField);
	}

	@When("user enters the {string} for the purchase")
	public void userEntersTheForThePurchase(String publicnote) {
		sendKeys(t1.publicNotesField, publicnote);
	}

	@When("user Enters the {string} for the new purchase")
	public void userEntersTheForTheNewPurchase(String privatenote) {
		sendKeys(t1.privateNotesField, privatenote);
	}

	@When("user click the create button for new purchase")
	public void userClickTheCreateButtonForNewPurchase() {
		clickElement(t1.purchaseCreateBtn);
	}

	@Then("user creates the new purchase order sucessfully")
	public void userCreatesTheNewPurchaseOrderSucessfully() {
		String Actual = getText(t1.purchaseVali);
		assertEquals(Actual, getText(t1.purchaseVali));
		System.out.println(Actual);
	}

	@When("user clicks the commerce option for new purchase order  validation")
	public void userClicksTheCommerceOptionForNewPurchaseOrderValidation() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the list in new purchase order section")
	public void userClicksTheListInNewPurchaseOrderSection() {
		clickElement(t1.purchaselist);
	}

	@When("user enter the {string} name in the vendor column for new purchase search")
	public void userEnterTheNameInTheVendorColumnForNewPurchaseSearch(String refvendor) {
		sendKeys(t1.purchaseSearchField, refvendor);
		enterKey(t1.purchaseSearchField);
	}

	@Then("User gets the created new purchase order sucessfully")
	public void userGetsTheCreatedNewPurchaseOrderSucessfully() {
		String Actual = getText(t1.purchaseSearchVali);
		String Expeced = "Kathirvel";
		assertEquals(Expeced, Actual);
		System.out.println(Actual);
	}

	@When("user click the commerce option for creation of new contract")
	public void userClickTheCommerceOptionForCreationOfNewContract() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the new contract and subscription")
	public void userClicksTheNewContractAndSubscription() {
		clickElement(t1.newContract);
	}

	@When("user enters the {string} in the new contract")
	public void userEntersTheInTheNewContract(String refcustomer) {
		sendKeys(t1.refCustomerField2, refcustomer);
	}

	@When("user enters the {string} in the creation of new contract")
	public void userEntersTheInTheCreationOfNewContract(String refvendor) {
		sendKeys(t1.refVendor, refvendor);
	}

	@When("user enters the {string} in the new contract creation")
	public void userEntersTheInTheNewContractCreation(String thirdparty) {
		clickElement(t1.thirdpartyBox);
		sendKeys(t1.contarctThirdPrtyField, thirdparty);
		enterKey(t1.contarctThirdPrtyField);
	}

	@When("user enters the {string} in create of new contract")
	public void userEntersTheInCreateOfNewContract(String project) {
		clickElement(t1.projectBox);
		sendKeys(t1.contarctThirdPrtyField, project);
		enterKey(t1.contarctThirdPrtyField);
	}

	@When("user enters the {string} for the new contract")
	public void userEntersTheForTheNewContract(String publicnotes) {
		sendKeys(t1.publicNotesField, publicnotes);
	}

	@When("user enters the {string} for new subscription")
	public void userEntersTheForNewSubscription(String privatenotes) {
		sendKeys(t1.privateNotesField, privatenotes);
	}

	@When("user clicks the create button for new contract")
	public void userClicksTheCreateButtonForNewContract() {
		clickElement(t1.contractAddBtn);
	}

	@Then("user creates a new contract or subscription sucessfully")
	public void userCreatesANewContractOrSubscriptionSucessfully() {
		String Actual = getText(t1.contractVali);
		String Expected = " - Automation Project";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the commerce option for new contract validation")
	public void userClicksTheCommerceOptionForNewContractValidation() {
		clickElement(t1.commerceBtn);
	}

	@When("user clicks the list in new contract section")
	public void userClicksTheListInNewContractSection() {
		clickElement(t1.contractList);
	}

	@When("user enter the {string} vendor column for new purchase search")
	public void userEnterTheVendorColumnForNewPurchaseSearch(String refcustomer) {
		sendKeys(t1.contractSearchField, refcustomer);
		enterKey(t1.contractSearchField);
	}

	@Then("User gets the created new contract order sucessfully")
	public void userGetsTheCreatedNewContractOrderSucessfully() {
		String Actual = getText(t1.contractSearchVali);
		String Expected = "Hema";
		assertEquals(Expected, Actual);
		System.out.println(Actual);

	}

	@When("user clicks the billing module presented in the dashboard")
	public void userClicksTheBillingModulePresentedInTheDashboard() {
		clickElement(t1.billingBtn);
	}

	@When("user clicks the new customer invoice option")
	public void userClicksTheNewCustomerInvoiceOption() {
		clickElement(t1.newCustomerInvoice);
	}

	@When("user enters the {string} name in the column of the invoice")
	public void userEntersTheNameInTheColumnOfTheInvoice(String customer) {
		clickElement(t1.thirdpartyBox);
		sendKeys(t1.fields, customer);
		enterKey(t1.fields);
	}

	@When("user select the down payment check box")
	public void userSelectTheDownPaymentCheckBox() {
		clickElement(t1.downPaymentcb);
	}

	@When("user enters the {string} bank account in the column")
	public void userEntersTheBankAccountInTheColumn(String defaults) {
		clickElement(t1.bankAccount);
		sendKeys(t1.fields, defaults);
		enterKey(t1.fields);
	}

	@When("user enters the {string} of the cash in the column")
	public void userEntersTheOfTheCashInTheColumn(String source) {
		clickElement(t1.source);
		sendKeys(t1.fields, source);
		enterKey(t1.fields);
	}

	@When("user enters the {string} of the customer invoice")
	public void userEntersTheOfTheCustomerInvoice(String publicnote) {
		sendKeys(t1.publicNotesField, publicnote);
	}

	@When("user enters the {string} of the customer invoice creation")
	public void userEntersTheOfTheCustomerInvoiceCreation(String privateinvoice) {
		sendKeys(t1.privateNotesField, privateinvoice);
	}

	@When("user clicks the create draft button to create invoice")
	public void userClicksTheCreateDraftButtonToCreateInvoice() {
		clickElement(t1.increateBtn);
	}

	@Then("user created the customer invoice sucessfully")
	public void userCreatedTheCustomerInvoiceSucessfully() {
		String Actual = getText(t1.cusInVali);
		assertEquals(Actual, getText(t1.cusInVali));
		System.out.println(Actual);
	}

	@When("user clicks the new customer invoice list button")
	public void userClicksTheNewCustomerInvoiceListButton() {
		clickElement(t1.billingBtn);
		clickElement(t1.listCusIn);
	}

	@When("user sort by the {string} type")
	public void userSortByTheType(String payment) {
		clickElement(t1.listSearchBox);
		sendKeys(t1.fields, payment);
		enterKey(t1.fields);
	}

	@When("user click the link below")
	public void userClickTheLinkBelow() {
		moveToElement(t1.link);
		clickElement(t1.link);
	}

	@Then("user gets the created customer invoice")
	public void userGetsTheCreatedCustomerInvoice() {
		String Actual = getText(t1.cusInSeVali);
		String Expected = "(PROV27417)";
		assertEquals(Expected, Actual);
		System.out.println(Actual);
	}

	@When("user clicks the new vendor invoice option")
	public void userClicksTheNewVendorInvoiceOption() {
		clickElement(t1.billingBtn);
		clickElement(t1.newVendor);
	}

	@When("user enters the {string} thirdparty name")
	public void userEntersTheThirdpartyName(String vendor) {
		clickElement(t1.thirdpartyBox);
		sendKeys(t1.fields, vendor);
		enterKey(t1.fields);
	}

	@When("user enters the {string} info reference")
	public void userEntersTheInfoReference(String supplier) {
		sendKeys(t1.supplierRef, supplier);
	}

	@When("user enters the {string} of the vendor")
	public void userEntersTheOfTheVendor(String label) {
		sendKeys(t1.labelFiled1, label);
	}

	@When("user enters the date of the {string}")
	public void userEntersTheDateOfThe(String invoice) {
		sendKeys(t1.invoiceDate, invoice);
	}

	@When("user enters the {string} date of the payment")
	public void userEntersTheDateOfThePayment(String due) {
		sendKeys(t1.duePayment, due);
	}

	@When("user enters the {string} account to the vendor")
	public void userEntersTheAccountToTheVendor(String bank) {
		clickElement(t1.bankAccount);
		sendKeys(t1.fields, bank);
		enterKey(t1.fields);
	}

	@When("user enters the {string} description")
	public void userEntersTheDescription(String project) {
		clickElement(t1.projectBox);
		sendKeys(t1.fields, project);
		enterKey(t1.fields);
	}

	@When("user enters the {string} to the vendor")
	public void userEntersTheToTheVendor(String publicnote) {
		sendKeys(t1.publicNotesField, publicnote);
	}

	@When("user enters the {string} for the vendor creation")
	public void userEntersTheForTheVendorCreation(String privatenote) {
		sendKeys(t1.privateNotesField, privatenote);
	}

	@When("user Clicks the create button to vendor invoice creation")
	public void userClicksTheCreateButtonToVendorInvoiceCreation() {
		clickElement(t1.increateBtn);
	}

	@Then("user creates the vendor invoice sucessfully")
	public void userCreatesTheVendorInvoiceSucessfully() {

	}
	@When("user clicks the vendor list option")
	public void userClicksTheVendorListOption() {
	    
	}
	@When("user enters the {string} name in the search field")
	public void userEntersTheNameInTheSearchField(String string) {
	    
	}
	@Then("user gets the created new vendor")
	public void userGetsTheCreatedNewVendor() {
	    
	}
	
	@When("user clicks the ticket module in the dashboard")
	public void userClicksTheTicketModuleInTheDashboard() {
	    clickElement(t1.ticketsBtn);
	}
	@When("user clicks the new article option")
	public void userClicksTheNewArticleOption() {
	   clickElement(t1.newArticle);
	}
	@When("user enters the {string} in the column of article")
	public void userEntersTheInTheColumnOfArticle(String question) {
	    sendKeys(t1.questionField, question);
	}
	@When("user enters the {string} of the article")
	public void userEntersTheOfTheArticle(String language) {
	    clickElement(t1.artLang);
	    sendKeys(t1.fields, language);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} of ticket suggestion")
	public void userEntersTheOfTicketSuggestion(String creation) {
	   clickElement(t1.creationBox);
	   sendKeys(t1.fields, creation);
	   enterKey(t1.fields);
	}
	@When("user enters the {string} to article creation")
	public void userEntersTheToArticleCreation(String solution) {
	    switchToFrame(t1.solutionFiled);
	    clickElement(t1.solution);
	    sendKeys(t1.solution, solution);
	    SwitchtoParentFrame();
	}
	@When("user click the article creation button")
	public void userClickTheArticleCreationButton() {
	    clickElement(t1.createBn);
	}
	@Then("user creates the article sucessfully")
	public void userCreatesTheArticleSucessfully() {
	    String Actual = getText(t1.artCreatVali);
	    String Expected ="Who is our PM";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("user clicks the new ticket option")
	public void userClicksTheNewTicketOption() {
	    clickElement(t1.ticketsBtn);
	    clickElement(t1.newTicket);
	}
	@When("user enters the {string} for the ticket creation")
	public void userEntersTheForTheTicketCreation(String subject) {
	    sendKeys(t1.subjectField, subject);
	}
	@When("user enters the {string} of ticket")
	public void userEntersTheOfTicket(String message) {
	   switchToFrame(t1.messageField);
	   clickElement(t1.message);
	   sendKeys(t1.message, message);
	   SwitchtoParentFrame();
	}
	@When("user chooses the {string} of the ticket")
	public void userChoosesTheOfTheTicket(String thirdparty) {
	    clickElement(t1.thirdpartyBox);
	    sendKeys(t1.fields, thirdparty);
	    enterKey(t1.fields);
	}
	@When("user select the notify cb")
	public void userSelectTheNotifyCb() {
	    moveToElement(t1.creationcb);
	    clickElement(t1.creationcb);
	}
	@When("user enters the {string} for ticket")
	public void userEntersTheForTicket(String project) {
	   clickElement(t1.projectBox);
	   sendKeys(t1.fields, project);
	}
	@When("user clicks the create button for the ticket creation")
	public void userClicksTheCreateButtonForTheTicketCreation() {
	    clickElement(t1.createBtnTic);
	}
	@Then("user creates the ticket sucessfuly")
	public void userCreatesTheTicketSucessfuly() {
	    String Actual = getText(t1.ticketCreateVali);
	    assertEquals(Actual, getText(t1.ticketCreateVali));
	    System.out.println(Actual);
	}
	@When("user clicks the article list option")
	public void userClicksTheArticleListOption() {
	    clickElement(t1.ticketsBtn);
	    clickElement(t1.listArt);
	}
	@When("user enters the {string} for sorting")
	public void userEntersTheForSorting(String question) {
	  sendKeys(t1.queSearch, question);
	  enterKey(t1.queSearch);
	}
	@Then("user gets the created article")
	public void userGetsTheCreatedArticle() {
	    String Actual = getText(t1.queseachVali);
	    String expected = "who is your pm";
	    assertEquals(expected, Actual);
	    System.out.println(Actual);
	}
	@When("user clicks the list of the tickets")
	public void userClicksTheListOfTheTickets() {
	    clickElement(t1.ticketsBtn);
	    clickElement(t1.ticList);
	}
	@When("user enters the {string} in the sorting field")
	public void userEntersTheInTheSortingField(String subject) {
	  sendKeys(t1.ticSearch, subject);
	  enterKey(t1.ticSearch);
	}
	@Then("user gets the created ticket sucessfully")
	public void userGetsTheCreatedTicketSucessfully() {
	    String Actual = getText(t1.ticSearchVali);
	    String Expected = "computerScience";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("user clicks the agenda option in the dashboard")
	public void userClicksTheAgendaOptionInTheDashboard() {
	   clickElement(t1.agendaBtn);
	}
	@When("user clicks the new event option")
	public void userClicksTheNewEventOption() {
	    clickElement(t1.newEvent);
	}
	@When("user enters the {string} of the agenda")
	public void userEntersTheOfTheAgenda(String Title) {
	    sendKeys(t1.titleFiled, Title);
	}
	@When("user enters the {string} date of the event")
	public void userEntersTheDateOfTheEvent(String start) {
	    sendKeys(t1.startd, start);
	}
	@When("user enters the {string} date of the event agenda")
	public void userEntersTheDateOfTheEventAgenda(String end) {
	    sendKeys(t1.endd, end);
	}
	@When("user enters {string} in the event")
	public void userEntersInTheEvent(String location) {
	    sendKeys(t1.locationField, location);
	}
	@When("user enter {string} to of the agenda")
	public void userEnterToOfTheAgenda(String assingned) {
	    clickElement(t1.assignedBox);
	    sendKeys(t1.fields, assingned);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} of agenda meeting")
	public void userEntersTheOfAgendaMeeting(String resource) {
	    clickElement(t1.resourceBox);
	    sendKeys(t1.fields, resource);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} of the meeting")
	public void userEntersTheOfTheMeeting(String status) {
	    clickElement(t1.progressBox);
	    sendKeys(t1.fields, status);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} company for the event")
	public void userEntersTheCompanyForTheEvent(String related) {
	    clickElement(t1.thirdpartyBox);
	    sendKeys(t1.fields, related);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} for the event")
	public void userEntersTheForTheEvent(String project) {
	    clickElement(t1.projectBox);
	    sendKeys(t1.fields, project);
	    enterKey(t1.fields);
	}
	@When("user click the craete button for agenda creation")
	public void userClickTheCraeteButtonForAgendaCreation() {
	    clickElement(t1.createBtnEvent);
	}
	@Then("user creates the event sucessfully")
	public void userCreatesTheEventSucessfully() {
	    String Actual = getText(t1.eventCreateVali);
	    String Expected = "Manufacturer";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	@When("user clicks the new resources option")
	public void userClicksTheNewResourcesOption() {
	    clickElement(t1.agendaBtn);
	    clickElement(t1.newResource);
	}
	@When("user enters the {string} name")
	public void userEntersTheName(String resource) {
	   sendKeys(t1.refName, resource);
	}
	@When("user enters the {string} of resource")
	public void userEntersTheOfResource(String type) {
	    clickElement(t1.resType);
	    sendKeys(t1.fields, type);
	    enterKey(t1.fields);
	}
	@When("user enter the {string} of resource craetion")
	public void userEnterTheOfResourceCraetion(String desc) {
	    switchToFrame(t1.resDes);
	    clickElement(t1.message);
	    sendKeys(t1.message, desc);
	    SwitchtoParentFrame();
	}
	@When("user enters the {string} for the resource")
	public void userEntersTheForTheResource(String address) {
	    sendKeys(t1.addressRes, address);
	}
	@When("user enters the {string} code for address")
	public void userEntersTheCodeForAddress(String zip) {
	   sendKeys(t1.zipField, zip);
	}
	@When("user enters the {string} name for resiurce")
	public void userEntersTheNameForResiurce(String city) {
	    sendKeys(t1.cityField, city);
	}
	@When("user enters the {string} of the origin")
	public void userEntersTheOfTheOrigin(String country) {
	   clickElement(t1.countryRes);
		sendKeys(t1.fields, country);
		enterKey(t1.fields);
	}
	@When("user enters the {string} of the user")
	public void userEntersTheOfTheUser(String phone) {
	   sendKeys(t1.phoneRes, phone);
	}
	@When("user enters the {string} of the resource user")
	public void userEntersTheOfTheResourceUser(String mail) {
	  sendKeys(t1.mailRes, mail);
	}
	@When("user enters the {string} users of resource")
	public void userEntersTheUsersOfResource(String maxi) {
	    sendKeys(t1.maxRes, maxi);
	}
	@When("user clicks the craete button of the resource")
	public void userClicksTheCraeteButtonOfTheResource() {
	    clickElement(t1.createBtnEvent);
	}
	@Then("user created the resources sucessfully")
	public void userCreatedTheResourcesSucessfully() {
	    String Actual = getText(t1.resourceVali);
	    String Expected = "Python";
	    assertEquals(Expected, Actual);
	    System.out.println(Actual);
	}
	
	@When("user clicks the hrm option in the dashboard")
	public void userClicksTheHrmOptionInTheDashboard() {
	    clickElement(t1.hrmBtn);
	    
	}
	@When("user clicks the new leave request option")
	public void userClicksTheNewLeaveRequestOption() {
		clickElement(t1.newLeave);
	}
	@When("user enters the {string} of the leave")
	public void userEntersTheOfTheLeave(String type) {
	    clickElement(t1.leaveType);
	    sendKeys(t1.fields, type);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} date of the leave")
	public void userEntersTheDateOfTheLeave(String start) {
	    sendKeys(t1.leaveSd, start);
	}
	@When("user gives the {string} date of leave")
	public void userGivesTheDateOfLeave(String end) {
	    sendKeys(t1.leaveEd, end);
	}
	@When("user enters the {string} status")
	public void userEntersTheStatus(String apporoval) {
	    clickElement(t1.apporoval);
	    sendKeys(t1.fields, apporoval);
	    enterKey(t1.fields);
	}
	@When("user enters the {string} for leave request")
	public void userEntersTheForLeaveRequest(String des) {
	    switchToFrame(t1.resDes);
	    clickElement(t1.message);
	    sendKeys(t1.message, des);
	    SwitchtoParentFrame();
	}
	@When("user clicks the create leave request")
	public void userClicksTheCreateLeaveRequest() {
	    clickElement(t1.leaveCreateBtn);
	}
	@Then("user applys leave sucessfully")
	public void userApplysLeaveSucessfully() {
	    
	}
	@When("user clicks the new expenses option")
	public void userClicksTheNewExpensesOption() {
	    clickElement(t1.hrmBtn);
	    clickElement(t1.newExpenses);
	}
	@When("user enters the start date")
	public void userEntersTheStartDate() {
	    sendKeys(t1.sD, "08/14/2026");
	}
	@When("user enters the end date")
	public void userEntersTheEndDate() {
	    sendKeys(t1.eD, "08/16/2026");
	}
	@When("user enters the approved details")
	public void userEntersTheApprovedDetails() {
	    clickElement(t1.app);
	    sendKeys(t1.fields, "Alice");
	    enterKey(t1.fields);
	}
	@When("user enters the public note")
	public void userEntersThePublicNote() {
	   sendKeys(t1.publicNotesField, "nil");
	}
	@When("user enters the private note")
	public void userEntersThePrivateNote() {
	   sendKeys(t1.privateNotesField, "nil");
	}
	@When("user clicks the Create button")
	public void userClicksTheCreateButton() {
	    clickElement(t1.expSaveBtn);
	}
	@Then("user created the expenses sucesssfully")
	public void userCreatedTheExpensesSucesssfully() {
	    String Actual = getText(t1.expenseVali);
	    assertEquals(Actual, getText(t1.expenseVali));
	    System.out.println(Actual);
	}













}
