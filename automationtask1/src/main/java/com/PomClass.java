package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	WebDriver driver;

	public PomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Test online']")
	public WebElement testOnlineBtn;

	@FindBy(xpath = "//a[text()='Click to test with the shared demo instance']")
	public WebElement testLink;

	@FindBy(xpath = "//a[.//div[contains(text(),'Company or freelance')]]")
	public WebElement demoPref;

	@FindBy(id = "password")
	public WebElement passField;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement loginBtn;

	@FindBy(xpath = "//a[text()='New Third Party']")
	public WebElement newThirdParty;

	@FindBy(xpath = "//div[@class='mainmenu companies topmenuimage']")
	public WebElement thirdPartyBtn;

	@FindBy(id = "name")
	public WebElement thirdPartyName;

	@FindBy(id = "name_alias_input")
	public WebElement aliasName;

	@FindBy(id = "prospectinput")
	public WebElement prospCb;

	@FindBy(id = "address")
	public WebElement adressField;

	@FindBy(id = "zipcode")
	public WebElement zipCode;

	@FindBy(id = "town")
	public WebElement cityName;

	@FindBy(id = "phone")
	public WebElement phoneField;

	@FindBy(id = "phone_mobile")
	public WebElement mobileField;

	@FindBy(id = "fax")
	public WebElement faxFiled;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "select2-no_email-container")
	public WebElement refuseMail;

	@FindBy(id = "idprof1")
	public WebElement tinNo;

	@FindBy(id = "idprof3")
	public WebElement srvcNo;

	@FindBy(id = "idprof2")
	public WebElement panNo;

	@FindBy(id = "idprof4")
	public WebElement prof4Field;

	@FindBy(id = "idprof5")
	public WebElement prof5Field;

	@FindBy(id = "intra_vat")
	public WebElement vatField;

	@FindBy(id = "assujtva_value")
	public WebElement sertaxCb;

	@FindBy(id = "localtax1assuj_value")
	public WebElement sectaxCb;

	@FindBy(id = "localtax2assuj_value")
	public WebElement thirdtaxCb;

	@FindBy(id = "select2-typent_id-container")
	public WebElement thirdPartyType;

	@FindBy(id = "select2-effectif_id-container")
	public WebElement workForce;

	@FindBy(id = "select2-forme_juridique_code-container")
	public WebElement busType;

	@FindBy(id = "birth")
	public WebElement comStartDate;

	@FindBy(id = "capital")
	public WebElement comCaptial;

	@FindBy(id = "select2-default_lang-container")
	public WebElement language;

	@FindBy(id = "select2-cond_reglement_id-container")
	public WebElement paymentTerms;

	@FindBy(id = "select2-selectmode_reglement_id-container")
	public WebElement paymentType;

	@FindBy(id = "options_height")
	public WebElement heightField;

	@FindBy(id = "options_weight")
	public WebElement weightField;

	@FindBy(id = "options_prof")
	public WebElement professionField;

	@FindBy(xpath = "//input[@value='Create third party']")
	public WebElement createBtn;

	@FindBy(xpath = "//a[text()='My Dashboard']")
	public WebElement dashboardVali;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement yesRefEmail;

	@FindBy(id = "morefieldslnk")
	public WebElement moreOption;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement typeField;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement forceField;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement langField;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement termField;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	public WebElement methodField;

	@FindBy(id = "options_birthdate")
	public WebElement birthDate;

	@FindBy(xpath = "//span[text()='Naveenraj']")
	public WebElement validation;

	@FindBy(xpath = "(//a[text()='List'])[1]")
	public WebElement listOption;

	@FindBy(xpath = "(//input[@class='flat searchstring maxwidth75imp'])[1]")
	public WebElement listsearch;

	@FindBy(xpath = "//a[text()='Naveenraj (kiaq)']")
	public WebElement listvali;

	@FindBy(xpath = "(//a[text()='Naveenraj (kiaq)'])[1]")
	public WebElement thirdpartyPro;

	@FindBy(xpath = "(//a[text()='Contacts/Addresses'])[2]")
	public WebElement condetails;

	@FindBy(xpath = "//span[text()='Naveenraj kiaq']")
	public WebElement conPro;

	@FindBy(xpath = "//a[text()='Disable']")
	public WebElement disableBtn;

	@FindBy(xpath = "//a[text()='Reactivate']")
	public WebElement reactivateBtn;

	@FindBy(xpath = "//span[text()='Closed']")
	public WebElement disableVali;

	@FindBy(xpath = "//span[text()='Open']")
	public WebElement reactivateVali;

	@FindBy(xpath = "//a[text()='Modify']")
	public WebElement modifyBtn;

	@FindBy(id = "title")
	public WebElement jobField;

	@FindBy(xpath = "//input[@name='save']")
	public WebElement saveBtn;

	@FindBy(xpath = "//td[text()='software test engineer']")
	public WebElement modifyVali;
