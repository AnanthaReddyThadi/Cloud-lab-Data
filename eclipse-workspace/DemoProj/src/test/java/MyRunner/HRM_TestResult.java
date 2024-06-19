package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="D:\\Users\\Hp\\eclipse-workspace\\Guruschools13-maven\\src\\test\\java\\feature\\tester.feature",
		features="C:/Users/Administrator/eclipse-workspace/DemoProj/src/test/java/feature/OrangeHRMLogin.feature",
		glue="stepDef",
		plugin = {"pretty","html:target/OrangeHRM_Reports"},
		monochrome = true
	)
public class HRM_TestResult {

}