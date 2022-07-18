package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonIdentityReference;
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

    @ManyToOne(fetch = FetchType.EAGER)
    CheckListModel model;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Materiel> materiels;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Software> softwares;
    @OneToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Mission ordreMission;


}
