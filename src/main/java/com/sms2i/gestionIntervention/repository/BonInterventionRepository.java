package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.BonIntervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonInterventionRepository extends JpaRepository<BonIntervention,Long> {
}
