package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Checklist;
import com.sms2i.gestionIntervention.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checklist")
public class ChecklistController extends GenericController<Checklist,Long, ChecklistService> {
    @Autowired
    public ChecklistController(ChecklistService service) {
        super(service);
    }

}
