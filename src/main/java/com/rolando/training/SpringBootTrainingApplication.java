package com.rolando.training;

import com.rolando.training.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTrainingApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public SpringBootTrainingApplication(@Qualifier("componentImplementTwo") ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
}
