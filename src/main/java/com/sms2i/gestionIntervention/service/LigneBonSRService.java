package com.sms2i.gestionIntervention.service;



import com.sms2i.gestionIntervention.id.LigneBonSRId;
import com.sms2i.gestionIntervention.model.LigneBonSR;
import com.sms2i.gestionIntervention.repository.LignBonSRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneBonSRService{
    @Autowired
    LignBonSRRepository repository;
    public LigneBonSR getById(LigneBonSRId id){
        return repository.findById(id).orElseThrow();
    }
    public LigneBonSR add(LigneBonSR t){
        return repository.save(t);
    }
    public List<LigneBonSR> getAll(){
        return repository.findAll();
    }
    public void delete(LigneBonSRId id){
        repository.deleteById(id);
    }
    public void delete(LigneBonSR t){
        repository.delete(t);
    }
    public LigneBonSR update(LigneBonSR t,LigneBonSRId id){
        if( id != null && repository.existsById(id)){
            return repository.save(t);
        }
        return t;
    }
}
