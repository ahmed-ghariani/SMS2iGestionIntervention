package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.GenericModel;
import com.sms2i.gestionIntervention.service.GenericService;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;




public class GenericController<T extends GenericModel<ID> ,ID extends Serializable,S extends GenericService > {


    S service;
    public GenericController(S service) {
        this.service = service;
    }

    @GetMapping("/{id}")
        T getById(@PathVariable ID id){
            return (T) service.getById(id);
        }
        @GetMapping
        List<T> getAll(){
            return (List<T>) service.getAll();
        }
        @PostMapping
        T add(@RequestBody T t){
            return (T) service.add(t);
        }
        @DeleteMapping("/{id}")
        void delete(@PathVariable ID id){
            service.delete(id);
        }
        @PutMapping("/{id}")
        T update(@RequestBody T t,@PathVariable ID id){
            return (T) service.update(t,id);
        }

}


