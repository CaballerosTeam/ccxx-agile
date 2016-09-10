package com.caballeros.jira.ccxx.reports;

import com.atlassian.configurable.ValuesGenerator;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.project.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DevelopersLoadValueGenerator implements ValuesGenerator {
    private Map<String, String> availableProjects = new HashMap<String, String>();

    public Map<String, String> getValues(Map userParams) {
        List<Project> allProjects = ComponentAccessor.getProjectManager().getProjectObjects();

        for (Project project: allProjects) {
            availableProjects.put(project.getId().toString(), project.getName());
        }

        return availableProjects;
    }
}
