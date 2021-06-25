package com.company.DataAccess;

public class PersonneDao {
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
}
