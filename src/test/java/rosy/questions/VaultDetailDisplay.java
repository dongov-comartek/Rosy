package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import rosy.ui.VaultDetailScreen;
import rosy.ui.VaultScreen;
//XEM DA VAO VAULT
public class VaultDetailDisplay implements Question<String> {//Question<Boolean>
    @Override
    public String answeredBy(Actor actor) {
      //  return Visibility.of(VaultDetailScreen.CONTAINER).viewedBy(actor).resolve();
        return Text.of(VaultDetailScreen.VIEW_STORY_BUTTON).viewedBy(actor).asString();
    }
}
