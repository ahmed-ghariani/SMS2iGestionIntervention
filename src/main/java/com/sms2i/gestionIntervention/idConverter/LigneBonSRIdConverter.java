package com.sms2i.gestionIntervention.idConverter;

import com.sms2i.gestionIntervention.id.LigneBonSRId;
import org.springframework.core.convert.converter.Converter;

public class LigneBonSRIdConverter implements Converter<String, LigneBonSRId> {
    @Override
    public LigneBonSRId convert(String source) {
        String[] ids = source.substring(1).split("_");
        return new LigneBonSRId(Long.parseLong(ids[0]),Long.parseLong(ids[1]));
    }
}
