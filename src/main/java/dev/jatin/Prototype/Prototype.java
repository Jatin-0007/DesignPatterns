package dev.jatin.Prototype;

public interface Prototype<T> {
    T clone();    //-----> T is generic return type as it can be anything if any class implements Prototype interface
}