//=======================// NEW SERVICES MODULE//==========================================================//
	@FindBy(xpath = "//span[@class='fas fa-cube fa-fw pictofixedwidth']")
	public WebElement servicesBtn;

	@FindBy(xpath = "//a[text()='New service']")
	public WebElement newservices;

	@FindBy(id = "ref")
	public WebElement perfRef;

	@FindBy(id = "label")
	public WebElement labelField;

	@FindBy(xpath = "//span[text()='For sale']")
	public WebElement sellStatus;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement sellField;

	@FindBy(xpath = "//span[text()='For purchase']")
	public WebElement purchaseStatus;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement purchaseField;

	@FindBy(xpath = "//iframe[@title='Editor, desc']")
	public WebElement descriptionField;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement urlField;

	@FindBy(xpath = "//input[@name='duration_value']")
	public WebElement durationField;

	@FindBy(id = "mandatoryperiod")
	public WebElement mandatoryCb;

	@FindBy(id = "note_private")
	public WebElement noteField;

	@FindBy(xpath = "//input[@name='price']")
	public WebElement sellPriceField;

	@FindBy(xpath = "//input[@name='price_min']")
	public WebElement minimumPriceField;

	@FindBy(id = "select2-tva_tx-container")
	public WebElement taxRate;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement taxRateField;

	@FindBy(id = "select2-accountancy_code_sell-container")
	public WebElement acccodesale;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement saleField;

	@FindBy(id = "select2-accountancy_code_sell_export-container")
	public WebElement saleexp;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement saleExpField;

	@FindBy(id = "select2-accountancy_code_buy-container")
	public WebElement purchase;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement accPurchaseField;

	@FindBy(id = "select2-accountancy_code_buy_export-container")
	public WebElement purImport;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement purImportField;

	@FindBy(xpath = "//span[contains(text(),'Web_Application')]")
	public WebElement servicesVali;

	@FindBy(tagName = "body")
	public WebElement desFiled;

	@FindBy(xpath = "(//input[@type='submit'])[1]")
	public WebElement serCreateBtn;

	@FindBy(xpath = "//a[text()='List']")
	public WebElement serListBtn;

	@FindBy(xpath = "//span[text()='Web_Application_demo1']")
	public WebElement serListVali;

	@FindBy(xpath = "//input[@name='search_ref']")
	public WebElement serListField;

	@FindBy(xpath = "//span[text()='Modify']")
	public WebElement serModifyBtn;

	@FindBy(xpath = "//input[@name='label']")
	public WebElement labelModField;

	@FindBy(xpath = "//select[@name='statut']")
	public WebElement sellStatusModi;

	@FindBy(xpath = "//div[text()='Software Company']")
	public WebElement modifyVali1;

	@FindBy(xpath = "//span[text()='Not for sale']")
	public WebElement modifyVali2;

	@FindBy(xpath = "//span[text()='Web_Application_demo1']")
	public WebElement productprofile;

	@FindBy(xpath = "//input[@name='save']")
	public WebElement SersaveBtn;
//============PROJECT MODULE============================================================================//	

	@FindBy(xpath = "//span[text()='Projects']")
	public WebElement projectBtn;

	@FindBy(xpath = "//a[text()='New lead or project']")
	public WebElement newProject;

	@FindBy(xpath = "//input[@name='title']")
	public WebElement proLabelField;

	@FindBy(id = "usage_bill_time")
	public WebElement usageCb;

	@FindBy(id = "select2-socid-container")
	public WebElement thirdpartyBox;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement thirdpartyField;

	@FindBy(id = "select2-opp_status-container")
	public WebElement leadStatusBox;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement leadStatusField;

	@FindBy(xpath = "//input[@name='opp_amount']")
	public WebElement leadAmountField;

	@FindBy(xpath = "//input[@name='budget_amount']")
	public WebElement budgetField;

	@FindBy(id = "projectend")
	public WebElement dateOfEnd;

	@FindBy(xpath = "//iframe[@title='Editor, description']")
	public WebElement proDescriptionField;

	@FindBy(id = "select2-categories-result-mxdw-1407")
	public WebElement tagValue;

	@FindBy(xpath = "(//span[@role='combobox'])[4]")
	public WebElement tagBox;

	@FindBy(id = "select2-public-container")
	public WebElement visibilityBox;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement visibilityField;

	@FindBy(id = "select2-typeofcontact-container")
	public WebElement assignmeBox;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement assignmeField;

	@FindBy(id = "select2-options_priority-container")
	public WebElement priorityBox;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement priorityField;

	@FindBy(xpath = "//input[@name='save']")
	public WebElement proCreateBtn;

	@FindBy(tagName = "body")
	public WebElement prodesField;

	@FindBy(xpath = "//div[text()='Automation']")
	public WebElement proValidation;

	@FindBy(xpath = "(//a[text()='List'])[1]")
	public WebElement proListBtn;

	@FindBy(xpath = "//input[@name='search_label']")
	public WebElement proLabelSearch;

	@FindBy(xpath = "(//td[text()='Automation'])[2]")
	public WebElement proSearchVali;

	@FindBy(xpath = "//a[text()='New task']")
	public WebElement newTask;

	@FindBy(xpath = "//input[@name='label']")
	public WebElement taskLabelField;

	@FindBy(id = "select2-task_parent-container")
	public WebElement chlidProBox;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement chlidProField;

	@FindBy(id = "select2-userid-container")
	public WebElement assignedToBox;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement assignedToField;

	@FindBy(id = "billable")
	public WebElement billableBox;

	@FindBy(id = "date_startButtonNow")
	public WebElement startDate;

	@FindBy(id = "date_end")
	public WebElement endDateField;

	@FindBy(id = "date_endhour")
	public WebElement endDateHr;

	@FindBy(id = "date_endmin")
	public WebElement endDateMin;

	@FindBy(xpath = "//input[@name='planned_workloadhour']")
	public WebElement plannedWorkload;

	@FindBy(xpath = "//select[@name='progress']")
	public WebElement realProgressBox;

	@FindBy(xpath = "//iframe[@title='Editor, description']")
	public WebElement taskDescription;

	@FindBy(tagName = "body")
	public WebElement taskDesField;

	@FindBy(xpath = "//input[@name='budget_amount']")
	public WebElement taskbudgetField;

	@FindBy(xpath = "//input[@name='add']")
	public WebElement taskAddButton;

	@FindBy(xpath = "//div[text()='Automation Project']")
	public WebElement taskVali;

