Feature: Test google functionality
@smokeTest
  Scenario: Validate google search1
    Given browser is open
    And user is on google search page
    When user enters a text in text box <username> and <password>
    And hits enter
    Then user is navigated to search results

    Examples: 
| username | password |
| Raghav | 12345 |
| Ele | 12345 |

@regression
  Scenario: Validate google search2
    Given browser is open
    And user is on google search page
    When user enters a text in text box <username> and <password>
    And hits enter
    Then user is navigated to search results

    Examples: 
| username | password |
| Raghav | 12345 |
| Ele | 12345 |