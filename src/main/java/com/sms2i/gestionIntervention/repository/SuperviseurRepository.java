package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Superviseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperviseurRepository extends JpaRepository<Superviseur,Long> {
}
