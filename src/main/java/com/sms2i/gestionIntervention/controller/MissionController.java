package com.sms2i.gestionIntervention.controller;


import com.sms2i.gestionIntervention.model.Mission;
import com.sms2i.gestionIntervention.service.MissionService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController extends GenericController<Mission,Long,MissionService> {



}

