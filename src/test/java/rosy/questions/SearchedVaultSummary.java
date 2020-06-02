package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.VaultScreen;
import rosy.ui.WelcomeScreen;

public class SearchedVaultSummary implements Question<String> {
//click button vault
    @Override
    public String answeredBy(Actor actor) {

            return Text.of(VaultScreen.BUTTON_PHOTOS).viewedBy(actor).asString();

    }
}
