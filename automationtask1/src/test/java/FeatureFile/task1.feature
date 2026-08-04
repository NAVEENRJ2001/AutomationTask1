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

  Scenario Outline: To validate the created sales orders in the list page
    When user clicks the commerce option for sale order validation
    And user clicks the list in sale order section
    And user enter the "<thirdpart>" name in the thirdparty column for sale search
    Then User gets the created sale order sucessfully

    Examples:
      | thirdpart |
      | Naveenraj |

  Scenario Outline: To create the new price request in the commerce module
    When user clicks the new price request option
    And user enters the "<vendor>" in the new price request list
    And user enters the "<payment>" terms in the new price list
    And user enters the "<delivery>" date in the new price list
    And user enters the "<project>" details in the new price list
    And user clicks the new price request create button
    Then user creates the new price request sucessfully

    Examples:
      | vendor | payment  | delivery | project    |
      | KVN    | Due Upon | 10/08/26 | Automation |

  Scenario Outline: To validate the created new price in the list page
    When user clicks the commerce option for new price  validation
    And user clicks the list in new price request section
    And user enter the "<vendor>" name in the vendor column for new price search
    Then User gets the created new price sucessfully

    Examples:
      | vendor |
      | kvn    |

  Scenario Outline: To Create the new purchase order of the commerce module
    When user clicks the commerce option for the create new purchase order
    And user clicks the new purchase order option
    And user enters the "<vendor>" in the new purchase order
    And user enters the "<refvendor>" in the ref column
    And user enters the "<palnned>" delivery date of the purchase order
    And user enters the "<project>" for the new purchase order
    And user enters the "<currency>" for the creation of new purchase
    And user enters the "<publicnote>" for the purchase
    And user Enters the "<privatenote>" for the new purchase
    And user click the create button for new purchase
    Then user creates the new purchase order sucessfully

    Examples:
      | vendor | refvendor | palnned    | project    | currency  | publicnote        | privatenote      |
      | KVN    | Kathirvel | 11/08/2026 | Automation | US Dollar | Quickly delivered | Always available |

  Scenario Outline: To validate the created new purchase  in the list page
    When user clicks the commerce option for new purchase order  validation
    And user clicks the list in new purchase order section
    And user enter the "<refvendor>" name in the vendor column for new purchase search
    Then User gets the created new purchase order sucessfully

    Examples:
      | refvendor |
      | kathirvel |

  Scenario Outline: To Create the new contract or subscription in the commerce
    When user click the commerce option for creation of new contract
    And user clicks the new contract and subscription
    And user enters the "<refcustomer>" in the new contract
    And user enters the "<refvendor>" in the creation of new contract
    And user enters the "<thirdparty>" in the new contract creation
    And user enters the "<project>" in create of new contract
    And user enters the "<publicnotes>" for the new contract
    And user enters the "<privatenotes>" for new subscription
    And user clicks the create button for new contract
    Then user creates a new contract or subscription sucessfully

    Examples:
      | refcustomer | refvendor | thirdparty | project    | publicnotes | privatenotes |
      | Hema        | Kathirvel | KVN        | Automation | Nil         | Nil          |

  Scenario Outline: To validate the created new contract list page
    When user clicks the commerce option for new contract validation
    And user clicks the list in new contract section
    And user enter the "<refcustomer>" vendor column for new purchase search
    Then User gets the created new contract order sucessfully

    Examples:
      | refcustomer |
      | hema        |

  Scenario Outline: To Create the new customer invoice in the billing module
    When user clicks the billing module presented in the dashboard
    And user clicks the new customer invoice option
    And user enters the "<customer>" name in the column of the invoice
    And user select the down payment check box
    And user enters the "<defaults>" bank account in the column
    And user enters the "<source>" of the cash in the column
    And user enters the "<publicnote>" of the customer invoice
    And user enters the "<privateinvoice>" of the customer invoice creation
    And user clicks the create draft button to create invoice
    Then user created the customer invoice sucessfully

    Examples:
      | customer     | defaults | source     | publicnote    | privateinvoice |
      | Victor Felix | Account  | Commercial | Photo at best | 100% offer     |

  Scenario Outline: To validate the creation of new customer invoice in the billing module
    When user clicks the new customer invoice list button
    And user sort by the "<payment>" type
    And user click the link below
    Then user gets the created customer invoice

    Examples:
      | payment |
      | Down    |

  Scenario Outline: To Create the new vendor invoice in the billing module
    When user clicks the new vendor invoice option
    And user enters the "<vendor>" thirdparty name
    And user enters the "<supplier>" info reference
    And user enters the "<label>" of the vendor
    And user enters the date of the "<invoice>"
    And user enters the "<due>" date of the payment
    And user enters the "<bank>" account to the vendor
    And user enters the "<project>" description
    And user enters the "<publicnote>" to the vendor
    And user enters the "<privatenote>" for the vendor creation
    And user Clicks the create button to vendor invoice creation
    Then user creates the vendor invoice sucessfully

    Examples:
      | vendor | supplier | label | invoice    | due        | bank    | project    | publicnote | privatenote |
      | kvn    | Jeeva    | Photo | 22/09/2026 | 25/09/2026 | Account | Automation | nl         | nil         |

  Scenario Outline: To Validate the creation of the new vendor in the list
    When user clicks the vendor list option
    And user enters the "<label>" name in the search field
    Then user gets the created new vendor

    Examples:
      | label |
      | Photo |

  Scenario Outline: To Create a new Article in the Ticket module
    When user clicks the ticket module in the dashboard
    And user clicks the new article option
    And user enters the "<question>" in the column of article
    And user enters the "<language>" of the article
    And user enters the "<creation>" of ticket suggestion
    And user enters the "<solution>" to article creation
    And user click the article creation button
    Then user creates the article sucessfully

    Examples:
      | question      | language | creation | solution      |
      | Who is our PM | English  | Other    | Narendra Modi |

  Scenario Outline: To create the new ticket in the ticket module
    When user clicks the new ticket option
    And user enters the "<subject>" for the ticket creation
    And user enters the "<message>" of ticket
    And user chooses the "<thirdparty>" of the ticket
    And user select the notify cb
    And user enters the "<project>" for ticket
    And user clicks the create button for the ticket creation
    Then user creates the ticket sucessfuly

    Examples:
      | subject         | message       | thirdparty | project    |
      | ComputerScience | Java Language | KVN        | Automation |

  Scenario Outline: To validate the created article in list
    When user clicks the article list option
    And user enters the "<question>" for sorting
    Then user gets the created article

    Examples:
      | question      |
      | Who is our PM |

  Scenario Outline: To Vlidate the created ticket in the list
    When user clicks the list of the tickets
    And user enters the "<subject>" in the sorting field
    Then user gets the created ticket sucessfully

    Examples:
      | subject         |
      | ComputerScience |

  @test
  Scenario Outline: To Create a new event in a Agenda module
    When user clicks the agenda option in the dashboard
    And user clicks the new event option
    And user enters the "<Title>" of the agenda
    And user enters the "<start>" date of the event
    And user enters the "<end>" date of the event agenda
    And user enters "<location>" in the event
    And user enter "<assingned>" to of the agenda
    And user enters the "<resource>" of agenda meeting
    And user enters the "<status>" of the meeting
    And user enters the "<related>" company for the event
    And user enters the "<project>" for the event
    And user click the craete button for agenda creation
    Then user creates the event sucessfully

    Examples:
      | Title   | start      | end        | location | assingned | resource | status | related | project    |
      | Meeting | 06/08/2026 | 07/08/2026 | Chennai  | Albert    | audi     | in     | kvn     | Automation |

  
  Scenario Outline: To create the new resources in the agenda module
    When user clicks the new resources option
    And user enters the "<resource>" name
    And user enters the "<type>" of resource
    And user enter the "<desc>" of resource craetion
    And user enters the "<address>" for the resource
    And user enters the "<zip>" code for address
    And user enters the "<city>" name for resiurce
    And user enters the "<country>" of the origin
    And user enters the "<phone>" of the user
    And user enters the "<mail>" of the resource user
    And user enters the "<maxi>" users of resource
    And user clicks the craete button of the resource
    Then user created the resources sucessfully

    Examples:
      | resource | type | desc         | address | zip    | city    | country | phone      | mail           | maxi |
      | Python   | car  | Four wheeler | Chennai | 600071 | Chennai | India   | 9876543210 | car2@gmail.com | 2    |

  Scenario Outline: To Create the new Leave Request in the HRM module
    When user clicks the hrm option in the dashboard
    And user clicks the new leave request option
    And user enters the "<type>" of the leave
    And user enters the "<start>" date of the leave
    And user gives the "<end>" date of leave
    And user enters the "<apporoval>" status
    And user enters the "<des>" for leave request
    And user clicks the create leave request
    Then user applys leave sucessfully

    Examples:
      | type | start      | end        | apporoval | des   |
      | sick | 27/06/2026 | 28/06/2026 | apiuser   | Fever |
      @test
      Scenario: To Create the new Expenses in hrm module 
      When user clicks the new expenses option 
      And user enters the start date 
      And user enters the end date 
      And user enters the approved details 
      And user enters the public note 
      And user enters the private note 
      And user clicks the Create button 
      Then user created the expenses sucesssfully 
      

