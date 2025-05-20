package com.taskmanager.services;

import com.taskmanager.model.Dashboard;
import com.taskmanager.repository.DashboardRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class DashboardService extends ListRepositoryService<Dashboard, Long, DashboardRepository> {
}
