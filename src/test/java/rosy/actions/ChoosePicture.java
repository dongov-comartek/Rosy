package rosy.actions;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import rosy.ui.AddVaultScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChoosePicture implements Interaction {
    int index=0;
    int itemCount=1;

    public ChoosePicture(int index, int count)
    {
        this.index = index;
        this.itemCount=count;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Integer> lstItems = new ArrayList<>();
        List<WebElementFacade> lstPictures = AddVaultScreen.PICTURE_LIST.resolveAllFor(actor);
        if(index<0)
        {
            while (lstItems.size()<this.itemCount)
            {
                int expectedIndex = -1;
                while (expectedIndex<0) {
                    Random rdn = new Random();
                    index = rdn.nextInt(lstPictures.size());
                    if(lstItems.indexOf(index)==-1)
                        expectedIndex=index;
                }
                lstItems.add(expectedIndex);
            }
        }
        /*
        actor.attemptsTo(
                Click.on(lstPictures.get(this.index))
        );*/
        for(Integer i: lstItems)
        {
            lstPictures.get(i).click();
        }
    }

   /* public static Interaction at(int index)
    {
        return instrumented(ChoosePicture.class, index, 1);
    }
    
    */

    public static ChoosePictureBuilder random()
    {
        return new ChoosePictureBuilder();
    }

    public static class ChoosePictureBuilder
    {
        public Interaction with(int count)
        {
            return instrumented(ChoosePicture.class, -1, count);
        }
    }
}
