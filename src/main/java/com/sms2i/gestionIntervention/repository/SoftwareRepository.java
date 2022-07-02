package com.sms2i.gestionIntervention.repository;


import com.sms2i.gestionIntervention.model.Software;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareRepository extends JpaRepository<Software,Long> {
}
