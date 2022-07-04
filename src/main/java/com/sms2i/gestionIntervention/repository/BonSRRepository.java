package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.BonSR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonSRRepository extends JpaRepository<BonSR,Long> {
}
