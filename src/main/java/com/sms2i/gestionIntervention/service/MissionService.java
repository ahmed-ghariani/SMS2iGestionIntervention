package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.*;
import com.sms2i.gestionIntervention.repository.MissionRepository;


import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MissionService extends GenericService<Mission,Long,MissionRepository>{


    public List<Mission> findByTechnicienId(long id){
        Technicien technicien =new Technicien();
        technicien.setId(id);
        return repository.findAllByTechniciens(technicien);
    }

    /*public Set<Mission> findByTechnicienSet( Set<Technicien> techniciens){
        return repository.findAllByTechniciensIn(techniciens);
    }*/


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
    public List<Mission> findByClientId(long id){
        Client client =new Client();
        client.setId(id);
        return repository.findAllByClient(client);
    }

    public List<Mission> findByAgentAdministratifId(long id){
        AgentAdministratif agentAdministratif = new AgentAdministratif();
        agentAdministratif.setId(id);
        return repository.findAllByAgentAdministratif(agentAdministratif);
    }
}

