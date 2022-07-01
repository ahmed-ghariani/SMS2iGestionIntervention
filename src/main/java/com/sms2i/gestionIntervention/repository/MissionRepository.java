package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Integer> {
    /*List<Mission> findBySuperviseur(int superviseurId);
    List<Mission> findByTechnicien(int technicienId);
    List<Mission> findByAgentAdministratif(int agentAdministratifId);
    List<Mission> findByClient(int ClientId);
    List<Mission> findByBonSR(int BonSRId);
    List<Mission> findBySousCategorie(int sousCategorieId);
    List<Mission> findByDateMission(String dateMission);*/
    List<Mission> findByName(String name);

}
