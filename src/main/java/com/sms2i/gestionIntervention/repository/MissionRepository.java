package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Long> {
    List<Mission> findAllByTechniciens(Technicien technicien);


}
