package com.hagos.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Utils {
    public static <T> T getObject4StringPayload(String assetStr, Class<T> theclass) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(assetStr, theclass);
    }
}
