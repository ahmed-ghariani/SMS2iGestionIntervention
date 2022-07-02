package com.sms2i.gestionIntervention.service;


import com.sms2i.gestionIntervention.model.Tags;
import com.sms2i.gestionIntervention.repository.TagsRepository;
import org.springframework.stereotype.Service;

@Service
public class TagsService extends GenericService<Tags,Long, TagsRepository> {
}
