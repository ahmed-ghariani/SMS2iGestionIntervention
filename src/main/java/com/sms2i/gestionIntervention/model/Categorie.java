package com.sms2i.gestionIntervention.model;



import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
public class Categorie extends GenericModel<Long> {

    private String categorieName;
    @OneToMany(mappedBy = "categorie")
    private Set<SousCategorie> sousCategories;

}
