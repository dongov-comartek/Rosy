package rosy.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.VaultDetailScreen;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenStory implements Task {
    int index=0;
    public OpenStory(int index)
    {
        this.index = index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstVaults = VaultDetailScreen.VIEWSTORY.resolveAllFor(actor);

        actor.attemptsTo(
                Click.on(lstVaults.get(this.index))
             //   Wait.aBit(10).inSecond(),
//                WaitUntil.the(VaultDetailScreen.Thum, isVisible()).forNoMoreThan(20).seconds(),
//                Click.on(VaultDetailScreen.PLAY_STORY),
//                Click.on(VaultDetailScreen.BACK_TO_VAULT)
        );

    }

    public static OpenStory at(int index)
    {
        return instrumented(OpenStory.class, index);
    }


}
