package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.model.Technicien;
import com.sms2i.gestionIntervention.repository.MissionRepository;


import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;

@Service
public class MissionService extends GenericService<Mission,Long,MissionRepository>{


    public List<Mission> findbyTechnicienId(long id){
        Technicien technicien =new Technicien();
        technicien.setId(id);
        return repository.findAllByTechniciens(technicien);
    }


    public Mission addTechnicien(long missionId, long technicienId){
        Technicien technicien = new Technicien();
        technicien.setId(technicienId);
        Mission mission = repository.findById(missionId).orElseThrow();
        mission.getTechniciens().add(technicien);
        return repository.save(mission);
    }

    public Mission specifiyObject(long missionId, Set<SousCategorie> sousCategories){
        Mission mission = repository.findById(missionId).orElseThrow();
        mission.setSousCategories(sousCategories);
        return repository.save(mission);
    }
}

