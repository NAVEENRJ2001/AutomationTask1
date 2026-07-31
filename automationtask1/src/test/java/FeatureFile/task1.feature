Feature: To Verify the Functionality of the Dolibarr Demo Site

  @test
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
      | productref            | label    | description  | publicUrl      | duration | notes             | sellingPrice | minimumSellingPrice |
      | Web Application demo2 | Software | Good quality | www.google.com | 10       | customer friendly | 1000         | 850                 |

  Scenario Outline: To Validate the creation of new services
    When User Clicks the services option
    And User Clicks the List option in services module
    And User enters the "<productref>" name in the search field
    Then the created productref name will appear sucessfully

    Examples:
      | productref            |
      | Web Application demo1 |

  Scenario Outline: To Verify the Modify Option Presented in the Services Module
    When user clicks the product ref profile
    And user clicks the modify button presented in the services
    And user changed the "Software Company" in services
    And user changed the sell status as not for sale
    And user clicks the save button
    Then user modify the changes sucessfully as "<expected>"

    Examples:
      | expected    |
      | labelstatus |
      | sellstatus  |

  Scenario Outline: To Create a new Project in the Project Module
    When user clicks the project option in the dashboard
    And user clicks the new project
    And user enters the "<label>" in the labelcolumn
    And user clicks the usage checkbox
    And user enters the "<thirdparty>" in the thirdparty column
    And user enters the "<leadstatus>" in the lead column
    And user enter the "<leadamount>" in the amount column
    And user enters the "<budget>" in the budget column
    And user enters the "<date>" in the date column
    And user enters the "<description>" in the project description column
    And user select the tag
    And user enters the "<visibility>" in the visibility column
    And user enters the "<assignme>" status in the column
    And user enters the "<priority>" in the priority column
    And user clicks the create draft button
    Then user creats the new project Sucessfully

    Examples:
      | label      | thirdparty | leadstatus | leadamount | budget | date       | description       | visibility | assignme       | priority |
      | Automation | Naveenraj  | Proposal   | 6000       | 10000  | 10/23/2030 | Selenium cucumber | Everybody  | Project leader | 5        |

  Scenario Outline: To Validate the creation of new projects
    When User Clicks the project option
    And User Clicks the List option in projects module
    And User enters the "<projectlabel>" name in the project search field
    Then the created project label  name will appear sucessfully

    Examples:
      | projectlabel |
      | Automation   |

  Scenario Outline: To Create the new Task in the projects module
    When user clicks the project option for task creation
    And user clicks the new task option
    And user enters the "<label>" in the task column
    And user enters the "<Childproject>" details in the child project column
    And user enters the "<assignedto>" details in the assigned to column
    And user select the billable details
    And user enters the startdate in the start dae column
    And user enters the "<enddate>" in the end date column
    And user enters the "<workload>" in the workload column
    And user enters the realprogress in the proress column
    And user enters the "<description>" in task description column
    And user enters the "<budget>" of the task
    And user clicks the add button
    Then user creats the new task sucessfully

    Examples:
      | label             | Childproject | assignedto | enddate    | workload | description        | budget |
      | Cucumber Selenium | Automation   | David      | 10/09/2030 | 8        | Cucumber framework | 10000  |

  Scenario Outline: To Create the new Commercial Proposal in the commerce module
    When user clicks the commerce area option in  the dashboard
    And user clicks the new proposal option
    And user enters the "<refcustomer>" name in the customer column
    And user enters the "<customer>" thirdpart name in the column
    And user enters the "<source>" of the payment
    And user enters the "<availability>" of the order
    And user enters the "<delivery>" date of the order
    And user Enters the "<project>" for create commercial proposal
    And user enters the "<currency>" value for proposal
    And user Enters the "<publics>" notes for the proposal
    And user enters the "<privates>" notes for the commercial proposal
    And user clicks the propsal create draft button
    Then user creates the proposal sucessfully

    Examples:
      | refcustomer | customer  | source   | availability | delivery   | project    | currency   | publics       | privates               |
      | Amirtha     | Naveenraj | Employee | 3 weeks      | 02/08/2025 | Automation | US DOllars | Delivery soon | it will dispatced soon |

  Scenario Outline: To Validate the Created Commercial proposal in the List page
    When user clicks the commerce option in dashboard for list
    And user clicks the list option
    And user enters the "<refcustomer>" in the search bar
    Then user gets the created proposal

    Examples:
      | refcustomer |
      | Amirtha     |

  Scenario Outline: To Create the new Sales order in the Commerce module
    When user Clicks the commerce option in dashboard for create sales order
    And user clicks the new sales order option
    And user enters the "<refcus>" in the sale order
    And user enters the "<customer>" for the sale order creation
    And user enters the planned "<deliver>" date in the sale order
    And user enters the availability "<delay>" in the sale order
  # And user enters the "<shipping>" method in the column
    And user enter the "<source>" of the cash for the sale order
    And user enters the "<project>" for the create the sale order
  # And user enter the "<inco>" terms for the sale order
    And user enters the "<custom>" field in the sale order creation
    And user enters the "<publics>" notes for sale order
    And user enters the "<privates>" notes for creation of sale order
    And user clicks the sale order create draft button
    Then user creates the sale order sucessfully

    Examples:
      | refcus | customer  | deliver    | delay     | shipping    | source | project    | inco | custom | publics      | privates      |
      | Gokul  | Naveenraj | 02/08/2025 | Immediate | Transporter | Fax    | Automation | CIF  | Nil    | Public notes | Private notes |

  @test
  Scenario Outline: To validate the created sales orders in the list page
    When user clicks the commerce option for sale order validation
    And user clicks the list in sale order section
    And user enter the "<thirdpart>" name in the thirdparty column for sale search
    Then User gets the created sale order sucessfully

    Examples:
      | thirdpart |
      | Naveenraj |
      
      
