package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Kasia implements DzieckoOczekujaceNaPrezent{

    @Override
    public PrezentType zyczenie() {
        return PrezentType.IPHONE;
    }
}
