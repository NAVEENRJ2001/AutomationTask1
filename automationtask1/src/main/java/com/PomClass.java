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
	
	@FindBy(xpath = "/input[@name='duration_value']")
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
	
	@FindBy(xpath = "//span[text()='Web_Application']")
	public WebElement servicesVali;
	
	@FindBy(tagName = "body")
	public WebElement desFiled;
	
	
	
	
	

}
