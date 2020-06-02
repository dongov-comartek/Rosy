package rosy.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.actions.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.ui.VaultScreen;
import rosy.ui.VaultDetailScreen;

import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewVault implements Task {
    int index=0;
    public ViewVault(int index)
    {
        this.index = index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstVaults = VaultScreen.VAULT_ITEMS.resolveAllFor(actor);

        actor.attemptsTo(
                Click.on(VaultScreen.TAP_RESET_BUTTON),
                Wait.aBit(10).inSecond(),
                Click.on(lstVaults.get(this.index))
        );
    }

    public static ViewVault at(int index)
    {
        return instrumented(ViewVault.class, index);
    }


}
