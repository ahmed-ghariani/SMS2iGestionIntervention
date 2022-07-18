package com.sms2i.gestionIntervention.repository;


import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistRepository extends JpaRepository<Checklist,Long> {
    Checklist getChecklistByOrdreMission(Mission ordreMission);
}
