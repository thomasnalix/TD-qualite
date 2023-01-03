package TD2.Exercice2;

public class Imprimante {

    private static Imprimante instance;
    private int nbImpression;

    private Imprimante() {}

    public void imprimer() {
        nbImpression++;
    }

    public int getNbImpression() {
        return nbImpression;
    }
    public static Imprimante getInstance() {
        if (instance == null) {
            instance = new Imprimante();
        }
        return instance;
    }
}
