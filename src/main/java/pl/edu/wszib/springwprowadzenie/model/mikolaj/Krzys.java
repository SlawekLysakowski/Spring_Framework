package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public class Krzys implements DzieckoOczekujaceNaPrezent{

    @Override
    public PrezentType zyczenie() {
        return PrezentType.ROWER;
    }
}
