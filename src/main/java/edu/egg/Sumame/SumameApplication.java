package edu.egg.Sumame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumameApplication {
	
//	@Autowired
//	private UsuarioServicio usuarioServicio;

	public static void main(String[] args) {
		SpringApplication.run(SumameApplication.class, args);		
		
	}
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(usuarioServicio).passwordEncoder(new BCryptPasswordEncoder());
//	}

}
