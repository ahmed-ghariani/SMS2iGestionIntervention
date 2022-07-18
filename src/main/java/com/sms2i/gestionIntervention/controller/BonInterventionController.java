package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.BonIntervention;
import com.sms2i.gestionIntervention.model.Tags;
import com.sms2i.gestionIntervention.service.BonInterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/bonIntervention")
public class BonInterventionController extends GenericController<BonIntervention,Long, BonInterventionService> {

    @Autowired
    BonInterventionController(BonInterventionService service) {
        super(service);
    }

    @GetMapping("/search/tags")
    Set<BonIntervention> findByTagValeur(@RequestBody Set<Tags> tags){
        return  service.findByTags(tags);
    }

    @GetMapping("/search/groupe/{groupeId}")
    Set<BonIntervention> findByGroupe(@PathVariable Long groupeId){
        return service.findByGroupe(groupeId);
    }

}
