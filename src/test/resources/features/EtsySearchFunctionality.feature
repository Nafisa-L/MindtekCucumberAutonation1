@HR-5
Feature: Validating Search functionality

  @smoke @regression
  Scenario: Validating search result is matching with searched item
    Given User navigates to Etsy application
    When User searches for "carpet"
    Then User validates search results contain
      | carpet  | rug         |
      | oal rug | turkish rug |