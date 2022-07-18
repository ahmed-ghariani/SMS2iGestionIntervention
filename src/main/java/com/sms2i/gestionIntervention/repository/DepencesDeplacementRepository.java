package com.sms2i.gestionIntervention.repository;

import java.util.List;

import com.sms2i.gestionIntervention.model.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.id.DepencesDeplacementId;

@Repository
public interface DepencesDeplacementRepository extends JpaRepository<DepencesDeplacement, DepencesDeplacementId> {

	List<DepencesDeplacement> findAllByDeplacement(Deplacement deplacement);
}
