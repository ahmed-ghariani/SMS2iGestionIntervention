package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.service.ChecklistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checklist")
public class ChecklistController extends GenericController<Checklist,Long, ChecklistService> {
    @GetMapping("/search/modelName/{modelName}")
    Checklist getByName(@PathVariable String modelName){
        return service.getByName(modelName);
    }
}
