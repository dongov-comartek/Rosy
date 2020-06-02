package rosy.tasks;

import io.appium.java_client.MobileElement;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.actions.ChoosePicture;
import rosy.ui.AddVaultScreen;
import rosy.ui.HomeScreen;
import rosy.ui.VaultDetailScreen;
import rosy.ui.VaultScreen;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddVault implements Task {
    public static String tagName;
    public static String tagName1;
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> element = VaultScreen.VAULT_ITEMS.resolveAllFor(actor);
         tagName = element.get(0).getAttribute("contentSize");



        actor.attemptsTo(
                Click.on(HomeScreen.ADD_VAULT_BUTTON),
                Click.on(AddVaultScreen.ENABLE_ACCESS),
                Click.on(AddVaultScreen.ALLOW_ACCESS),
                ChoosePicture.random().with(1),
                Click.on(AddVaultScreen.UPLOAD),
                WaitUntil.the(VaultScreen.BUTTON_PHOTOS, isVisible()).forNoMoreThan(60).seconds(),
                WaitUntil.the(VaultScreen.VAULT_ITEMS,isVisible()).forNoMoreThan(20).seconds()


        );
        List<WebElementFacade> element1 = VaultScreen.VAULT_ITEMS.resolveAllFor(actor);
         tagName1 = element1.get(0).getAttribute("contentSize");

    }

    public static AddVault add()
    {
        return instrumented(AddVault.class);
    }
}
