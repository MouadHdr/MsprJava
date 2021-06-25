package com.company.DataAccess.Eleve;

import com.company.Abstractions.IEntity;

public class EleveDao implements IEntity {
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
