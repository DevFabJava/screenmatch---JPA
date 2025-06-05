/*package br.com.alura.screenmatchJpa;

import br.com.alura.screenmatchJpa.principal.Principal;
import br.com.alura.screenmatchJpa.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchJpaApplicationSemWeb implements CommandLineRunner {

	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchJpaApplicationSemWeb.class, args);
	}
	@Override
	public void  run (String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}


}*/
