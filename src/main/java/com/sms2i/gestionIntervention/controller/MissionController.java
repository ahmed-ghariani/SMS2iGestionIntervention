package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.EtatMission;
import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.service.MissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/mission")
public class MissionController extends GenericController<Mission,Long,MissionService> {
    @Autowired
    MissionController(MissionService service) {
        super(service);
    }

    @GetMapping("/search/technicien/{id}")
     List<Mission> findByTechnicienId(@PathVariable long id){
        return service.findByTechnicienId(id);
    }


    @GetMapping("/search/client/{id}")
    List<Mission> findByClientId(@PathVariable long id){
        return service.findByClientId(id);
    }
    @GetMapping("/search/agentAdministratif/{id}")
    List<Mission> findByAgentId(@PathVariable long id){
        return service.findByAgentAdministratifId(id);
    }

    @GetMapping("search/etat")
    List<Mission> findByEtat(@RequestParam EtatMission etat){
        return service.findByEtat(etat);
    }
    @GetMapping("/search/dateMission/{date}")
    List<Mission> findByDateMission(@PathVariable String date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return service.findByDateMission(dateFormat.parse(date));
        } catch (ParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"date format should be yyyy-mm-dd");
        }
    }

    @PostMapping("/affecter")
    Mission affecterTechnicien(@RequestParam long missionId,@RequestParam long technicienId){
        return service.addTechnicien(missionId,technicienId);
    }

    @PostMapping("/object")
    Mission specifierObjet(@RequestParam long missionId, @RequestBody Set<SousCategorie> sousCategories){
        return service.specifiyObject(missionId,sousCategories);
    }
    @PostMapping("/designation")
    Mission setDesignation(@RequestParam long missionId,@RequestParam String designaion){
        return service.setDesignation(missionId,designaion);
    }
}

