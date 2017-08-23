Feature: Daily Song API

  Background: The API calls the song endpoint 'videos' due to the expectation to use music videos.

  @tag
  Scenario: Create a video in the Daily songs API
    Given Create a Video API "baseURl"
    When The user makes a request with the header "Parmaeter"
    Then The user validates the response with the "Expected"
    Then The user receives the status "code" for the response
