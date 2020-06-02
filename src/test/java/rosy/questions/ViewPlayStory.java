package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.VaultDetailScreen;
public class ViewPlayStory implements Question<Boolean> {
    String time="00:00";
    @Override
    public Boolean answeredBy(Actor actor) {

        return Text.of(VaultDetailScreen.TIMEVIDEO).viewedBy(actor).asString() != time;
    }
}
