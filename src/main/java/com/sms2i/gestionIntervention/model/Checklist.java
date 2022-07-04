package com.sms2i.gestionIntervention.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Checklist")
public class Checklist extends GenericModel<Long> {

    @NotEmpty
    @Column(unique = true)
    private String nomModele;
    @ManyToMany
    private Set<Materiel> materiels;

    @ManyToMany
    private Set<Software> softwares;


}
