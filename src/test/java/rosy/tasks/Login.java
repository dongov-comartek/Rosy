package rosy.tasks;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import rosy.abilities.Authenticate;
import rosy.actions.Press;
import rosy.actions.Swipe;
import rosy.ui.HomeScreen;
import rosy.ui.LoginScreen;
import rosy.ui.VaultDetailScreen;
import rosy.ui.WelcomeScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Login implements Task {

    String email;
    String password;
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade biometrics= WelcomeScreen.WELCOME_TEXT.resolveFor(actor);
        if(email==null && password==null)
        {
            Authenticate cre = Authenticate.as(actor);
            this.email = cre.username();
            this.password = cre.password();
        }

        actor.attemptsTo(
                        Enter.theValue(this.email).into(LoginScreen.EMAIL_FIELD),
                        Press.key(AndroidKey.ENTER),
                       // Click.on(LoginScreen.PASSWORD_FIELD),
                        Press.key(Integer.parseInt(String.valueOf(1))+7),
                        Press.key(Integer.parseInt(String.valueOf(2))+7),
                        Press.key(Integer.parseInt(String.valueOf(3))+7),
                        Press.key(Integer.parseInt(String.valueOf(4))+7),
                        Press.key(Integer.parseInt(String.valueOf(5))+7),
                        Click.on(HomeScreen.CANCEL)


        );
    }

    public Login()
    {

    }

    public Login(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public static LoginBuilder withEmail(String email)
    {
        return new LoginBuilder(email);
    }

    public static Login withHisCredential()
    {
        return instrumented(Login.class);
    }

    public static class LoginBuilder
    {
        private String email;
        public LoginBuilder(String email)
        {
            this.email = email;
        }

        public Login andPassword(String password)
        {
            return instrumented(Login.class, email, password);
        }
    }
}
