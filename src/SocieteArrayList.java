import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<employe>, IRechercheAvancee<employe> {
    private List<employe> liste;
    public SocieteArrayList() {
        liste = new ArrayList<employe>();
    }

    @Override
    public void ajouterEmploye(employe e) {
        if (e != null) {
            liste.add(e);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (nom == null) return false;

        for (int i = 0; i < liste.size(); i++) {
            employe e = liste.get(i);
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe e) {
        if (e == null) return false;

        for (int i = 0; i < liste.size(); i++) {
            employe emp = liste.get(i);
            if (emp.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(employe e) {
        if (e != null) {
            liste.remove(e);
        }
    }

    @Override
    public void displayEmploye() {
        if (liste.isEmpty()) {
            System.out.println("Aucune employe");
        } else {
            for (int i = 0; i < liste.size(); i++) {
                System.out.println(liste.get(i));
            }
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<employe> cmp = new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int res = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (res != 0) return res;

                res = Integer.compare(e1.getGrade(), e2.getGrade());
                if (res != 0) return res;

                return e1.getNom().compareTo(e2.getNom());
            }
        };
        Collections.sort(liste, cmp);
    }

    @Override
    public List<employe> rechercherParDepartement(String nomDepartement) {
        List<employe> resultat = new ArrayList<employe>();

        if (nomDepartement != null) {
            for (int i = 0; i < liste.size(); i++) {
                employe e = liste.get(i);
                if (e.getNomDepartement().equals(nomDepartement)) {
                    resultat.add(e);
                }
            }
        }

        return resultat;
    }
}
