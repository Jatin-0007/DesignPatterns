package dev.jatin.Factory;

import dev.jatin.Factory.button.Button;
import dev.jatin.Factory.button.IosButton;
import dev.jatin.Factory.dropdown.DropDown;
import dev.jatin.Factory.dropdown.IosDropDown;
import dev.jatin.Factory.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
