package bruno.teste.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.entregaDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		entregaDados filme = new entregaDados();
		
		
		for(int i = 0; i < 3; i++)filme.mostraFilme();
		
	}

}
