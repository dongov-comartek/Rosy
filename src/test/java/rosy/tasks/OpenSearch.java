package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSearch implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VaultScreen.SEARCH)
        );
    }
    public static OpenSearch open()
    {
        return instrumented(OpenSearch.class);
    }
}
