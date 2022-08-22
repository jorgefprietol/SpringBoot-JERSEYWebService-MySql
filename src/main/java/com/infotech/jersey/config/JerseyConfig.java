package com.infotech.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.infotech.jersey.endpoint.TopicJerseyRestService;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(TopicJerseyRestService.class);
	}
}
