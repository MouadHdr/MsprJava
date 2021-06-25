package com.company.Abstractions;

import com.company.DataAccess.Personne.PersonneDao;

public interface IJsonConversionTools {
    String ObjectConvertToJson(Object MyObjToConvert);
    Object JsonConvertToObject(String json, Object myObj);
}
