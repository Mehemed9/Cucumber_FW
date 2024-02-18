Feature: TalentTEK Signup Feature
  Background:
    Given student at TalentTEK Homepage
    And student click on Create New Account button
    @signup
    Scenario: student enter their valid information to create new account.

      And  student enter their First Name"NAHID"
      And student enter their Last Name "Mehmed"
      And student enter their Email Address "Nahid12@gmail.com"
      And student enter their password "123456"
      And student confirm their password "123456"
      And student enter their date of birth Month "Feb"
      And student enter their date of birth Day "1"
      And student enter their date of birth Year "1995"
      And student choose their gender "Male"
      And student agree terms and conditions
      When student click on create my account button
      Then student should successfully create their account











