package hellocucumber;

import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("hellocucumber") // Chemin vers les fichiers .feature
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") // Format de sortie
public class RunCucumberTest {
}
