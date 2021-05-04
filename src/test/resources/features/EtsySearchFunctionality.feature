@HR-5 @ui
Feature: Validating Search functionality

  Background: Repeated steps
    Given User navigates to Etsy application
    When User searches for "carpet"

  @smoke @regression
  Scenario: Validating search result is matching with searched item
    Then User validates search results contain
      | carpet  | rug         |
      | oal rug | turkish rug |


  @regression
  Scenario: Validating price range functionality for searched item
    And User selects price range more then 1000
    Then User validates price range is more than 1000