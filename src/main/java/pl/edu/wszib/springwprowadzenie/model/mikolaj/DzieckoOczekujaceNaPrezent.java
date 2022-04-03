package pl.edu.wszib.springwprowadzenie.model.mikolaj;

public interface DzieckoOczekujaceNaPrezent {

    default boolean dajPrezent(Prezent prezent) {
        return prezent.prezentType() == zyczenie();
    };

    PrezentType zyczenie();

}
