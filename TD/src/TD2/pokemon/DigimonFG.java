package TD2.pokemon;

public class DigimonFG implements Digimon {

    private int nbPattes;

    public DigimonFG(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }
}
