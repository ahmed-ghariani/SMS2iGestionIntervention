package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.*;
import com.sms2i.gestionIntervention.repository.MissionRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class MissionService extends GenericService<Mission,Long,MissionRepository>{


    @Autowired
    public MissionService(MissionRepository repository) {
        super(repository);
    }

    public List<Mission> findByTechnicienId(long id){
        // creer un objet pour inserer de dans l id
        Technicien technicien =new Technicien();
        technicien.setId(id);
        // retour tous les missions associer au technicien
        return repository.findAllByTechniciens(technicien);
    }

    public List<Mission> findByEtat(EtatMission etat){
        // retour tous les missions ayant cet etat
        return repository.findAllByEtat(etat);
    }

    public Mission addTechnicien(long missionId, long technicienId){
        // creer un objet pour inserer de dans l id
        Technicien technicien = new Technicien();
        technicien.setId(technicienId);
        // recuperer la mission du BD
        Mission mission = repository.findById(missionId).orElseThrow();
        // ajouter un technicien
        mission.getTechniciens().add(technicien);
        // MAJ l etat
        if (mission.getEtat()==EtatMission.CREE){
            mission.setEtat(EtatMission.AFFECTEE);
        }
        // sauvgarder et retour avec modification
        return repository.save(mission);
    }

    public Mission specifiyObject(long missionId, Set<SousCategorie> sousCategories){
        // recuperer la mission du BD
        Mission mission = repository.findById(missionId).orElseThrow();
        // moudiffier la liste sous categorie
        mission.setSousCategories(sousCategories);
        // sauvgarder et retour avec modification
        return repository.save(mission);
    }
    public List<Mission> findByClientId(long id){
        //creer un objet pour inserer de dans l id
        Client client =new Client();
        client.setId(id);
        // retourner tous les mission du client
        return repository.findAllByClient(client);
    }

    public List<Mission> findByAgentAdministratifId(long id){
        // creer un objet pour inserer de dans l id
        AgentAdministratif agentAdministratif = new AgentAdministratif();
        agentAdministratif.setId(id);
        // retour tous les mission cree par l agent ayant l id
        return repository.findAllByAgentAdministratif(agentAdministratif);
    }



    public List<Mission> findByDateMission(Date dateDebut) {
        //retour tous les ordres missions du dateDebut jusqu a le momment du requet
        return repository.findAllByDateMissionBetween(dateDebut,new Date());
    }

    public Mission setDesignation(long missionId, String designaion) {
        // recuperer la mission du BD
        Mission mission = repository.findById(missionId).orElseThrow();
        // modifier designastion
        mission.setDesignation(designaion);
        // sauvgarder et retour avec modification
        return repository.save(mission);
    }

    @Override
    public Mission add(Mission mission) {
        mission.setEtat(EtatMission.CREE);
        return repository.save(mission);
    }
}

