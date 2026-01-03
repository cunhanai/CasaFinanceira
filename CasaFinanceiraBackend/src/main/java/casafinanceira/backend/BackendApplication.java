package casafinanceira.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// CommandLineRunner é temporário porque estou fazendo um tutorial da Alura,
// mas se quiseres trocar para fazer requisições REST, fique à vontade.
@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
