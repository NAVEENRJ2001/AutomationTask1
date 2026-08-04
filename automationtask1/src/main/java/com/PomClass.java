package com;

import java.time.temporal.WeekFields;

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
	
	@FindBy(xpath = "//a[text()='New price request']")
	public WebElement newPriceReq;
	
	@FindBy(id = "select2-socid-container")
	public WebElement vendorBox;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	public WebElement vendorField;
	
	@FindBy(id = "select2-cond_reglement_id-container")
	public WebElement termBox;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	public WebElement payTermField;
	
	@FindBy(id = "liv_")
	public WebElement ddField;
	
	@FindBy(id = "select2-projectid-container")
	public WebElement proBox;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	public WebElement proBoxField;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement priceCreateBtn;
	
	@FindBy(xpath = "//span[contains(text(),'(PRO')]")
	public WebElement priceReqVali;
	
	@FindBy(xpath = "(//a[text()='List'])[3]")
	public WebElement priceList;
	
	@FindBy(xpath = "//input[@name='search_company']")
	public WebElement vendorSearch;
	
	@FindBy(xpath = "(//a[text()='KVN productions'])[1]")
	public WebElement priceSearchVali;
	
	@FindBy(id = "select2-socid-container")
	public WebElement purchaseVendorBox;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	public WebElement purchaseVendorField;
	
	@FindBy(xpath = "//input[@name='refsupplier']")
	public WebElement refVendorField;
	
	@FindBy(id = "liv_")
	public WebElement purchaseDdField;
	
	@FindBy(id = "select2-projectid-container")
	public WebElement purchaseProBox;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	public WebElement purProBoxField;
	
	@FindBy(xpath = "(//a[text()='New order'])[2]")
	public WebElement newPurchase;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement purchaseCreateBtn;
	
	@FindBy(xpath = "//span[contains(text(),'(PRO')]")
	public WebElement purchaseVali;
	
	@FindBy(xpath = "(//a[text()='List'])[4]")
	public WebElement purchaselist;
	
	@FindBy(xpath = "//input[@name='search_refsupp']")
	public WebElement purchaseSearchField;
	
	@FindBy(xpath = "//td[text()='Kathirvel']")
	public WebElement purchaseSearchVali;
	
	@FindBy(id = "ref_customer")
	public WebElement refCustomerField2;
	
	@FindBy(id = "ref_supplier")
	public WebElement refVendor;
	
	@FindBy(xpath = "//input[@name='add']")
	public WebElement contractAddBtn;
	
	@FindBy(xpath = "//a[text()='New contract or subscription']")
	public WebElement newContract;
	
	@FindBy(xpath = "//span[text()=' - Automation Project']")
	public WebElement contractVali;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement contarctThirdPrtyField;
	
	@FindBy(xpath = "(//a[text()='List'])[5]")
	public WebElement contractList;
	
	@FindBy(xpath = "//input[@name='search_ref_customer']")
	public WebElement contractSearchField;
	
	@FindBy(xpath = "(//td[text()='Hema'])[1]")
	public WebElement contractSearchVali;
	
	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement fields;
	
	@FindBy(id = "radio_deposit")
	public WebElement downPaymentcb;
	
	@FindBy(id = "re")
	public  WebElement invoiceDate;
	
	@FindBy(id = "select2-selectfk_account-container")
	public WebElement bankAccount;
	
	@FindBy(id = "select2-select_input_reason_id-container")
	public WebElement source;
	
	@FindBy(id = "select2-projectid-container")
	public WebElement project;
	
	@FindBy(xpath = "//span[text()='Billing | Payment']")
	public WebElement billingBtn;
	
	@FindBy(xpath = "(//a[text()='New invoice'])[1]")
	public WebElement newCustomerInvoice;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement increateBtn;
	
	@FindBy(xpath = "//span[contains(text(),'(PRO')]")
	public WebElement cusInVali;
	
	@FindBy(xpath = "//span[text()='(PROV27417)']")
	public WebElement cusInSeVali;
	
	@FindBy(xpath = "(//a[text()='List'])[1]")
	public WebElement listCusIn;
	
	@FindBy(id = "select2-search_type-container")
	public WebElement listSearchBox;
	
	@FindBy(xpath = "//a[text()='(PROV27417)']")
	public WebElement link;
	
	@FindBy(xpath = "//input[@name='label']")
	public WebElement labelFiled1;
	
	@FindBy(id = "ech")
	public WebElement duePayment;
	
	@FindBy(xpath = "(//a[text()='New invoice'])[2]")
	public WebElement newVendor;
	
	@FindBy(xpath = "//input[@name='ref_supplier']")
	public WebElement supplierRef;
	
	@FindBy(xpath = "//span[text()='Tickets']")
	public WebElement ticketsBtn;
	
	@FindBy(xpath = "//a[text()='New article']")
	public WebElement newArticle;
	
	@FindBy(id = "question")
	public WebElement questionField;
	
	@FindBy(id = "select2-lang-container")
	public WebElement artLang;
	
	@FindBy(id = "select2-fk_c_ticket_category-container")
	public WebElement creationBox;
	
	@FindBy(xpath = "//div[text()='Who is our PM']")
	public WebElement artCreatVali;
	
	@FindBy(xpath = "//input[@name='add']")
	public WebElement createBn;
	
	@FindBy(xpath = "//iframe[@title='Editor, answer']")
	public WebElement solutionFiled;
	
	@FindBy(tagName = "body")
	public WebElement solution;
	
	@FindBy(xpath = "//a[text()='New Ticket']")
	public WebElement newTicket;
	
	@FindBy(id = "subject")
	public WebElement subjectField;
	
	@FindBy(xpath = "//iframe[@title='Editor, message']")
	public WebElement messageField;
	
	@FindBy(tagName = "body")
	public WebElement message;
	
	@FindBy(id = "notify_tiers_at_create")
	public WebElement creationcb;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement createBtnTic;
	
	@FindBy(xpath = "//span[contains(text(),'TS2608')]")
	public WebElement ticketCreateVali;
	
	@FindBy(xpath = "//a[text()='List of articles']")
	public WebElement listArt;
	
	@FindBy(xpath = "//input[@name='search_question']")
	public WebElement queSearch;
	
	@FindBy(xpath = "//td[text()='who is your pm']")
	public WebElement queseachVali;
	
	@FindBy(xpath = "//a[text()='List']")
	public WebElement ticList;
	
	@FindBy(xpath = "//input[@name='search_subject']")
	public WebElement ticSearch;
	
	@FindBy(xpath = "//span[text()='computerScience']")
	public WebElement ticSearchVali;
	
	@FindBy(id = "label")
	public WebElement titleFiled;
	
	@FindBy(id = "select2-actioncode-container")
	public WebElement typeBox;
	
	@FindBy(id = "ap")
	public WebElement startd;
	
	@FindBy(id = "p2")
	public WebElement endd;
	
	@FindBy(xpath = "//input[@name='location']")
	public WebElement locationField;
	
	@FindBy(id = "select2-assignedtouser-container")
	public WebElement assignedBox;
	
	@FindBy(id = "select2-assignedtoresource-container")
	public WebElement resourceBox;
	
	@FindBy(id = "select2-selectcomplete-container")
	public WebElement progressBox;
	
	@FindBy(xpath = "//input[@name='add']")
	public WebElement createBtnEvent;
	
	@FindBy(xpath = "//div[text()='Manufacturer']")
	public WebElement eventCreateVali;
	
	@FindBy(xpath = "//span[text()='Agenda']")
	public WebElement agendaBtn;
	
	@FindBy(xpath = "//a[text()='New event']")
	public WebElement newEvent;
	
	@FindBy(xpath = "//input[@name='ref']")
	public WebElement refName;
	
	@FindBy(xpath = "select2-selectfk_code_type_resource-container")
	public WebElement resType;
	
	@FindBy(xpath = "//iframe[@title='Editor, description']")
	public WebElement resDes;
	
	@FindBy(id = "address")
	public WebElement addressRes;
	
	@FindBy(id = "zipcode")
	public WebElement zipField;
	
	@FindBy(id = "town")
	public WebElement cityField;
	
	@FindBy(id = "select2-selectcountry_id-container")
	public WebElement countryRes;
	
	@FindBy(id = "phone")
	public WebElement phoneRes;
	
	@FindBy(id = "email")
	public WebElement mailRes;
	
	@FindBy(id = "max_users")
	public WebElement maxRes;
	
	@FindBy(xpath = "//a[text()='New resource']")
	public WebElement newResource;
	
	@FindBy(xpath = "//span[text()='Python']")
	public WebElement resourceVali;
	
	@FindBy(id = "select2-type-container")
	public WebElement leaveType;
	
	@FindBy(id = "date_debut_")
	public WebElement leaveSd;
	
	@FindBy(id = "date_fin_")
	public WebElement leaveEd;
	
	@FindBy(id = "select2-valideur-container")
	public WebElement apporoval;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement leaveCreateBtn;
	
	@FindBy(xpath = "//span[text()='HRM']")
	public WebElement hrmBtn;
	
	@FindBy(xpath = "(//a[text()='New'])[1]")
	public WebElement newLeave;
	
	@FindBy(xpath = "//span[contains(text(),'PROV592')]" )
	public WebElement expenseVali;
	
	@FindBy(id = "date_debut")
	public WebElement sD;
	
	@FindBy(id = "date_fin")
	public WebElement eD;
	
	@FindBy(id = "select2-fk_user_validator-container")
	public WebElement app;
	
	@FindBy(xpath = "//input[@name='save']")
	public WebElement expSaveBtn;
	
	@FindBy(xpath = "(//a[text()='New'])[2]")
	public WebElement newExpenses;
	
	
	
	
	
	
	

}
