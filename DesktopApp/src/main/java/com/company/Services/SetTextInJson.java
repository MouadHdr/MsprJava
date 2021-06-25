package com.company.Services;

import com.company.Abstractions.ISetTextInJson;
import com.company.DataAccess.PersonneCollector;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SetTextInJson implements ISetTextInJson {

    public String ConvertedJsonText;

    public SetTextInJson()
    {
    }

    @Override
    public String ConvertToJson(Object MyObjToConvert) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            ConvertedJsonText = mapper.writeValueAsString(MyObjToConvert);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return ConvertedJsonText;
    }
}
