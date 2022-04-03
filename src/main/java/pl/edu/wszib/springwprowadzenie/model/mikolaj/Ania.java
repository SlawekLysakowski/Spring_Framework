package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Ania implements DzieckoOczekujaceNaPrezent{

    @Override
    public PrezentType zyczenie() {
        return PrezentType.LALKA;
    }
}
