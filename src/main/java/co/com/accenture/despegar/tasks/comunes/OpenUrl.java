package co.com.accenture.despegar.tasks.comunes;

import co.com.accenture.despegar.userinterface.reservarvuelo.ReservarVueloUserinterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrl implements Task {

    private ReservarVueloUserinterface reservarVueloUserinterface;

    public static OpenUrl thePage() {
        return Tasks.instrumented(OpenUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(reservarVueloUserinterface)
        );
    }
}
