package com.sms2i.gestionIntervention.model;


import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class Personne extends GenericModel<Long> {
	

	private String Nom ; 
	private String Prenom ; 
	


}
