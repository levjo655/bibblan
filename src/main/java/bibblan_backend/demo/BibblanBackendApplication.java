package bibblan_backend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class BibblanBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibblanBackendApplication.class, args);
	}

}
