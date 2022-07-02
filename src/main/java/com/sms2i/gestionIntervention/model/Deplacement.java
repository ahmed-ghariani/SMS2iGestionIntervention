package com.sms2i.gestionIntervention.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@Table( name = "Deplacement")


public class Deplacement extends GenericModel<Long> {
	
	private Date date ; 
	private Integer heureDebut ; 
	private Integer heureFin ; 
	
    @OneToMany(mappedBy = "deplacement")
    Set<DepencesDeplacement> depencesDeplacements;

}
