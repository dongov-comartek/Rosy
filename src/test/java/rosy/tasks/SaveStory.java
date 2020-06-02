package rosy.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.actions.Wait;
import rosy.ui.VaultDetailScreen;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SaveStory implements Task {
    public static int AfterAddStory=0;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.aBit(10).inSecond(),
                Click.on(VaultDetailScreen.SAVE),
                WaitUntil.the(VaultDetailScreen.UPLOADING, isVisible()).forNoMoreThan(120).seconds()
        );

        List<WebElementFacade> lstVaults1 = VaultDetailScreen.VIEWSTORY.resolveAllFor(actor);
        AfterAddStory=lstVaults1.size();
    }
    public static SaveStory saveStory(){
        return instrumented(SaveStory.class);
    }
}
