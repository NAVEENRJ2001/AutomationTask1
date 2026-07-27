@test
Feature: To Verify the Functionality of the Dolibarr Demo Site

  Scenario: To navigated to the dashboard
    Given User Launches the Application
    And User Clicks the Test Online Button
    And User Clicks the link given Below
    And User Clicks the Suitable profile for test
    And User Enters the Password
    Then User Navigated into the Dashboard

  Scenario Outline: To create a new third party in the prospectus
    When User Clicks the Third Party option presented in the dashboard
    And User Clicks the New Third party option
    And User enters the "<Thirdparty>" name
    And User enters the "<alias>"
    And User Clicks the prospectus checkbox
    And User Enters the "<Address>" in the address column
    And User Enters the "<Zipcode>" in the zipcode column
    And User Enters the "<City>" city column
    And User Enters the "<Phone>" phone column
    And User Eners the "<Mobile>" mobile column
    And User Enters the "<Fax>" fax column
    And User Enters the "<Email>" mail column
    And User selects the refuse mass email option
    And User Enters the "<TIN>" number
    And User Enters the "<SRVC>" TAX number
    And User Enters the "<PAN>" number
    And User Enters the "<Prof4>" prf column
    And User Enters the "<Prof5>" prof column
    And User Enters the "<VAT>" Id
    And User Select the Sales Tax Checkbox
    And User select the Second tax
    And User Select the third Tax
    And User Clicks more option
    And User Selects the Third Party Type
    And User Selects the workforce
    And User Select the establishment of the company date
    And User Enters the "<Capital>" of the company
    And User select the default language
    And User Select the payment method
    And User Select the payment type
    And User Select the Currency
    And User enters the "<height>" height column
    And User Enters the "<weight>" weight column
    And User Enters the "<profession>" profes column
    And User Select the Birth Date
    And User Clicks the Create third party button
    Then User Creates the Third party prospectus Sucessfully

    Examples:
      | Thirdparty | alias | Address             | Zipcode | City    | Phone   | Mobile     | Fax    | Email           | TIN          | SRVC       | PAN       | Prof4     | Prof5      | VAT      | Capital | height | weight | profession        |
      | Naveenraj  | kiaq  | Karapakkam, Chennai | 600007  | Chennai | 4321567 | 9876543210 | 124567 | navee@gmail.com | TN1234569000 | SRVC123467 | EWRTY245O | 000000000 | 1233444444 | VAT12233 | 5000    | 170    | 65     | Software Engineer |

  Scenario: To Validate the Third Party Creation
    When User Clicks the thirdparty option
    And User Clicks the List option
    And User enters the third party name in the search field
    Then the created third party name will appear sucessfully

  Scenario: To Verify the Disable feature presented in the third party module
    When User clicks the third party profile
    And User clicks the Contact and address details
    And User clicks the Diasble button
    Then Status turns into Closed as expected
    And User Again Click the Reactivated
    Then Status turns into Open as expected

  Scenario Outline: To Verify the Modify feature presented in the third party module
    When User Clicks the modify button
    And User edit the "<jobposition>" in the page
    Then modification of the job position is sucessfull

    Examples:
      | jobposition            |
      | software test engineer |

  Scenario Outline: To Create the new Services in the services module presented in the demo site
    Given user clicks the services module pressented in the dashboard
    When user clicks the new services option
    And user enters the "<productref>" in the product column
    And user enters the "<label>" in the label column
    And user select the sell status
    And user select the purchase status
    And user enters the "<description>" in the column
    And user enters the "<publicUrl>" in the url column
    And user enters the "<duration>" in the duration column
    And user click the mandatory period check box
    And user enters the "<notes>" in the notes column
    And user enters the "<sellingPrice>" in the selling column
    And user enters the "<minimumSellingPrice>" in the min column
    And User Select the tax rate
    And user select the account code sale
    And user select the account code sale export
    And user select the account code purchase
    And user select the account code purchase import
    And User clicks the create button
    Then User creates the new services sucessfully

    Examples:
      | productref      | label    | description  | publicUrl      | duration | notes             | sellingPrice | minimumSellingPrice |
      | Web Application | Software | Good quality | www.google.com | 10       | customer friendly | 1000         | 850                 |
