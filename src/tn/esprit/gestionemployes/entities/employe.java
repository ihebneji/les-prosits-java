package tn.esprit.gestionemployes.entities;
public class employe implements Comparable<employe> {

    private String nom;
    private String prenom;
    private String nomDepartement;
    private int id;
    private int grade;


    public employe(int id,String nom, String prenom, String nomDepartement , int grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.id = id;
        this.grade = grade;
    }
    public employe() {
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(employe other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof employe)) return false;

        employe e = (employe) obj;
        return id == e.id &&
                grade == e.grade &&
                (nom != null ? nom.equals(e.nom) : e.nom == null) &&
                (prenom != null ? prenom.equals(e.prenom) : e.prenom == null) &&
                (nomDepartement != null ? nomDepartement.equals(e.nomDepartement) : e.nomDepartement == null);
    }
}
