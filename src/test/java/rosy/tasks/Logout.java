package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.HomeScreen;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.LOGOUT_BUTTON)
        );
    }

    public static Logout click()
    {
        return instrumented(Logout.class);
    }
}
