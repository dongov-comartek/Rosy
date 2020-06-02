package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import rosy.tasks.AddVault;

public class CheckAddVault implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return AddVault.tagName== AddVault.tagName1;
    }
}
