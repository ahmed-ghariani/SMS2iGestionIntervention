package com.sms2i.gestionIntervention.id;

import org.springframework.core.convert.converter.Converter;

public class DepencesDeplacementIdConverter implements Converter<String, DepencesDeplacementId> {
    @Override
    public DepencesDeplacementId convert(String source) {
        String[] ids = source.substring(1).split("_");
        return new DepencesDeplacementId(Long.parseLong(ids[0]),Long.parseLong(ids[1]));
    }
}
