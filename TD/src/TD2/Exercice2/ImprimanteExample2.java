package TD2.Exercice2;

public class ImprimanteExample2 {

    public static void main(String[] args) {
        Imprimante2 imprimante = Imprimante2.getInstance();
        imprimante.imprimer(2);
        imprimante.imprimer(1);
        System.out.println(imprimante.getNbPage());
    }
}
