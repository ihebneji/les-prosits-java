import java.util.List;

public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();


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
        societe.displayEmploye();
    }
}
