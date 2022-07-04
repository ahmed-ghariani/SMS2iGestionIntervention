package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.model.SousCategorie;
import com.sms2i.gestionIntervention.service.MissionService;


import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/mission")
public class MissionController extends GenericController<Mission,Long,MissionService> {
    /*@GetMapping("/search/techniciens")
    Set<Mission> findByTechniciens(@RequestBody Set<Technicien> techniciens){
        return service.findByTechnicienSet(techniciens);
    }*/
    @GetMapping("/search/technicien/{id}")
    List<Mission> findByTechnicienId(@PathVariable long id){
        return service.findByTechnicienId(id);
    }


    @GetMapping("/search/client/{id}")
    List<Mission> findByClientId(@PathVariable long id){
        return service.findByClientId(id);
    }
    @GetMapping("/search/agentAdministratif/{id}")
    List<Mission> findByAgnetId(@PathVariable long id){
        return service.findByAgentAdministratifId(id);
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

