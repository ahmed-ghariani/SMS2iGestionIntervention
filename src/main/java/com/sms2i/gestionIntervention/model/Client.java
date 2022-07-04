package com.sms2i.gestionIntervention.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sms2i.gestionIntervention.model.GenericModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client extends GenericModel<Long> {
    String nom;
    String address;
    @OneToMany(mappedBy = "client")
    @JsonIgnore
    Set<Mission> missions;

}
