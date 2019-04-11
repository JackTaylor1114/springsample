package de.fhzwickau.studpv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"de.fhzwickau.studpv.security.*"})
@SpringBootApplication
public class StudpvApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudpvApplication.class, args);
	}

}
