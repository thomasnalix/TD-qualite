package TD3.produit;

public class ProduitSimple extends Produit {

    private double prix;


    public ProduitSimple(Double prix, String nom) {
        super(nom);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit : " +
                "Nom : " + nom  +
                ", prix : " + prix;
    }

    @Override
    public double getPrix() {
        return prix;
    }
}
