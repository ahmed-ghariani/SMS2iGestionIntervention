package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.GenericModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class GenericService<T extends GenericModel<ID>,ID,R extends JpaRepository<T,ID>>{

    @Autowired
    R repository;
    public T getById(ID id){
        return repository.findById(id).get();
    }
    public T add(T t){
        if (repository.existsById(t.getId())){
            return t;
        }
        return repository.save(t);
    }
    public List<T> getAll(){
        return repository.findAll();
    }
    public void delete(ID id){
        repository.deleteById(id);
    }
    public void delete(T t){
        repository.delete(t);
    }
    public T update(T t){
        ID id = t.getId();
        if( id != null && repository.existsById(id)){
            return repository.save(t);
        }
        return t;
    }



}
