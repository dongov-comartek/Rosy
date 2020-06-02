package rosy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import rosy.tasks.AddStoryAudio;
import rosy.tasks.AddStoryVideo;
import rosy.tasks.SaveStory;

public class SuccessfulAddStoryAudio implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return SaveStory.AfterAddStory - AddStoryAudio.BeforeAddStory;

    }
}
