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
@Table( name = "CategorieDepences")


public class CategorieDepences extends GenericModel<Long> {
	
	private String label ;
	private Integer plafond ; 
	
    @OneToMany(mappedBy = "categorieDepences")
    Set<DepencesDeplacement> depencesDeplacements;

}
