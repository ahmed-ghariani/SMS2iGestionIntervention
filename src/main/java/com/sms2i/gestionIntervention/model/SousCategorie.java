package com.sms2i.gestionIntervention.model;

import javax.persistence.Entity;
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
@Table( name = "Sous_Categorie")
public class SousCategorie extends GenericModel<Long>{
	private String titre ;
	private String description ;
}
