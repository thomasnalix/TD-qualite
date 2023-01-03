package TD3.produit;

public class testProduit {

    public static void main(String[] args) {
        ProduitComposite ordinateur = new ProduitComposite("Ordi");
        Produit rtx = new ProduitSimple(980.0,"RTX 2080");
        Produit cm = new ProduitSimple(200.0, "ASUS CM");

        ordinateur.addProduit(rtx);
        ordinateur.addProduit(cm);
        System.out.println(rtx);
        System.out.println(ordinateur.getPrix());
        System.out.println(ordinateur);
    }
}
