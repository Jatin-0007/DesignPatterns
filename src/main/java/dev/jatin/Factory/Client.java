package dev.jatin.Factory;

import dev.jatin.Factory.button.Button;
import dev.jatin.Factory.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();
    }
}
