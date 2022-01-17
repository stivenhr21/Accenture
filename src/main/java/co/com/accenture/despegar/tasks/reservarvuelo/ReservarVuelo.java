package co.com.accenture.despegar.tasks.reservarvuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.despegar.models.DatosPrueba.obtener;
import static co.com.accenture.despegar.userinterface.reservarvuelo.ReservarVueloUserinterface.*;

public class ReservarVuelo implements Task {

    public static ReservarVuelo idaYvuelta() {
        return Tasks.instrumented(ReservarVuelo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_CIUDAD_ORIGEN, WebElementStateMatchers.isVisible()),
                Click.on(INPUT_CIUDAD_ORIGEN),
                Enter.theValue(obtener("origen")).into(INPUT_CIUDAD_ORIGEN),
                Click.on(OPCION_CIUDAD_ORIGEN),
                Click.on(INPUT_CIUDAD_DESTINO),
                Enter.theValue(obtener("destino")).into(INPUT_CIUDAD_DESTINO),
                Click.on(OPCION_CIUDAD_DESTINO),
                Click.on(CAMPO_FECHA_IDA),
                Click.on(FECHA_IDA),
                Click.on(FECHA_VUELTA),
                Click.on(BOTON_CERRAR_METODOS_LOGIN),
                Click.on(BOTON_BUSCAR),
                WaitUntil.the(BOTON_COMPRAR, WebElementStateMatchers.isVisible()),
                Scroll.to(BOTON_COMPRAR).andAlignToBottom(),
                Click.on(BOTON_COMPRAR),
                WaitUntil.the(BOTON_CONTINUAR, WebElementStateMatchers.isVisible()),
                Click.on(BOTON_CONTINUAR)
        );
    }
}
