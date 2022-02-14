package com.qiao.springbooth2;

import com.qiao.springbooth2.po.Student;
import com.qiao.springbooth2.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

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
		return args -> {
			Student student = repository.getById(10001L);
			System.out.println(student);
		};
	}

}
