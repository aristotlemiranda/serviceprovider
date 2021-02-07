/*package sg.gov.gebiz.sp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/api/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/login/**")
		.hasRole("USER")
		.anyRequest()
		.authenticated()
		.and().formLogin().permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		authenticationMgr.inMemoryAuthentication().withUser("root")
				.password("{noop}password").authorities("USER");
	}
}
*/