package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TechnicienRepository extends JpaRepository<Technicien,Long> {
}
