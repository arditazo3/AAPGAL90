package com.aapog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Aapgal90Application extends WebMvcConfigurerAdapter {

	// private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}

	public static void main(String[] args) {
		SpringApplication.run(Aapgal90Application.class, args);
	}

	/**
	 * Configuration of Security
	 * */
	@Configuration
	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
	public static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity httpSecurity) throws Exception {

			httpSecurity
					.authorizeRequests()
					.anyRequest()
					.authenticated();

			httpSecurity
					.formLogin()
					.loginPage("/login")
					.failureUrl("/login?error")
					.defaultSuccessUrl("/productslist")
					.permitAll()
					.and()
					.logout()
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutSuccessUrl("/login")
					.permitAll();

		}

		@Override
		public void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("admin").password("admin")
					.roles("ADMIN", "USER").and().withUser("user").password("user")
					.roles("USER");
		}

		@Override
		public void configure(WebSecurity web) throws Exception {

			web
					.ignoring()
					.antMatchers("/assets/**");

		}

	}
}
