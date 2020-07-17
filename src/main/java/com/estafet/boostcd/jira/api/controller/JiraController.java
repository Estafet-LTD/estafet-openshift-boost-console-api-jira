package com.estafet.boostcd.jira.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estafet.boostcd.commons.model.API;

@RestController
public class JiraController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/api")
    public API getAPI() {
        return new API(appVersion);
    }
}
