package com.company.DataAccess.Eleve;

import com.company.DataAccess.Eleve.EleveDao;

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
