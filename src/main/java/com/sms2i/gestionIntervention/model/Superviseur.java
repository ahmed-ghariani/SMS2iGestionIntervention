package com.sms2i.gestionIntervention.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table( name = "Superviseur")

public class Superviseur extends Personne {
	


	/*@OneToMany(mappedBy="Superviseur")
	private Set<Mission> mission;*/
	
	
	

}
