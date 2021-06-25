package com.company.DataAccess;

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
