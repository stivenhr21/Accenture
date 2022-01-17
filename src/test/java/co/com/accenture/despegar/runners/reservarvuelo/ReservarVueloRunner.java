package co.com.accenture.despegar.runners.reservarvuelo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reservarvuelo/reservar_vuelo.feature",
        //tags = "",
        glue = "co.com.accenture.despegar.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class ReservarVueloRunner {
}
