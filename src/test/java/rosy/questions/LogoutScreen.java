package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.WelcomeScreen;

public class LogoutScreen implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WelcomeScreen.WELCOME_TEXT).viewedBy(actor).asString();
    }
}
