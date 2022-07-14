package com.sms2i.gestionIntervention.repository;

import com.sms2i.gestionIntervention.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
