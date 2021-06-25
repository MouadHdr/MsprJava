package com.company.DataAccess.Personne;

import com.company.DataAccess.Personne.PersonneDao;

public class PersonneCollector {

    public PersonneCollector()
    {
    }

    public PersonneDao CreatePersonne()
    {
        PersonneDao personneDao = new PersonneDao("RAFAEL","Mouad", 21, 1.82);
        return personneDao;
    }
}
