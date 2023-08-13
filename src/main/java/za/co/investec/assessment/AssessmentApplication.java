package za.co.investec.assessment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.co.investec.assessment.model.Client;
import za.co.investec.assessment.respository.ClientRepository;

@SpringBootApplication
public class AssessmentApplication {

	public static final Logger log = LoggerFactory.getLogger(AssessmentApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClientRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Client("Harry", "Potter", "0735613782", "Hogwarts", "8012542874134"));
			repository.save(new Client("Hermoine", "Granger", "0735987782", "Hogwarts", "8212543454134"));
		};
	}
}
