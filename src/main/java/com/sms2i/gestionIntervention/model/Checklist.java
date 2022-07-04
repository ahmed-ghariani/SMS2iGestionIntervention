package com.sms2i.gestionIntervention.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Checklist")
public class Checklist extends GenericModel<Long> {

    private String nomModele;
    @ManyToMany
    private Set<Materiel> materiels;

    @ManyToMany
    private Set<Software> softwares;


}
