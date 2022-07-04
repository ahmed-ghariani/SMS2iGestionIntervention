package com.sms2i.gestionIntervention.model;



import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
public class Categorie extends GenericModel<Long> {

    private String categorieName;
    @OneToMany(mappedBy = "categorie")
    private Set<SousCategorie> sousCategories;

}
