package com.sms2i.gestionIntervention.repository;


import com.sms2i.gestionIntervention.model.LigneBonSR;
import com.sms2i.gestionIntervention.id.LigneBonSRId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LignBonSRRepository extends JpaRepository<LigneBonSR, LigneBonSRId> {
}
