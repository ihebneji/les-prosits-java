package tn.esprit.gestionemployes.main;
import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.services.DepartementHashSet;
import tn.esprit.gestionemployes.entities.*;
import tn.esprit.gestionemployes.services.*;
import java.util.List;
public class main {
    public static void main(String[] args) {
        DepartementHashSet service = new DepartementHashSet();
         SocieteArrayList societe = new SocieteArrayList();
        AffectationHashMap affect = new AffectationHashMap();


       /* Departement d1 = new Departement(1, "It", 10);
        Departement d2 = new Departement(2, "RH", 5);
        Departement d3 = new Departement(3, "Compta", 8);

        service.ajouterDepartement(d1);
        service.ajouterDepartement(d2);
        service.ajouterDepartement(d3);

        System.out.println("\n Recherche par nom : " + service.rechercherDepartement("RH"));

        System.out.println("\n Liste des departements :");
        service.afficherDepartements();

        System.out.println("\n Tri par ID :");
        service.trierDepartementsParId();

        System.out.println("\n Tri par Nom et Nombre d Employe :");
        service.trierDepartementsParNomEtNombreEmployes();*/



        employe e1 = new employe(1, "Ali", "Ben Salah", "IT", 2);
        employe e2 = new employe(2, "Sami", "Trabelsi", "RH", 1);
        employe e3 = new employe(3, "Mouna", "Hammami", "Finance", 3);

        Departement dep1 = new Departement(10, "IT", 20);
        Departement dep2 = new Departement(20, "RH", 8);
        Departement dep3 = new Departement(30, "Finance", 15);

        affect.ajouterEmployeDepartement(e1, dep1);
        affect.ajouterEmployeDepartement(e2, dep2);
        affect.ajouterEmployeDepartement(e3, dep3);
        affect.ajouterEmployeDepartement(e1, dep1);
        affect.ajouterEmployeDepartement(e2, dep2);
        affect.ajouterEmployeDepartement(e3, dep3);

        System.out.println("\nListe des affectations :");
        affect.afficherEmployesEtDepartements();

        affect.ajouterEmployeDepartement(e1, dep3);

        System.out.println("\nEmployés dans la structure :");
        affect.afficherEmployes();

        System.out.println("\nDépartements dans la structure :");
        affect.afficherDepartements();

        System.out.println("\nRecherche employé e2 : " + affect.rechercherEmploye(e2));
        System.out.println("Recherche departement dep3 : " + affect.rechercherDepartement(dep3));

        System.out.println("\nAffectations triées par ID :");
        System.out.println(affect.trierMap());

        affect.supprimerEmployeEtDepartement(e3, dep3);
        System.out.println("\nAprès suppression d'une affectation :");
        affect.afficherEmployesEtDepartements();

        affect.supprimerEmploye(e2);
        System.out.println("\nAprès suppression employé e2 :");
        affect.afficherEmployesEtDepartements();




    }













/*
        societe.ajouterEmploye(new employe(3, "neji", "iheb", "IT", 2));
        societe.ajouterEmploye(new employe(1, "ben Saad", "3li", "compta", 1));
        societe.ajouterEmploye(new employe(2, "Khaled", "Ibrahim", "IT", 1));
        societe.ajouterEmploye(new employe(4, "Nairi", "Yasmine", "Finance", 3));
        societe.ajouterEmploye(new employe(5, "neji", "Rania", "IT", 3));

        System.out.println(" Liste initiale ");
        societe.displayEmploye();


        System.out.println("\nRecherche par nom 'neji' : " + societe.rechercherEmploye("neji"));
        System.out.println("Recherche par nom '3li' : " + societe.rechercherEmploye("3li"));


        employe test = new employe(2, "Khaled", "Ibrahim", "IT", 1);
        System.out.println("\nRecherche par objet  : " + societe.rechercherEmploye(test));


        System.out.println("\n Recherche avance par departement IT ");
        List<employe> it = societe.rechercherParDepartement("IT");
        for (employe e : it) {
            System.out.println(e);
        }


        societe.trierEmployeParId();
        System.out.println("\n Après tri naturel ");
        societe.displayEmploye();


        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n Après tri bl tartib hedhee département, grade, nom");
        societe.displayEmploye();


        societe.supprimerEmploye(test);
        System.out.println("\n Après suppression ");
        societe.displayEmploye();*/
    }

