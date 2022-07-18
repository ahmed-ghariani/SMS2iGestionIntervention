package com.sms2i.gestionIntervention.repository;

import java.util.Date;
import java.util.List;

import com.sms2i.gestionIntervention.model.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms2i.gestionIntervention.model.DepencesDeplacement;
import com.sms2i.gestionIntervention.model.categorieDepencesDeplacement;

@Repository
public interface DepencesDeplacementRepository extends JpaRepository<DepencesDeplacement, categorieDepencesDeplacement> {

	List<DepencesDeplacement> findAllByDeplacement(Deplacement deplacement);
}
