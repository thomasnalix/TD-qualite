package TD2.Exercice4;

public class Etudiant {

    private String codeNip;
    private String codeIne;
    private String nom;
    private String nomUsuel;
    private String prenom;
    private String dateNaissance;
    private String lieu;
    private int anneeBac;
    private String email;
    private String domicile;
    private String telephone;

    public Etudiant (String codeNip, String codeIne, String nom, String nomUsuel, String prenom, String dateNaissance, String lieu, int anneeBac, String email, String domicile, String telephone) {
        this.codeNip = codeNip;
        this.codeIne = codeIne;
        this.nom = nom;
        this.nomUsuel = nomUsuel;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.anneeBac = anneeBac;
        this.email = email;
        this.domicile = domicile;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "codeNip='" + codeNip + '\'' +
                ", codeIne='" + codeIne + '\'' +
                ", nom='" + nom + '\'' +
                ", nomUsuel='" + nomUsuel + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", lieu='" + lieu + '\'' +
                ", anneeBac=" + anneeBac +
                ", email='" + email + '\'' +
                ", domicile='" + domicile + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
