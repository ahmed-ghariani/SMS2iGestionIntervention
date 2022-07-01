package com.sms2i.gestionIntervention.model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Superviseur")
public class Superviseur extends Personne {
	


	@OneToMany(mappedBy="superviseur")
	private Set<Mission> missions;
	
	
	

}
