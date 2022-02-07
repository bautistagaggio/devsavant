Feature: Devsavant website
    

2.  #  navigating to devsavant website through google's search engine
    Scenario: Devsavant webpage smoke test 

        Given I navigate to Google home page
        When I type the term "Devsavant" in the search box
        And click on the "I'm Feeling Lucky" button
        Then I will be taken to the Devsavant's website
       
