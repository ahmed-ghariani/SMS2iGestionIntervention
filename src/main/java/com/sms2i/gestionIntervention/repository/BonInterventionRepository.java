package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.BonIntervention;
import com.sms2i.gestionIntervention.model.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BonInterventionRepository extends JpaRepository<BonIntervention,Long> {
    Set<BonIntervention> findAllByTagsIn(Set<Tags> tags);
}
