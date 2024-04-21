@Tag1
Feature: Orange Hrm application login

	@Smoke @Regression @Login
  Scenario: Verify user login successfully
    Given I navigated url on browser
    When I enter user name into user input field
    And I enter password in password filed
    And I click on login button
    Then I verify user login successfully
    And Verify all menus option
      | Header      | 
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      
      
    # data table
    
    # feature file
    # scenario
    # Given, When, Then, And, But
    # scenario outline
    # background scenario
    # Datatable
    # steps definitations
    # Hooks
    # Runner
    # Tags
    # glue
    # plugins
    # dryRun
    