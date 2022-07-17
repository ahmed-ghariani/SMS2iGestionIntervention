package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.GenericModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.io.Serializable;
import java.net.http.HttpResponse;
import java.util.List;


@Transactional
public class GenericService<T extends GenericModel<ID>,ID extends Serializable,R extends JpaRepository<T,ID>>{


    R repository;
    public GenericService(R repository) {
        this.repository = repository;
    }
    public T getById(ID id){
        return repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"no element with id: "+id+" found")
        );
    }
    public T add(T t){
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
    public T update(T t,ID id){
        if( id != null && repository.existsById(id)){
            return repository.save(t);
        }
        return t;
    }



}
