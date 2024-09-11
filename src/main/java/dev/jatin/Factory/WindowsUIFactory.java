package dev.jatin.Factory;

import dev.jatin.Factory.button.Button;
import dev.jatin.Factory.button.WindowsButton;
import dev.jatin.Factory.dropdown.DropDown;
import dev.jatin.Factory.dropdown.WindowsDropDown;
import dev.jatin.Factory.menu.Menu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
