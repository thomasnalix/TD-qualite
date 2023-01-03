package TD2.Exercice4.classInterne;

public class EtudiantOld {

    private String codeNip;
    private String codeIne;
    private String nom;
    private String nomUsuel;
    private String prenom;
    private String dateNaissance;
    private String lieuNaissance;
    private int bac;
    private String email;
    private String domicile;
    private String numeroTelephone;

    public EtudiantOld(String codeNip, String codeIne, String nom, String nomUsuel, String prenom, String dateNaissance, String lieuNaissance, int bac, String email, String domicile, String numeroTelephone) {
        this.codeNip = codeNip;
        this.codeIne = codeIne;
        this.nom = nom;
        this.nomUsuel = nomUsuel;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.bac = bac;
        this.email = email;
        this.domicile = domicile;
        this.numeroTelephone = numeroTelephone;
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
                ", lieuNaissance='" + lieuNaissance + '\'' +
                ", bac=" + bac +
                ", email='" + email + '\'' +
                ", domicile='" + domicile + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                '}';
    }

    public static class EtudiantBuilder {
        private String codeNip;
        private String codeIne;
        private String nom;
        private String nomUsuel;
        private String prenom;
        private String dateNaissance;
        private String lieuNaissance;
        private int bac;
        private String email;
        private String domicile;
        private String numeroTelephone;

        public EtudiantBuilder setCodeNip(String codeNip) {
            this.codeNip = codeNip;
            return this;
        }

        public EtudiantBuilder setCodeIne(String codeIne) {
            this.codeIne = codeIne;
            return this;
        }

        public EtudiantBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EtudiantBuilder setNomUsuel(String nomUsuel) {
            this.nomUsuel = nomUsuel;
            return this;
        }

        public EtudiantBuilder setPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EtudiantBuilder setDateNaissance(String dateNaissance) {
            this.dateNaissance = dateNaissance;
            return this;
        }

        public EtudiantBuilder setLieuNaissance(String lieuNaissance) {
            this.lieuNaissance = lieuNaissance;
            return this;
        }

        public EtudiantBuilder setBac(int bac) {
            this.bac = bac;
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

        public EtudiantBuilder setNumeroTelephone(String numeroTelephone) {
            this.numeroTelephone = numeroTelephone;
            return this;
        }

        public EtudiantBuilder(String codeNip, String codeIne, String nom, String prenom) {
            this.codeNip = codeNip;
            this.codeIne = codeIne;
            this.nom = nom;
            this.prenom = prenom;
        }

        public EtudiantOld createEtudiant() {
            return new EtudiantOld(codeNip, codeIne, nom, nomUsuel, prenom, dateNaissance, lieuNaissance, bac, email, domicile, numeroTelephone);
        }
    }
}
