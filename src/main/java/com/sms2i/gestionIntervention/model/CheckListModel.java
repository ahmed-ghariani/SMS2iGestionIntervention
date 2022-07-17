package com.sms2i.gestionIntervention.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Entity
public class CheckListModel extends GenericModel<Long>{

    private String nom;
    @ManyToMany
    Set<Materiel> materiels;
    @ManyToMany
    List<SoftwareCategorie> softwareCategories;
    @ManyToMany
    Set<Software> softwares;
    @OneToMany(mappedBy = "model")
    @JsonIgnore
    Set<Checklist> checklists;
}
