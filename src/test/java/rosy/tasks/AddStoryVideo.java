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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddStoryVideo implements Task {
    public static int BeforeAddStory;

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lstVaults = VaultDetailScreen.VIEWSTORY.resolveAllFor(actor);
        BeforeAddStory= lstVaults.size();

        actor.attemptsTo(

              //  Click.on(VaultDetailScreen.VIEW_STORY_BUTTON),
                Click.on(VaultDetailScreen.ADD_YOUR_STORY),
                Click.on(VaultDetailScreen.ENABLE_ACCESS),
                Click.on(VaultDetailScreen.ALLOW_PERMISSION),
                Click.on(VaultDetailScreen.ENABLE_ACCESS),
                Click.on(VaultDetailScreen.ALLOW_PERMISSION),
//                           Click.on(VaultDetailScreen.Opencam),
//                            Click.on(VaultDetailScreen.Opencam),
//                           Click.on(VaultDetailScreen.ENABLE_ACCESS),
                WaitUntil.the(VaultDetailScreen.SCREEN_AFTER_ADD_STORY, isNotVisible()).forNoMoreThan(20).seconds(),
                Click.on(VaultDetailScreen.START_RECORDING),
              //  WaitUntil.the(VaultDetailScreen.REC, isNotVisible()).forNoMoreThan(10).seconds(),
                Wait.aBit(10).inSecond(),
                Click.on(VaultDetailScreen.END_RECORDING)
    //            Wait.aBit(10).inSecond(),
//                Click.on(VaultDetailScreen.SAVE),
//                WaitUntil.the(VaultDetailScreen.UPLOADING, isVisible()).forNoMoreThan(120).seconds()
        );


    }

    public static AddStoryVideo add()
    {
        return instrumented(AddStoryVideo.class);
    }
}
