package com.sms2i.gestionIntervention.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms2i.gestionIntervention.model.CategorieDepences;

@Repository
public interface CategorieDepencesRepository extends JpaRepository<CategorieDepences, Long> {

}
