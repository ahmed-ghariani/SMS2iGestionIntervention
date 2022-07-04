package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.model.Technicien;
import com.sms2i.gestionIntervention.service.MissionService;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/missions")
public class MissionController extends GenericController<Mission,Long,MissionService> {
    @GetMapping("/search/technicien/{id}")
    List<Mission> findByTechnicienId(@PathVariable long id){
        return service.findByTechnicienId(id);
    }

    @GetMapping("/search/techniciens")
    List<Mission> findByTechniciens(@RequestBody List<Technicien> techniciens){
        return service.findByTechnicienSet(techniciens.stream().collect(Collectors.toSet()));
    }
    @PostMapping("/affecter")
    Mission affecterTechnicien(@RequestParam long missionId,@RequestParam long technicienId){
        return service.addTechnicien(missionId,technicienId);
    }

    @PostMapping("/object")
    Mission specifierObjet(@RequestParam long missionId, @RequestBody Set<SousCategorie> sousCategories){
        return service.specifiyObject(missionId,sousCategories);
    }
}

