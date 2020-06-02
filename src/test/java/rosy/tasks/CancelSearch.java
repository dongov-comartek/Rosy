package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancelSearch implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VaultScreen.CANCEL_SEARCH)
        );

    }
    public static CancelSearch cancel(){
        return instrumented(CancelSearch.class);
    }
}
