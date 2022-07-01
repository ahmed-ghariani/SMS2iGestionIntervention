/**package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Integer> {
    List<Mission> findByName(String name);
}
 **/