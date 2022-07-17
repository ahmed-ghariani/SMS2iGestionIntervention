package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Long> {
    List<Mission> findAllByTechniciens(Technicien technicien);
    //Set<Mission> findAllByTechniciensIn(Set<Technicien> technicien);
    List<Mission> findAllByClient(Client client);
    List<Mission> findAllByAgentAdministratif(AgentAdministratif agentAdministratif);

    List<Mission> findAllByDateMissionBetween(Date dateDebut, Date dateFin);

    List<Mission> findAllByEtat(EtatMission etat);
}
