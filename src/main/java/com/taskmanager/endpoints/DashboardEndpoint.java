package com.taskmanager.endpoints;

import com.taskmanager.model.Dashboard;
import com.taskmanager.repository.DashboardRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@BrowserCallable
@AnonymousAllowed
public class DashboardEndpoint {
    @Autowired
    private DashboardRepository dashboardRepository;

    public List<Dashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }

    public Optional<Dashboard> findById(final Long id) {
        return dashboardRepository.findById(id);
    }
}
