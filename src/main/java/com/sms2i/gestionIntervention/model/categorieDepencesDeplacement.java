package com.sms2i.gestionIntervention.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class categorieDepencesDeplacement implements Serializable {
	
	@Column(name = "idDeplacement")
    Long idDeplacement;

    @Column(name = "idCategorieDepences")
    Long idCategorieDepences;

}
