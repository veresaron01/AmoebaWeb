package com.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.web.servlet.oauth2.login.OAuth2LoginSecurityMarker;

@SpringBootApplication
@OAuth2LoginSecurityMarker
public class AmoebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmoebaApplication.class, args);
	}

}
