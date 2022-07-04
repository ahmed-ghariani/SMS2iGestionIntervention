package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.id.LigneBonSRId;
import com.sms2i.gestionIntervention.model.BonSR;
import com.sms2i.gestionIntervention.model.LigneBonSR;
import com.sms2i.gestionIntervention.model.Materiel;
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
    public LigneBonSR add(LigneBonSR t) {
        if(repository.existsById(t.getId())){
            return repository.getReferenceById(t.getId());
        }
        Materiel m =new Materiel();
        BonSR b =new BonSR();
        m.setId(t.getId().getMaterielId());
        b.setId(t.getId().getBonSRId());
        t.setMateriel(m);
        t.setBonSR(b);
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
