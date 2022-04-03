package pl.edu.wszib.springwprowadzenie.model.scope;

public class Ciastko {

    private boolean zjedzone = false;

    public void zjedz() {
        zjedzone = true;
    }

    public boolean isZjedzone() {
        return zjedzone;
    }
}
