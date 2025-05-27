package br.com.alura.screenmatchJpa;

import br.com.alura.screenmatchJpa.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchJpaApplication.class, args);
	}
	@Override
	public void  run (String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}


}
