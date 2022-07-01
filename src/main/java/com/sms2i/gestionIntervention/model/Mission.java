package com.sms2i.gestionIntervention.model;


import java.util.Date;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
@Table( name = "Mission")
public class Mission extends GenericModel<Long> {

    private String descriptionMission ;
    private Date dateMission;
    private Date dateDebutEstime ;
    private Long dureeEstime;
    private String retourClient ;
    private Integer accompteMission ; 
    private Integer retourAccompte ;
    
    @ManyToMany(mappedBy = "missions")
    private Set<Technicien> techniciens ;
    @ManyToOne
    Superviseur superviseur;
    @ManyToOne
    AgentAdministratif agentAdministratif;

    
    
    
    
}
