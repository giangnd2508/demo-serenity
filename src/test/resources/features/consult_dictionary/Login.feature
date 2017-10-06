Feature: Login
  
  User wants to login into system.
	
	@fail
  Scenario Outline: Login fail
    Given the user is on the hotel login page
    And the user enters email <email> and password <password>
    When the user clicks login button
    Then the user sees the error "ユーザー名かパスワードが無効です。"

    Examples: 
      | email     | password |
      | "giang12" | "123456" |
      | "fsfsd"   | ""       |

  #Scenario Outline: Login successfully
    #Given the user is on the hotel login page
    #And the user enters email <email> and password <password>
    #When the user clicks login button
    #Then the user sees the homepage
#
    #Examples: 
      #| email      | password |
      #| "giang123" | "123456" |
