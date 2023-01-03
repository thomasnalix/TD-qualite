package TD2.pokemon;

public class PokemonNP implements Pokemon {

    private String leNom;
    private int lepv;

    public PokemonNP(String nom, int pv) {
        this.leNom = nom;
        this.lepv = pv;
    }

    @Override
    public String getNom() {
        return this.leNom;
    }

    @Override
    public void setNom(String nom) {
        this.leNom = nom;
    }

    @Override
    public int getPv() {
        return this.lepv;
    }

    @Override
    public void setPv(int pv) {
        this.lepv = pv;
    }

    @Override
    public String toString() {
        return "PokemonNP : " +
                "leNom='" + leNom + '\'' +
                ", lepv=" + lepv;
    }
}