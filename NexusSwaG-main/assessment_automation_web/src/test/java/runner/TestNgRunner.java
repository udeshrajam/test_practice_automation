package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps","assessment.web.ui.utility"},
        plugin = {"pretty", "html:src/test/Reports/HTMLReports.html"}

)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}

