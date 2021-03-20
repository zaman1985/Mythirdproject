import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition"
//        plugin = {
//                "json:target/cucumber.json"
     //   }
)

public class TestRunner extends AbstractTestNGCucumberTests {

    // group the test and run it together and generate report
}