package calculator;

import calculator.calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

 public class MyStepdefs {


    private calculator calculator;
    private String value;
    private String operator;
    private String result;

    @Before
    public void before() {
        calculator = new calculator();
    }

    @Given("^The input value is (\\d) and the Operation is (\\d)$")
    public void twoInputValuesAnd(String arg0, String arg1) {
        value = arg0;
        operator = arg1;
    }

    @When("^I enter the operand and operation in calculator$")
    public void iAddTheTwoValues() {
        result = calculator.add(value, operator);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(String arg0) {
        Assert.assertEquals(arg0, result);
    }
}