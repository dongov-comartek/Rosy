package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.VaultDetailScreen;

public class CheckStartStory implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VaultDetailScreen.SAVE).viewedBy(actor).asString();
    }
}
