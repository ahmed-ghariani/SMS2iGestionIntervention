package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Software;
import com.sms2i.gestionIntervention.repository.SoftwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftwareService extends GenericService<Software,Long, SoftwareRepository> {
    @Autowired
    public SoftwareService(SoftwareRepository repository) {
        super(repository);
    }
}
