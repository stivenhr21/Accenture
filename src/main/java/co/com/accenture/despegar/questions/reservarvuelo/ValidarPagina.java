package co.com.accenture.despegar.questions.reservarvuelo;

import co.com.accenture.despegar.util.transversal.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.accenture.despegar.userinterface.reservarvuelo.ReservarVueloUserinterface.TEXTO_DETALLE_DEL_PAGO;

public class ValidarPagina implements Question<String> {

    public static ValidarPagina dePagos() {
        return new ValidarPagina();
    }

    @Override
    public String answeredBy(Actor actor) {
        Esperar.unTiempo(3000);
        return Text.of(TEXTO_DETALLE_DEL_PAGO).viewedBy(actor).asString();
    }
}
