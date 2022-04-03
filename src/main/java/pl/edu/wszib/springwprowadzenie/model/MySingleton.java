package pl.edu.wszib.springwprowadzenie.model;

public class MySingleton {

    private final static MySingleton INSTANCE = new MySingleton();

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        return INSTANCE;
    }

}
