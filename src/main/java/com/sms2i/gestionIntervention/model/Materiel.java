package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Materiel extends GenericModel<Long> {

    private String label;
    private int quantiteStock;

    @OneToMany(mappedBy ="materiel" )
    @JsonIgnore
    private Set<LigneBonSR> lignesBonSR ;

    @ManyToMany
    private Set<Checklist> checklists;

}
