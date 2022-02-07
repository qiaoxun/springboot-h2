package com.qiao.springbooth2;

import com.qiao.springbooth2.po.Student;
import com.qiao.springbooth2.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Plain JDBC project
 * https://www.logicbig.com/tutorials/spring-framework/spring-data-access-with-jdbc/jdbc-template-example.html
 *
 */

@SpringBootApplication
public class SpringbootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Student student = repository.getById(10001L);
				System.out.println(student);
			}
		};
	}

}
