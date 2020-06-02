package rosy.tasks;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import rosy.actions.Press;
import rosy.actions.Wait;

import rosy.ui.HomeScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenVault implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.VAULT_NAVIGATION_BUTTON)

        );
    }

    public static OpenVault open()
    {
        return instrumented(OpenVault.class);
    }
}
