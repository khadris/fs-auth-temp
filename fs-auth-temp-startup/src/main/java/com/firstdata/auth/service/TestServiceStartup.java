package com.firstdata.auth.service;

import com.firstdata.fs.core.LoggingEventHandler;
import com.firstdata.fs.core.swagger.SwaggerService;
import com.firstdata.temp.resource.TestResource;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import static com.firstdata.fs.core.GenericServiceStarter.DEFAULT_SERVICE_GROUP;
import static com.firstdata.fs.core.GenericServiceStarter.start;

@Startup
@Singleton
public class TestServiceStartup {

    @EJB
    private TestResource testResource;

    @PostConstruct
    public void register() {
        SwaggerService swaggerService = new SwaggerService("temp");
        start(DEFAULT_SERVICE_GROUP, new LoggingEventHandler(), "temp", 1,
                swaggerService,
                testResource
        );
    }
}                                                                       