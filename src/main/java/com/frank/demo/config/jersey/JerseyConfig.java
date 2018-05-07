package com.frank.demo.config.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        packages("com.frank.demo.webservice.service");
    }
}
