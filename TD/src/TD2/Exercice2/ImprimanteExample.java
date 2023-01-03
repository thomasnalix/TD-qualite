package TD2.Exercice2;

public class ImprimanteExample {

    public static void main(String[] args) {
        Imprimante imprimante = Imprimante.getInstance();
        imprimante.imprimer();
        imprimante.imprimer();
        imprimante.imprimer();
        System.out.println(imprimante.getNbImpression());
    }
}
