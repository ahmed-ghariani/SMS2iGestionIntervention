package com.sms2i.gestionIntervention.model;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
@Setter@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(property = "categorieName", generator = ObjectIdGenerators.PropertyGenerator.class)
public class Categorie extends GenericModel<Long> {

    private String categorieName;
    @OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
    private Set<SousCategorie> sousCategories;

}
