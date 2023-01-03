package TD2.Exercice2;

public class Imprimante2 {

    private int nbPages = 0;
    private static Imprimante2 instance;
    private Imprimante2() {}

    public static synchronized Imprimante2 getInstance() {
        if (instance == null) {
            instance = new Imprimante2();
        }
        return instance;
    }

    public void imprimer(int nbPage) {
        nbPages += nbPage;
    }

    public int getNbPage() {
        return nbPages;
    }
}
