package rosy.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.VaultDetailScreen;
import rosy.ui.VaultScreen;

import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteVault implements Task {
    private int index=0;
    public DeleteVault(int index)
    {
        this.index = index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstVaults = VaultScreen.VAULT_ITEMS.resolveAllFor(actor);

        actor.attemptsTo(
                Click.on(lstVaults.get(this.index)),
                Click.on(VaultDetailScreen.DELETE_VAULT),
                Click.on(VaultDetailScreen.CONFIRM_DELETE_VAULT)
        );
    }

    public static DeleteVault at(int index)
    {
        return instrumented(DeleteVault.class, index);
    }


}
