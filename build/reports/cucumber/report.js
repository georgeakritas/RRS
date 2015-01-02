$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SampleTest.feature");
formatter.feature({
  "line": 1,
  "name": "Proof Of Concept test for Rackroom",
  "description": "We will demonstrate how to automate\r\nand time actions",
  "id": "proof-of-concept-test-for-rackroom",
  "keyword": "Feature"
});
formatter.before({
  "duration": 135893,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I add two products to the cart",
  "description": "",
  "id": "proof-of-concept-test-for-rackroom;i-add-two-products-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have navigated to the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for the text KJ890PDP",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Locate the link in the search results",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I Select the product",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select the first size",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I navigate to the PDP of 751302",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I select the second size",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I navigate to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleTest_steps.groovy:12"
});
formatter.result({
  "duration": 32623739317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KJ890PDP",
      "offset": 22
    }
  ],
  "location": "SampleTest_steps.groovy:21"
});
formatter.result({
  "duration": 16190123617,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:27"
});
formatter.result({
  "duration": 40543558,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:33"
});
formatter.result({
  "duration": 1741206143,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:39"
});
formatter.result({
  "duration": 138226971,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:42"
});
formatter.result({
  "duration": 768567011,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:46"
});
formatter.result({
  "duration": 2109692609,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:53"
});
formatter.result({
  "duration": 166694093,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:42"
});
formatter.result({
  "duration": 681530680,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest_steps.groovy:56"
});
formatter.result({
  "duration": 10961058848,
  "status": "passed"
});
formatter.after({
  "duration": 53083,
  "status": "passed"
});
});