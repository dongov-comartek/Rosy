package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import rosy.actions.Wait;
import rosy.ui.HomeScreen;
import rosy.ui.VaultDetailScreen;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilterVault implements Task {

    String type;
    public FilterVault(String type){
        this.type=type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(VaultScreen.VAULT_ITEMS, isVisible()).forNoMoreThan(60).seconds(),
                Wait.aBit(5).inSecond(),
                Check.whether(this.type=="Photos").andIfSo(
                Click.on(VaultScreen.BUTTON_PHOTOS)
                ),
                Check.whether(this.type=="Documents").andIfSo(
                        Click.on(VaultScreen.BUTTON_DOCUMENTS)
                ),
                WaitUntil.the(VaultScreen.VAULT_ITEMS, isVisible()).forNoMoreThan(60).seconds()

        );
    }

    public static FilterVault Photos()
    {
        return instrumented(FilterVault.class, "Photos");
    }

    public static FilterVault Documents()
    {
        return instrumented(FilterVault.class, "Documents");
    }

}
