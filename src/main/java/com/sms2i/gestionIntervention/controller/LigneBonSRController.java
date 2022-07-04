package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.id.LigneBonSRId;
import com.sms2i.gestionIntervention.model.LigneBonSR;
import com.sms2i.gestionIntervention.service.LigneBonSRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligneBonSR")
public class LigneBonSRController {
    @Autowired
    LigneBonSRService service;
    @GetMapping("/{id}")
    LigneBonSR getById(@PathVariable LigneBonSRId id){
        return service.getById(id);
    }
    @GetMapping
    List<LigneBonSR> getAll(){
        return  service.getAll();
    }
    @PostMapping
    LigneBonSR add(@RequestBody LigneBonSR t ){
        return service.add(t);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable LigneBonSR id){
        service.delete(id);
    }
    @PutMapping("/{id}")
    LigneBonSR update(@RequestBody LigneBonSR t,@PathVariable LigneBonSRId id){
        return service.update(t,id);
    }
}

