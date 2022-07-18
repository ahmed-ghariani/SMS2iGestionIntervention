package com.sms2i.gestionIntervention.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class CheckListModel extends GenericModel<Long>{

    private String nom;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Materiel> materiels;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<SoftwareCategorie> softwareCategories;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Software> softwares;

    @OneToMany(mappedBy = "model")
    @JsonIgnore
    Set<Checklist> checklists;
}
