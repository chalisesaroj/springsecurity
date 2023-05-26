package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class securityconfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().requestMatchers("/delete").hasAnyRole("admin")
		.requestMatchers("/update")
		.authenticated().and().httpBasic();
		return http.build();
	}

@Bean
public UserDetailsService ud () {
	UserDetails user1=User.builder().
			username("saroj")
			.password("{bcrypt}$2a$12$/pPlYOwdNvUYxh1yoCv19uZT4tQuBotQU9RGrI5Ov6jO0KZ7dxZFK")
			.roles("user").build();
	UserDetails user2=User.builder().
			username("anzeela")
			.password("{bcrypt}$2a$12$UANBO5fdlUdRuOgRtEX62eEj4hWWbwi5u0.SxeK.FKNir/XJbx8.a")
			.roles("admin").build();
	return new InMemoryUserDetailsManager  (user2,user1);
	
}

	}
