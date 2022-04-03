package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Tomek implements DzieckoOczekujaceNaPrezent{

    @Override
    public PrezentType zyczenie() {
        return PrezentType.LEGO;
    }
}
