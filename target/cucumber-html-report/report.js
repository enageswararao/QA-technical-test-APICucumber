$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/pressassociation/qa_technical_test/DialySongAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Daily Song API",
  "description": "",
  "id": "daily-song-api",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "The API calls the song endpoint \u0027videos\u0027 due to the expectation to use music videos.",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Create a video in the Daily songs API",
  "description": "",
  "id": "daily-song-api;create-a-video-in-the-daily-songs-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Create a Video API \u0027baseURl\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The user makes a request with the header",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user validates the response with the",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user receives the status code for the response",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionTest.i_have_the_current_testdiary_url()"
});
formatter.result({
  "duration": 2321440453,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.i_open_the_testdiary_url()"
});
formatter.result({
  "duration": 256577,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.testdiary_should_be_displayed1()"
});
formatter.result({
  "duration": 168913,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionTest.testdemo()"
});
formatter.result({
  "duration": 165064,
  "status": "passed"
});
});