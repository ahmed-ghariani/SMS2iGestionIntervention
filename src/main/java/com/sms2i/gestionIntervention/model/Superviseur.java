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
@Table( name = "Superviseur")
public class Superviseur extends Personne {
	


	@OneToMany(mappedBy="superviseur")
	@JsonIgnore
	private Set<Mission> missions;
	
	
	

}
