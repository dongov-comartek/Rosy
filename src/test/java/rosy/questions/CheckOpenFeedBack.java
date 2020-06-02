package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import rosy.ui.FeedBackSreen;

public class CheckOpenFeedBack implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FeedBackSreen.BUTTON_SEND_FEEDBACK).viewedBy(actor).asString();
    }
}
