package com.taskmanager.endpoints;

import com.taskmanager.model.Family;
import com.taskmanager.repository.FamilyRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@BrowserCallable
@AnonymousAllowed
public class FamilyEndpoint {
  @Autowired
  private FamilyRepository familyRepository;

  public List<Family> findAll() {
    return familyRepository.findAll();
  }

  public Optional<Family> findById(final Long id) {
    return familyRepository.findById(id);
  }
}
