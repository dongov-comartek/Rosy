package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.actions.Wait;
import rosy.ui.HomeScreen;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BackToHome implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VaultScreen.TAP_RESET_BUTTON),
                WaitUntil.the(VaultScreen.VAULT_SCREEN_TITLE, isVisible()).forNoMoreThan(60).seconds()
                //Wait.aBit(30).inSecond()
               // Click.on(HomeScreen.HOME_BUTTON)
        );
    }
    public static BackToHome add()
    {
        return instrumented(BackToHome.class);
    }
}
