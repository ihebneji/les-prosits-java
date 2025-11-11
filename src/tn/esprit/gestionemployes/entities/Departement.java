package tn.esprit.gestionemployes.entities;

import java.util.Objects;

public class Departement {

    private int id ;
    private String nomDepartement ;
    private int nombreEmployes ;

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }
    public Departement(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {}
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {}
    public int getNombreEmployes() {
        return nombreEmployes;

    }
    public void setNombreEmployes(int nombreEmployes) {}
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Departement that)) return false;
        return id == that.id && nombreEmployes == that.nombreEmployes && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement, nombreEmployes);
    }





}
