package rosy.tasks;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import rosy.actions.Press;
import rosy.ui.VaultDetailScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ToVaultDetail implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VaultDetailScreen.CANCELSTORY),
                Click.on(VaultDetailScreen.ADD_YOUR_STORY2),
                Press.key(AndroidKey.BACK)
        );
    }
    public static ToVaultDetail run(){
        return instrumented(ToVaultDetail.class);
    }
}
