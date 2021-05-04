@HR-8 @ui
Feature: Validating Etsy titles

@regression
  Scenario Outline: Validating titles of each module
    Given User navigates to Etsy application
    When User clicks on "<Module>" module
    Then User validates title "<Title>"
    Examples:
      | Module                | Title                         |
      | Jewelry & Accessories | Jewelry & Accessories \| Etsy |
      | Clothing & Shoes      | Clothing & Shoes \| Etsy      |
      | Home & Living         | Home & Living \| Etsy         |
      | Wedding & Party       | Wedding & Party \| Etsy       |
      | Toys & Entertainment  | Toys & Entertainment \| Etsy |
      | Art & Collectibles    | Art & Collectibles \| Etsy   |


