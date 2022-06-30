package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.repository.MissionReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {
    @Autowired
    MissionReposetory mr;
    public Mission getMissionById(int id){
        return mr.getReferenceById(id);
    }
}
