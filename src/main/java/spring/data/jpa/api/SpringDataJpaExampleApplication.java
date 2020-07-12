package spring.data.jpa.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.data.jpa.api.dao.UserRepository;
import spring.data.jpa.api.model.User;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(UserRepository repository) {
		return (args) -> {
			User u1 = new User(111, "x", "IT", 23);
			User u2 = new User(675, "y", "IT", 24);
			User u3 = new User(432, "z", "CIVIL", 26);
			repository.save(u1);
			repository.save(u2);
			repository.save(u3);
		};
	}
}
