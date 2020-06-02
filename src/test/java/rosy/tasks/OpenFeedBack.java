package rosy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import rosy.ui.FeedBackSreen;
import rosy.ui.HomeScreen;
import rosy.ui.VaultDetailScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenFeedBack implements Task {
    String feedback;
    @Override
////    public <T extends Actor> void performAs(T actor) {
////        actor.attemptsTo(
////                Click.on(VaultDetailScreen.CANCELSTORY),
////                Click.on(VaultDetailScreen.CANCEL_TO_VAULT),
////                Click.on(HomeScreen.SHOW_NAVIGATION),
////                Click.on(HomeScreen.FEEDBACK)
////        );
////    }
//    public static OpenFeedBack open(){
//        return instrumented(OpenFeedBack.class);
//    }
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VaultDetailScreen.CANCELSTORY),
                Click.on(VaultDetailScreen.CANCEL_TO_VAULT),
                Click.on(HomeScreen.SHOW_NAVIGATION),
                Click.on(FeedBackSreen.FEEDBACK_BUTTON),
                Enter.theValue(this.feedback).into(FeedBackSreen.TEXT_FEEDBACK)
        );
    }
    public OpenFeedBack(String feedback){
        this.feedback=feedback;
    }
    public static FeedBackBuilder inputFeedBack(String feedback){
        return new FeedBackBuilder(feedback);
    }
    public static class FeedBackBuilder{
        private String feedback;
        public FeedBackBuilder(String feedback)
        {
            this.feedback = feedback;
        }
        public OpenFeedBack input(){
            return instrumented(OpenFeedBack.class,feedback);
        }
    }
}
