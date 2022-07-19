package com.sms2i.gestionIntervention.controller;

import com.sms2i.gestionIntervention.model.CheckListModel;
import com.sms2i.gestionIntervention.service.CheckListModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkListModel")
public class CheckListModelController extends GenericController<CheckListModel,Long, CheckListModelService> {
    @Autowired
    public CheckListModelController(CheckListModelService service) {
        super(service);
    }
}
