package com.sms2i.gestionIntervention.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "GroupeTags")
public class GroupeTags extends GenericModel<Long>{
    private String nomGroup;

    @JsonManagedReference
    @OneToMany(mappedBy = "groupe")
    Set<Tags> tags;
}
