package com.shiftedtech.qa;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //tags = { "@smoke,@debug" }, /* debug or smoke test */


        features =   {"src/test/resources/features/LoginFunctionality.feature",
                      "src/test/resources/features/CartFunctionality.feature",
                      "src/test/resources/features/NegLoginDataDriven.feature",
                      "src/test/resources/features/SearchFunction.feature",
                      "src/test/resources/features/SearchFunction.feature"},

        glue = {"com.shiftedtech.qa.framework.steps"},


        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        }
)

public class BDDRunner {


}
