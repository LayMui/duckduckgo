Feature: Replace Logo
  In order to easily replace logo by stubbing backends
  As a website user James
  James wants to able to replace duckduckgo with serenityBDD logo

  Background:
    Given James is at the duckduckgo website

@test
  Scenario: able to replace logo
    When he see the duckduckgo logo 
    Then he is able to get it replaced with serenityBDD logo

