package rosy.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.TheSize;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.targets.Target;
import rosy.ui.HomeScreen;
import rosy.ui.VaultDetailScreen;
import rosy.ui.WelcomeScreen;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.targets.EnsureFieldVisible.ensureThat;

public class CheckNavigation implements Question<Boolean> {

 Boolean leftMenu;
    @Override

    //đóng menu
    public Boolean answeredBy(Actor actor) {

        WebElementFacade leftMenu= HomeScreen.LARGE_NAVIGATION.resolveFor(actor);

        return leftMenu.isVisible();
    }

}
