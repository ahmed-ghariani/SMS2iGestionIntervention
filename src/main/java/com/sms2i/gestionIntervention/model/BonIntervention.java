package com.sms2i.gestionIntervention.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "BonIntervention")
public class BonIntervention extends GenericModel<Long>{
    private String observationTechnicien;
    private String archiveUrl;
    private Long dureeTotale;

    @OneToOne
    Mission mission;
}
