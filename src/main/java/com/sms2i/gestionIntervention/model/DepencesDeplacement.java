package com.sms2i.gestionIntervention.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sms2i.gestionIntervention.id.DepencesDeplacementId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DepencesDeplacement{

    @EmbeddedId
	private DepencesDeplacementId id;
	private Integer valeurRemboursee ;
	private Integer valeur ; 
	
    
    @ManyToOne
    @MapsId("deplacementId")
    @JoinColumn(name = "deplacement_id")
    @JsonBackReference
    Deplacement deplacement;

    @ManyToOne
    @MapsId("categorieDepencesId")
    @JoinColumn(name = " categorie_depences_id")
    CategorieDepences categorieDepences;



	

}
