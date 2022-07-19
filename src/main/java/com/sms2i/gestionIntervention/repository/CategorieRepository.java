package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
    Categorie findFirstByCategorieName(String categorieName);
}
