package rosy.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import rosy.ui.HomeScreen;
import rosy.ui.VaultScreen;

import java.util.List;

public class SuccessfullLogin implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade buttonHome= HomeScreen.HOME_BUTTON.resolveFor(actor);
        return buttonHome.isVisible();
    }
}
