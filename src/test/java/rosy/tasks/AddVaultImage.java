package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.actions.ChoosePicture;
import rosy.ui.AddVaultScreen;
import rosy.ui.HomeScreen;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddVaultImage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.ADD_VAULT_BUTTON),
                Click.on(AddVaultScreen.ENABLE_ACCESS),
                Click.on(AddVaultScreen.ALLOW_ACCESS),
                ChoosePicture.random().with(2),
                Click.on(AddVaultScreen.UPLOAD),
               // Click.on(VaultScreen.TAP_RESET_BUTTON),
                WaitUntil.the(VaultScreen.TAP_RESET_BUTTON, isVisible()).forNoMoreThan(60).seconds()
        );
    }
    public static AddVaultImage add()
    {
        return instrumented(AddVaultImage.class);
    }
}
