$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber/Calculator.feature");
formatter.feature({
  "name": "Calculator",
  "description": "  As a user\n  I want to use a calculator\n  So that I can calculate with numbers",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator with value 0",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add 3",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_add(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 3",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator with value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add 3",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_add(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 8",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Subtract a number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator with value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I subtract 3",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_subtract(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 2",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiply a number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator with value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I multiply 2",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_multiply(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 10",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiply and Add a number",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator with value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I multiply 2",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_multiply(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add 2",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.i_add(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 12",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Multiply numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a calculator with value \u003cvalues\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I multiply 2",
  "keyword": "When "
});
formatter.step({
  "name": "The value of the calculator is now \u003cresults\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "values",
        "results"
      ]
    },
    {
      "cells": [
        "5",
        "10"
      ]
    },
    {
      "cells": [
        "10",
        "20"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Multiply numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a calculator with value 5",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I multiply 2",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_multiply(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 10",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Multiply numbers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have a calculator with value 10",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.an_calculator_with_value(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I multiply 2",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_multiply(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The value of the calculator is now 20",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_value_of_the_calculator_is_now(Integer)"
});
formatter.result({
  "status": "passed"
});
});