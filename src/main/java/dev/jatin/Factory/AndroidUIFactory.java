package dev.jatin.Factory;

import dev.jatin.Factory.button.AndroidButton;
import dev.jatin.Factory.button.Button;
import dev.jatin.Factory.dropdown.AndroidDropDown;
import dev.jatin.Factory.dropdown.DropDown;
import dev.jatin.Factory.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
