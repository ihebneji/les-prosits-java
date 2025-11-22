package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.employe;
import tn.esprit.gestionemployes.entities.Departement;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class AffectationHashMap {

    private Map<employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(employe e, Departement d) {
        if (e == null || d == null) return;
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

    public void supprimerEmploye(employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes() {
        for (employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<employe, Departement> trierMap() {
        TreeMap<employe, Departement> sorted = new TreeMap<>(
                Comparator.comparingInt(employe::getId)
        );
        sorted.putAll(affectations);
        return sorted;
    }
}
