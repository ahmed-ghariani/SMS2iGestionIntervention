package com.sms2i.gestionIntervention.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
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
    @JsonManagedReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Set<Technicien> techniciens ;
    @ManyToOne
    Superviseur superviseur;
    @ManyToOne
    AgentAdministratif agentAdministratif;

    @ManyToOne
    Client client;

    @ManyToMany
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Set<SousCategorie> sousCategories;

    @OneToOne(mappedBy = "mission")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    BonIntervention bonIntervention;

    @ManyToOne
    Checklist checklist;

    @OneToOne(mappedBy = "mission")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    BonSR bonSR;

    @OneToMany(mappedBy = "mission")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Set<Deplacement> deplacements;




    
    
    
    
}
