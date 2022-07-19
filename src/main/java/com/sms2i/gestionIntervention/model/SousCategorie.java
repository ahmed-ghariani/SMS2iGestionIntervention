package com.sms2i.gestionIntervention.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Sous_Categorie")
public class SousCategorie extends GenericModel<Long>{

	private String titre ;
	private String description ;
	@ManyToOne
	@JsonIdentityReference(alwaysAsId = true)
	private Categorie categorie;
}
