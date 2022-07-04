package com.sms2i.gestionIntervention.model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Agent_Administratif")


public class AgentAdministratif extends Personne {

	@OneToMany( mappedBy="agentAdministratif")
	@JsonIgnore
	private Set<Mission> missions;

}
