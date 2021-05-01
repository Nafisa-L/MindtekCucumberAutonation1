@HR-6
Feature: Validating Order creation functionality

  Background:
    Given User navigates to application
    When User provide username "Tester" and password "test"
    And User clicks on Order module
  @regression
  Scenario Outline: Validating calculate total functionality
    And User provides product "<Product>" and quantity <Quantity>
    Then User validates total is calculated properly for for quantity <Quantity>
    Examples:
      | Product     | Quantity |
      | FamilyAlbum | 1        |
      | MyMoney     | 5        |
      | ScreenSaver | 20       |

  @smoke @regression
  Scenario: Validating order creation functionality
    And User creates order with data
      | Product     | Quantity | Customer name | Street            | City    | State   | Zip   | Card | Card Nr   | Exp Date |
      | FamilyAlbum | 1        | John Doe      | 123 Deer rd.      | Chicago | IL      | 12345 | Visa | 124356356 | 12/21    |
      | MyMoney     | 1        | Patel Harsh   | 313 BrownDeer rd. | Tampa   | Florida | 24242 | Visa | 12345     | 12/22    |
    # data.get(0).get("Product"); -> FamilyAlbum
    # data.get(0).get("Customer name"); -> John Doe
    # data.get(1).get("Quantity"); -> 5
    # data.get(1).get("Zip"); -> 24242
    Then User validates success message "New order has been successfully added."
    And User validates that created orders are in the list of all orders



