package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Tags")
public class Tags extends GenericModel<Long> {
    private String valeur;

    @JsonBackReference
    @ManyToOne
    GroupeTags groupe;

    @JsonIgnore
    @ManyToMany(mappedBy = "tags")
    private Set<BonIntervention> bonInterventions;

}
