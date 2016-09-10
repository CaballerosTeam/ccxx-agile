package com.caballeros.jira.ccxx.reports;

import com.atlassian.jira.plugin.report.impl.AbstractReport;
import com.atlassian.jira.web.action.ProjectActionSupport;

import java.util.HashMap;
import java.util.Map;

public class DevelopersLoadReport extends AbstractReport {
    public String generateReportHtml(ProjectActionSupport projectActionSupport, Map map) throws Exception {
        String projectId = (String) map.get("projectId");
        Map<String, String> context = new HashMap<String, String>();
        context.put("projectId", projectId);
        return descriptor.getHtml("view", context);
    }
}
