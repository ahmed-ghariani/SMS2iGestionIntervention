package com.sms2i.gestionIntervention.model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@Table( name = "Technicien")
public class Technicien extends Personne {
	

    @ManyToMany
    private Set<Mission> missions ;

	


}
