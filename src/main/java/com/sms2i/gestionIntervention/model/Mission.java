package com.sms2i.gestionIntervention.model;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mission {
    @Id
    private int id;
    private String name;

    public Mission(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Mission() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
