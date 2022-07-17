package com.sms2i.gestionIntervention.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Checklist")
public class Checklist extends GenericModel<Long> {

    @ManyToOne
    CheckListModel model;
    @ManyToMany
    private Set<Materiel> materiels;
    @ManyToMany
    private Set<Software> softwares;


}
