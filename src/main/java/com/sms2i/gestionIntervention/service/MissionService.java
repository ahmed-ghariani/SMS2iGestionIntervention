/** package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService {
    @Autowired
    MissionRepository mr;
    public Mission getMissionById(int id){
        return mr.findById(id).get();
    }
    public Mission addMission(Mission m){
        return mr.save(m);
    }

    public List<Mission> findAll(){
        return mr.findAll();
    }

    public List<Mission> findByName(String name){
        return mr.findByName(name);
    }


}

**/
