package TD3.produit;

import java.util.ArrayList;

public class ProduitComposite extends Produit {

    private ArrayList<Produit> produits = new ArrayList<>();

    public ProduitComposite(String nom) {
        super(nom);
    }

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    @Override
    public double getPrix() {
        double somme = 0;
        for (Produit produit : produits) {
            somme += produit.getPrix();
        }
        return somme;
    }

    @Override
    public String toString() {
        String message = "Listes des produits : \n";
        for (Produit produit : produits) {
            message += produit + "\n";
        }
        return message;
    }
}
