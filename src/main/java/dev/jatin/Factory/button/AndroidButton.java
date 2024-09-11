package dev.jatin.Factory.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing Android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Android Button clicked");

    }
}
