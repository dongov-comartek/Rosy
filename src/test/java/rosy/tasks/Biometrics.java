package rosy.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import rosy.ui.HomeScreen;
import rosy.ui.WelcomeScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Biometrics implements Task {
  boolean isAllow = false;
    public Biometrics(boolean isAllow)
    {
        this.isAllow=isAllow;
    }


    @Override
    @Step("{0} allow the Location permission access")
    public <T extends Actor> void performAs(T actor) {

       actor.attemptsTo(
                Check.whether(isAllow).andIfSo(
                        Click.on(HomeScreen.OK)
                ).otherwise(
                        Click.on(HomeScreen.CANCEL)
                )



        );




    }

    public static Biometrics Cancel()
    {
        return instrumented(Biometrics.class, false);
    }

    public static Biometrics OK()
    {
        return instrumented(Biometrics.class, true);
    }


}
