package com.sms2i.gestionIntervention.model;


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
    private Long idGroup;
    private String nomGroup;

    @OneToMany(mappedBy = "groupe")
    Set<Tags> tags;
}
