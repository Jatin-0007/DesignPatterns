package dev.jatin.Factory;

import dev.jatin.Factory.button.Button;
import dev.jatin.Factory.dropdown.DropDown;
import dev.jatin.Factory.menu.Menu;

public interface UIFactory {

    //Factory Methods

    Button createButton();

    Menu createMenu();

    DropDown createDropDown();


}
