package pl.edu.wszib.springwprowadzenie.model;

public class MyPrototype implements Cloneable{

    private final static MyPrototype PROTOTYPE = new MyPrototype();

    private MyPrototype() {

    }

    public static MyPrototype getInstance() {
        try {
            return (MyPrototype) PROTOTYPE.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
