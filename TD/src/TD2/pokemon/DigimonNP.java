package TD2.pokemon;

public class DigimonNP implements Digimon {

    private int nbPattes;

    public DigimonNP(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    @Override
    public String toString() {
        return "DigimonNP : " +
                "nbPattes=" + nbPattes;
    }
}
