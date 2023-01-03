package TD2.Exercice4;

public class EtudiantExample {

    public static void main(String[] args) {
        Etudiant etudiant = new EtudiantBuilder("1", "1", "Nalix", "Thomas")
                                        .setAnneeBac(2020)
                                        .setDateNaissance("19/08/2003")
                                        .createEtudiant();

        System.out.println(etudiant);
    }
}
