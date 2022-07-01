package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService extends GenericService<Mission,Integer,MissionRepository> {

    public List<Mission> getByName(String name){
        return repository.findByName(name);
    }




}
