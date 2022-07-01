package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {
    @Autowired
    MissionService ms;

    @GetMapping("/{id}")
    Mission getMissionById(@PathVariable int id){
        return ms.getById(id);
    }

    @PostMapping
    Mission addMission(@RequestBody Mission m){
        return ms.add(m);
    }

    @GetMapping
    List<Mission> getAll(){
        return ms.getAll();
    }

    @GetMapping("/search/name")
    List<Mission> getByName(@RequestParam String name){
        return ms.getByName(name);
    }


}
