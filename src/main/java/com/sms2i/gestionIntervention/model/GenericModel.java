package com.sms2i.gestionIntervention.model;



import javax.persistence.Id;


public class GenericModel<ID> {

    protected ID id;


    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
