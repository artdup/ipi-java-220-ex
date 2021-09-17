package com.ipiecoles.java.java220;

import java.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
    String nom;
    String prenom;
    String matricule;
    LocalDate dateEmbauche;
    Double salaire;

    Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    Integer getNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - this.dateEmbauche.getYear();
    }

    public Integer getNbConges(){
        return Entreprise.NB_CONGES_BASE;
    }
}
