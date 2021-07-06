package com.company.DataAccess.Eleve;

public class EleveDao {
    public String Surnom;
    public int Age;
    public double MoyenneGenerale;

    public EleveDao(String surnom, int age, double moyenneGenerale)
    {
        Surnom = surnom;
        Age = age;
        MoyenneGenerale = moyenneGenerale;
    }
}
