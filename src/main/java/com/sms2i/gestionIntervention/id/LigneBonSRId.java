package com.sms2i.gestionIntervention.id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LigneBonSRId that = (LigneBonSRId) o;
        return bonSRId.equals(that.bonSRId) && materielId.equals(that.materielId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bonSRId, materielId);
    }
}
