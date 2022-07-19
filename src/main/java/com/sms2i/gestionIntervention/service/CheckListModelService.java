package com.sms2i.gestionIntervention.service;

import com.sms2i.gestionIntervention.model.CheckListModel;
import com.sms2i.gestionIntervention.repository.CheckListModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckListModelService extends GenericService<CheckListModel,Long, CheckListModelRepository>{

    @Autowired
    public  CheckListModelService(CheckListModelRepository repository) {
        super(repository);
    }
}
