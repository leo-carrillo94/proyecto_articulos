package com.proarti.demo.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UsuarioDetailsServiceImpl usuarioDetailsService;
	
	@Bean
	public BCryptPasswordEncoder encriptarContra() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioDetailsService).passwordEncoder(encriptarContra());
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/","/css/**","/js/**", "/img/**","/registro", "/index").permitAll().anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").defaultSuccessUrl("/html/dashboard", true).failureUrl("/login?error=true")
		.loginProcessingUrl("/loginP").permitAll()
		.and()
		.logout().logoutUrl("/logout").logoutSuccessUrl("/login");
	}
	
	

}
