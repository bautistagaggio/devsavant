hostname: {http://worldtimeapi.org}

Feature: World time api
# this test will asert this api is returning the proper http error code when
# asking for resources that doesn't exist 

Background: 
    
2.  # 
    Scenario: Check invalid url
        Given the user hits the endpoint {hostname}/api/timezon
        When providing and invalid url
        Then a client message "Not found" will show up
        And the http code error will be a 404


   # providing a region that does not exist
    Scenario: Check invalid region

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid region
        And executing the request to the API
        Then a client message "Not found" will show up
        And the http code error will be a 404

    # providing a city that does not exist
    Scenario: Check invalid city 

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid city
        And executing the request to the API
        Then a client message "Not found" will show up
        And the http code error will be a 404
    

    Scenario outline : Check invalid location

        Given I hit {hostname}/api/timezone/America/Bogota 
        When providing and invalid <location>
        And executing the request to the API
        Then a client message "Not found" will show up
        And the http code error will be a 404
    

    Examples:
    | location  |
    |    city   |   
    |    region |  
