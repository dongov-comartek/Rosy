package rosy.tasks;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import rosy.actions.Press;
import rosy.actions.Wait;
import rosy.ui.LoginScreen;
import rosy.ui.VaultDetailScreen;
import rosy.ui.VaultScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchVault implements Task {
    String value;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.value).into(VaultScreen.INPUT_SEARCH),
                Click.on(VaultScreen.INPUT_SEARCH),
                Press.key(AndroidKey.ENTER)
               // Hit.the(Keys.ENTER).into(VaultScreen.INPUT_SEARCH)
              //  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER))

           //     WaitUntil.the(VaultDetailScreen.Thum, isVisible()).forNoMoreThan(60).seconds()
        );


    }
    public SearchVault(String value){
        this.value=value;
    }
    public static SearchVaultBuilder keyword(String value){
        return new SearchVaultBuilder(value);
    }
    public static class SearchVaultBuilder
    {
        private String value;
        public SearchVaultBuilder(String value)
        {
            this.value = value;
        }

        public SearchVault run(){
            return instrumented(SearchVault.class, this.value);
        }

    }


}
