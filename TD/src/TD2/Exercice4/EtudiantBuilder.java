package TD2.Exercice4;

public class EtudiantBuilder {
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

    public EtudiantBuilder(String codeNip, String codeIne, String nom, String prenom) {
        this.codeNip = codeNip;
        this.codeIne = codeIne;
        this.nom = nom;
        this.prenom = prenom;
    }

    public EtudiantBuilder setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
        return this;
    }

    public EtudiantBuilder setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public EtudiantBuilder setLieu(String lieu) {
        this.lieu = lieu;
        return this;
    }

    public EtudiantBuilder setAnneeBac(int anneeBac) {
        this.anneeBac = anneeBac;
        return this;
    }

    public EtudiantBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EtudiantBuilder setDomicile(String domicile) {
        this.domicile = domicile;
        return this;
    }

    public EtudiantBuilder setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public Etudiant createEtudiant() {
        return new Etudiant(codeNip, codeIne, nom, nomUsuel, prenom, dateNaissance, lieu, anneeBac, email, domicile, telephone);
    }
}
