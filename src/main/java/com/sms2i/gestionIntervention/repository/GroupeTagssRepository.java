package com.sms2i.gestionIntervention.repository;


import com.sms2i.gestionIntervention.model.GroupeTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeTagssRepository extends JpaRepository<GroupeTags,Long> {
}
