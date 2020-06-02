package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.VaultScreen;

public class CheckOpenSearch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VaultScreen.OPEN_SEARCH).viewedBy(actor).asString();
    }
}
