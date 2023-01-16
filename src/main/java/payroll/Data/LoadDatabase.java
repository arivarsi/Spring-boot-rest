package payroll.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payroll.Models.Employee;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Employee("Mukoma", "Varsi","Initiator","Mukoma", "ari.varsi1@gmail.com","User1Pass2023")));
			log.info("Preloading " + repository.save(new Employee("Everswick","Dambaza","Approver","Everswick", "varsi@mukomavarsi.com", "User1Pass2023")));
			log.info("Preloading "+ repository.save(new Employee("Ari","Varsi", "Employee","ari","everdamvarsi@gmail.com","User1Pass2023")));
		};
	}
}