//==========================Commerce module========================================================================	=

	@FindBy(xpath = "//div[@class='mainmenu commercial topmenuimage']")
	public WebElement commerceBtn;

	@FindBy(xpath = "//a[text()='New proposal']")
	public WebElement newProposal;

	@FindBy(xpath = "//input[@name='ref_client']")
	public WebElement refCustomerField;

	@FindBy(id = "select2-socid-container")
	public WebElement customerBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement customerBoxField;

	@FindBy(id = "select2-select_demand_reason_id-container")
	public WebElement sourceBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement sourceBoxField;

	@FindBy(id = "select2-availability_id-container")
	public WebElement delayBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement delayBoxField;

	@FindBy(id = "date_livraison")
	public WebElement deliveryDateField;

	@FindBy(id = "select2-projectid-container")
	public WebElement projectBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement projectBoxField;

	@FindBy(id = "select2-multicurrency_code-container")
	public WebElement currencyBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement currencyBoxField;

	@FindBy(id = "note_public")
	public WebElement publicNotesField;

	@FindBy(id = "note_private")
	public WebElement privateNotesField;

	@FindBy(xpath = "//input[@name='save']")
	public WebElement proposalCreateBtn;

	@FindBy(xpath = "//span[text()=' - Automation Project']")
	public WebElement proposalVali;

	@FindBy(xpath = "//a[text()='List']")
	public WebElement proposalList;

	@FindBy(xpath = "//input[@name='search_refcustomer']")
	public WebElement searchRefCus;

	@FindBy(xpath = "(//td[text()='Amirtha'])[1]")
	public WebElement proposalSearchVali;

	@FindBy(xpath = "//input[@name='ref_client']")
	public WebElement salesClientField;

	@FindBy(id = "select2-socid-container")
	public WebElement saleCustomerBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement saleCustomerBoxField;

	@FindBy(id = "liv_")
	public WebElement plannedDeliveryDate;

	@FindBy(id = "liv_hour")
	public WebElement deliveryHr;

	@FindBy(id = "liv_min")
	public WebElement deliveryMin;

	@FindBy(id = "select2-availability_id-container")
	public WebElement saleDelayBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement saleDelayBoxField;

	@FindBy(id = "select2-selectshipping_method_id-container")
	public WebElement saleShippingBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement saleShippingField;

	@FindBy(id = "select2-select_demand_reason_id-container")
	public WebElement saleSourceBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement saleSourceBoxField;

	@FindBy(id = "select2-projectid-container")
	public WebElement saleProjectBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement saleProjectBoxField;

	@FindBy(id = "select2-incoterm_id-container")
	public WebElement incoTermsBox;

	@FindBy(xpath = "(//input[@role='searchbox'])[2]")
	public WebElement incoTermField;

	@FindBy(xpath = "//input[@name='options_custom1']")
	public WebElement customField;

	@FindBy(id = "note_public")
	public WebElement salePublicNotesField;

	@FindBy(id = "note_private")
	public WebElement salePrivateNotesField;

	@FindBy(xpath = "//input[@name='save']")
	public WebElement saleCreateBtn;

	@FindBy(xpath = "//span[contains(text(),'(PRO')]")
	public WebElement saleCreateVali;

	@FindBy(xpath = "(//a[text()='New order'])[1]")
	public WebElement newSale;

	@FindBy(xpath = "(//a[text()='List'])[2]")
	public WebElement saleList;

	@FindBy(xpath = "//input[@name='search_company']")
	public WebElement saleSearchBox;

	@FindBy(xpath = "(//td[text()='Gokul'])[1]")
	public WebElement saleSearchVali;

}
