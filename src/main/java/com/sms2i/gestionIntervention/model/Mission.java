package com.sms2i.gestionIntervention.model;



import java.util.Date;
import java.util.Set;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Mission")
public class Mission extends GenericModel<Long> {

    private String descriptionMission ;
    private Date dateMission;
    private Date dateDebutEstime ;
    private Long dureeEstime;
    private String retourClient ;
    private Integer accompteMission ; 
    private Integer retourAccompte ;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Technicien> techniciens ;
    @ManyToOne
    Superviseur superviseur;
    @ManyToOne
    AgentAdministratif agentAdministratif;

    @ManyToOne
    Client client;

    @ManyToMany
    Set<SousCategorie> sousCategories;

    @OneToOne(mappedBy = "mission")
    BonIntervention bonIntervention;

    @ManyToOne
    Checklist checklist;

    @OneToOne(mappedBy = "mission")
    BonSR bonSR;

    @OneToMany(mappedBy = "mission")
    @JsonManagedReference
    Set<Deplacement> deplacements;




    
    
    
    
}
