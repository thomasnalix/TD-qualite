package TD3.produit;

public abstract class Produit {

    protected String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    public abstract double getPrix();

}
