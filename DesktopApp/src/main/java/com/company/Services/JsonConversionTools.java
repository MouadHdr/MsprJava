package com.company.Services;

import com.company.Abstractions.IEntity;
import com.company.Abstractions.IJsonConversionTools;
import com.company.DataAccess.Personne.PersonneDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConversionTools implements IJsonConversionTools {

    public ObjectMapper mapper = new ObjectMapper();

    @Override
    public String ObjectConvertToJson(Object MyObjToConvert) {

        String ConvertedJsonText = null;

        try {
            ConvertedJsonText = mapper.writeValueAsString(MyObjToConvert);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return ConvertedJsonText;
    }

    @Override
    public Object JsonConvertToObject(String json, Object ObjToEnrich) {

        try {
            ObjToEnrich = mapper.readValue(json, ObjToEnrich.getClass());
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return ObjToEnrich;
    }
}