package com.example.sodemo;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SodemoApplication {
  
  @Bean
  CommandLineRunner testRepo(StudenCacheRepository studentCacheRepository) {
    return args -> {
      StudenCacheModel studentCacheModel = new StudenCacheModel();    
      StudentInfo si = new StudentInfo("bsb");
      Student st = new Student(Map.of("bsb", si));
      studentCacheModel.setStudent(st); //student model set
      studentCacheRepository.save(studentCacheModel);
      
      studentCacheRepository.findAll().forEach(System.out::println);
    };
  }

	public static void main(String[] args) {
		SpringApplication.run(SodemoApplication.class, args);
	}

}
