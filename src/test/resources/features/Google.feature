Feature: Google search

  Scenario: Google search example
    Given We set base url for "www.google.com" page
    When We search for "kalkulator" word
    Then "Kalkulator" text will be visible in results
    And Google logo will be visible
