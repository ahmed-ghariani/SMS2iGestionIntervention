package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Materielrepository extends JpaRepository<Materiel,Long> {
}
