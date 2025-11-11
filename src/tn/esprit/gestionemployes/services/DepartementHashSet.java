package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.interfaces.IDepartement;
import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println(" departement tajoutet  : " + d.getNomDepartement());
        } else {
            System.out.println(" Ce depart existe cdeja");
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d))
            System.out.println(" Depart supprime : " + d.getNomDepartement());
        else
            System.out.println(" Départ mch mawjoud ");
    }

    @Override
    public void afficherDepartements() {
        if (departements.isEmpty())
            System.out.println(" Aucun depart enregistre");
        else
            departements.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparingInt(Departement::getId));
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator
                .comparing(Departement::getNomDepartement)
                .thenComparing(Departement::getNombreEmployes));
        list.forEach(System.out::println);
    }
}



