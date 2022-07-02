package com.sms2i.gestionIntervention.model;

import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table( name = "DepencesMission")

public class DepencesDeplacement extends GenericModel<categorieDepencesDeplacement>{
	
	private Integer valeurRembourse ; 
	private Integer valeur ; 
	
    
    @ManyToOne
    @MapsId("idDeplacement")
    @JoinColumn(name = "idDeplacement")
    Deplacement deplacement;

    @ManyToOne
    @MapsId("idCategorieDepences")
    @JoinColumn(name = "idCategorieDepences")
    CategorieDepences categorieDepences;



	

}
