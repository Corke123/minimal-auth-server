package com.example.authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
	}

//	@Bean
//	public DaoAuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
//		var authProvider = new DaoAuthenticationProvider();
//		authProvider.setUserDetailsService(userDetailsService);
//		return authProvider;
//	}
//
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new InMemoryUserDetailsManager(
//				User.builder().username("user").password("{bcrypt}$2a$10$fw01ITlZYDiqRC6Z0UCHqujkkbAV4U1w9OPE9nEVJV/NGnyhOMFcW").build()
//		);
//	}
}
