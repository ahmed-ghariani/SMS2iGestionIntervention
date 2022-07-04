package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "Software")
public class Software extends GenericModel<Long> {

    private String softwareLabel;
    private String softwareVersion;

    @JsonIgnore
    @ManyToMany(mappedBy = "softwares")
    private Set<Checklist> checklists;
}
