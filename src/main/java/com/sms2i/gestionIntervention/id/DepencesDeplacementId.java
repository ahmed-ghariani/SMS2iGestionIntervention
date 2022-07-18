package com.sms2i.gestionIntervention.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepencesDeplacementId implements Serializable {
	@Column(name = "deplacement_id")
    Long deplacementId;
    @Column(name = "categorie_depences_id")
    Long categorieDepencesId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepencesDeplacementId that = (DepencesDeplacementId) o;

        if (!deplacementId.equals(that.deplacementId)) return false;
        return categorieDepencesId.equals(that.categorieDepencesId);
    }

    @Override
    public int hashCode() {
        int result = deplacementId.hashCode();
        result = 31 * result + categorieDepencesId.hashCode();
        return result;
    }
    @JsonValue
    @Override
    public String toString() {
        return "@" + deplacementId + "_" + categorieDepencesId;
    }
}

