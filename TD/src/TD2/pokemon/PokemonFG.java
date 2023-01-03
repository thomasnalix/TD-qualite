package TD2.pokemon;

public class PokemonFG implements Pokemon {

    private String nom;
    private int pv;

    public PokemonFG(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int getPv() {
        return pv;
    }

    @Override
    public void setPv(int pv) {
        this.pv = pv;
    }
}
