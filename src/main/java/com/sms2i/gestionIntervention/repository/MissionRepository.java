package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.AgentAdministratif;
import com.sms2i.gestionIntervention.model.Client;
import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Long> {
    List<Mission> findAllByTechniciens(Technicien technicien);
    //Set<Mission> findAllByTechniciensIn(Set<Technicien> technicien);
    List<Mission> findAllByClient(Client client);
    List<Mission> findAllByAgentAdministratif(AgentAdministratif agentAdministratif);




}
