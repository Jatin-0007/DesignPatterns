package dev.jatin.Factory.button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing Windows Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking Windows Button");

    }
}
