package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BonSR extends GenericModel<Long>{

    @OneToMany(mappedBy = "bonSR")
    @JsonManagedReference
    private Set<LigneBonSR> lignesBonSR;

    @NotNull
    @OneToOne
    @JoinColumn(unique = true)
    Mission mission;

    @ManyToOne
    AgentAdministratif responsableSortie;


    @ManyToOne
    AgentAdministratif responsableRetour;

}
