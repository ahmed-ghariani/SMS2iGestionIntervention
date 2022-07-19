package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Categorie;
import com.sms2i.gestionIntervention.model.SousCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SousCategorieRepository extends JpaRepository<SousCategorie,Long> {
    List<SousCategorie> findAllByCategorie(Categorie categorie);
}
