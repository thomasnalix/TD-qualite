package TD2.Exercice4.classInterne;

public class EtudiantExampleOld {

    public static void main(String[] args) {
        EtudiantOld etu1 = new EtudiantOld.EtudiantBuilder("NIP","787867876876E","Nalix", "Thomas")
                .setEmail("thomas.nalix@etu.umontpellier")
                .setBac(1)
                .createEtudiant();
        EtudiantOld etu2 = new EtudiantOld.EtudiantBuilder("NIP","23E52454354E","Cazaux","Loris")
                .setEmail("loris.cazaux@etu.umontpellier.fr")
                .setBac(1)
                .setLieuNaissance("Avignon")
                .setNumeroTelephone("0783747843")
                .setNomUsuel("Laurice")
                .setDomicile("Montpellier")
                .createEtudiant();
        System.out.println(etu2);
    }
}
