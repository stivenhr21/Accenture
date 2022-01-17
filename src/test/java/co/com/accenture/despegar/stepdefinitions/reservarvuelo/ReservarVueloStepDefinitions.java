package co.com.accenture.despegar.stepdefinitions.reservarvuelo;

import co.com.accenture.despegar.questions.reservarvuelo.ValidarPagina;
import co.com.accenture.despegar.tasks.comunes.OpenUrl;
import co.com.accenture.despegar.tasks.reservarvuelo.ReservarVuelo;
import co.com.accenture.despegar.util.transversal.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.accenture.despegar.models.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservarVueloStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la pagina de inicio de Despegar$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeDespegar() {
        OnStage.theActorCalled("El actor").wasAbleTo(OpenUrl.thePage());
    }

    @Cuando("^el realiza el proceso para reservar un vuelo$")
    public void elRealizaElProcesoParaReservarUnVuelo(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                ReservarVuelo.idaYvuelta());
    }

    @Entonces("^el visualizara la pagina de metodos de pagos$")
    public void elVisualizaraLaPaginaDeMetodosDePagos() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarPagina.dePagos(), Matchers.equalTo(obtener("validacion")))
        );
    }
}
