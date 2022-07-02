package com.sms2i.gestionIntervention.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sms2i.gestionIntervention.id.LigneBonSRId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneBonSR  {

    @EmbeddedId
    private LigneBonSRId id;

    private int quntiteSortie;
    private int quntiteRetour;
    private int quntiteConsommee;
    private Date dateSortie;
    private Date dateRetour;



    @ManyToOne
    @MapsId("bonSRId")
    @JoinColumn(name = "bonSR_id")
    @JsonBackReference
    private BonSR bonSR;
    @ManyToOne
    @MapsId("materielId")
    @JoinColumn(name = "materiel_id")
    private Materiel materiel;


}
