package com.company.DataAccess;

public class EleveCollector {

    public EleveCollector()
    {
    }

    public EleveDao CreateEleve()
    {
        EleveDao eleveDao = new EleveDao("RAFAEL",16, 12.5);
        return eleveDao;
    }
}
