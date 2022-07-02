package com.sms2i.gestionIntervention.id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class LigneBonSRId implements Serializable {

    @Column(name = "bonSR_id")
    private Long bonSRId;
    @Column(name = "materiel_id")
    private Long materielId;

    @Override
    public String toString() {
        return "@" + bonSRId + "_" + materielId ;
    }
}
