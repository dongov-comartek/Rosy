package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import rosy.tasks.AddStoryVideo;
import rosy.tasks.SaveStory;

public class SuccessfulAddStoryVideo implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
      //  List<WebElementFacade> lstVaults = VaultDetailScreen.VIEWSTORY.resolveAllFor(actor);

        return SaveStory.AfterAddStory-AddStoryVideo.BeforeAddStory;
    }
}
