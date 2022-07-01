package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

=======
import org.springframework.web.bind.annotation.*;

import java.util.List;

>>>>>>> aca1d2a5655bda037b2ba612000b00660f6fccae
@RestController
@RequestMapping("/missions")
public class MissionController {
    @Autowired
    MissionService ms;

    @GetMapping("/{id}")
    Mission getMissionById(@PathVariable int id){
        return ms.getMissionById(id);
    }

    @PostMapping
    Mission addMission(@RequestBody Mission m){
        return ms.addMission(m);
    }

    @GetMapping
    List<Mission> getAll(){
        return ms.findAll();
    }

    @GetMapping("/search/name")
    List<Mission> getByName(@RequestParam String name){
        return ms.findByName(name);
    }
}
