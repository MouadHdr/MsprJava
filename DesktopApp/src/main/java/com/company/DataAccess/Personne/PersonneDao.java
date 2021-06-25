package com.company.DataAccess.Personne;

import com.company.Abstractions.IEntity;

public class PersonneDao implements IEntity {

    public String Nom;
    public String Prenom;
    public int Age;
    public double Taille;

    public PersonneDao(String nom, String prenom, int age, double taille)
    {
        Nom = nom;
        Prenom = prenom;
        Age = age;
        Taille = taille;
    }

    public PersonneDao() {

    }

    public String getNom()
    {
        return Nom;
    }
}
