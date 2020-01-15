Feature: Register Action
 
Scenario: Successful Register with Valid Credentials
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters Country
      And User enters Zip
      And User enters Vehicle Type
      And User enters Fuel Type
      And User enters MFG
      And User clicks Submit
     Then User has successfully registered
 
Scenario: Incorrect Register of title    
    Given User is on Home Page
     When User enters Incorrect Title
      And User clicks Submit
     Then User gets Title Popup
     
Scenario: Incorrect Register of Name
    Given User is on Home Page
     When User enters Title
      And User enters Incorrect Name
      And User clicks Submit
     Then User gets Name Popup
      
Scenario: Incorrect Register of Gender
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters No Gender
      And User clicks Submit
     Then User gets Gender Popup
     
Scenario: Incorrect Register of Address
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Incorrect Address
      And User clicks Submit
     Then User gets Address Popup
      
Scenario: Incorrect Register of City
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters Incorrect City
      And User clicks Submit
     Then User gets City Popup
      
      
Scenario: Incorrect Register of State
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters Incorrect State
      And User clicks Submit
     Then User gets State Popup
      
Scenario: Incorrect Register of County
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters No Country
      And User clicks Submit
     Then User gets Country Popup   
         
Scenario: Incorrect Register of Zip
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters Country
      And User enters Incorrect Zip
      And User clicks Submit
     Then User gets Zip Popup

Scenario: Incorrect Register of Vehicle
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters Country
      And User enters Zip
      And User enters No Vehicle Type
      And User clicks Submit
     Then User gets Vehicle Popup

Scenario: Incorrect Register of Fuel
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters Country
      And User enters Zip
      And User enters Vehicle Type
      And User enters No Fuel Type
      And User clicks Submit
     Then User gets Fuel Popup

Scenario: Incorrect Register of MFG
    Given User is on Home Page
     When User enters Title
      And User enters Name
      And User enters Gender
      And User enters Address
      And User enters City
      And User enters State
      And User enters Country
      And User enters Zip
      And User enters Vehicle Type
      And User enters Fuel Type
      And User enters No MFG
      And User clicks Submit
     Then User gets MFG Popup
       