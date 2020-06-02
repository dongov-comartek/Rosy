package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.VaultScreen;

public class CheckCancelSearch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VaultScreen.SEARCH).viewedBy(actor).asString();
    }
}
