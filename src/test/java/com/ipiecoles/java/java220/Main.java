package com.ipiecoles.java.java220;

import java.time.LocalDate;

public class Main {
    public static void  main(String[]args) {
        Employe employe = new Employe();
        employe.nom = "Doe";
        employe.prenom = "Joe";

        Employe employe2 = new Employe("Doe", "Jane", "M12345", LocalDate.now(), 2000.0);
        System.out.println(employe2.nom);
        System.out.println(employe2.prenom);
        System.out.println(employe2.matricule);

        System.out.println(employe2.dateEmbauche.getYear());
        System.out.println(employe2.salaire);
        System.out.println(employe2.getNombreAnneeAnciennete());

    }
}
