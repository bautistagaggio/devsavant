hostname: {http://worldtimeapi.org}

Feature: World time api
    

2.  # providing invalid credential
    Scenario: 
        Given I hit {hostname}/api/timezone
        When providing an invalid authenthication token
        Then I will not be allowed to retrieve information from the API 
        And  the http code error will be a 403


3.  # providing a region that does not exist
    Scenario: Check invalid region

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid region
        And executing the request to the API
        Then a pop up indicating that the resource does not exist will show up
        And the http code error will be a 404

    # providing a country that does not exist
    Scenario: Check invalid city 

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid city
        And executing the request to the API
        Then a pop up indicating that the resource does not exist will show up
        And the http code error will be a 404
    
    Scenario outline : Check invalid location

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid <location>
        And executing the request to the API
        Then a pop up indicating that the resource does not exist will show up
        And the http code error will be a 404
    
    Examples:
    | location  |
    |    city   |   
    |    region |  
