package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.AgentAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentAdministratifRepository extends JpaRepository<AgentAdministratif,Long> {
}
