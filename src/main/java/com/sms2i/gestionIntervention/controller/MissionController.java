 package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.service.GenericService;
import com.sms2i.gestionIntervention.service.MissionService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/missions")
public class MissionController extends GenericController<Mission,Long,MissionService> {



    @PostMapping
    Mission addMission(@RequestBody Mission m){
        System.out.println(m.toString());
        return service.add(m);
    }





}
