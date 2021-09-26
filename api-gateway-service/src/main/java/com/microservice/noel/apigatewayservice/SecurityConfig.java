package com.microservice.noel.apigatewayservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
		http.authorizeExchange(exchanges -> exchanges.anyExchange().authenticated())
				.oauth2Login(Customizer.withDefaults());
		http.csrf().disable();
//		http.requestCache().requestCache(NoOpServerRequestCache.getInstance()).and()
//				.securityContextRepository(NoOpServerSecurityContextRepository.getInstance());

//		http.authorizeRequests(exchanges -> exchanges
//				.antMatchers(HttpMethod.POST, environment.getProperty("api.registration.url.path")).permitAll()
//				.antMatchers(HttpMethod.POST, environment.getProperty("api.login.url.path")).permitAll().anyRequest()
//				.authenticated())
//				.oauth2Login(Customizer.withDefaults());
//
//		http.csrf().disable();
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		return http.build();
		return http.build();
	}

}
