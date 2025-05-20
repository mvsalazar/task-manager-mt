package com.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmanager.model.Family;
import com.taskmanager.repository.FamilyRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class FamilyService extends ListRepositoryService<Family, Long, FamilyRepository> {
  @Autowired
	private FamilyRepository familyRepository;

    public Family save(final Family family) {
      Family newFamily = new Family();

      newFamily.setName(family.getName());

      familyRepository.save(newFamily);
    
      return newFamily;
    }
}
