package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import rosy.actions.ChoosePicture;
import rosy.actions.Wait;
import rosy.ui.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlayStory implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             //  WaitUntil.the(VaultDetailScreen.Thum, isVisible()).forNoMoreThan(60).seconds(),
                Wait.aBit(5).inSecond(),
                Click.on(VaultDetailScreen.PLAY_STORY),

                Wait.aBit(10).inSecond()
              //  Click.on(VaultDetailScreen.BACK_TO_VAULT)
        );

    }

    public static PlayStory play()
    {
        return instrumented(PlayStory.class);
    }

}
