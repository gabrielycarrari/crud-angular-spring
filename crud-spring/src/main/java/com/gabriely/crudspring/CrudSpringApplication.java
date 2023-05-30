package com.gabriely.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gabriely.crudspring.enums.Category;
import com.gabriely.crudspring.model.Course;
import com.gabriely.crudspring.model.Lesson;
import com.gabriely.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory(Category.BACK_END);

			Lesson l = new Lesson();
			l.setName("Introdução");
			l.setYoutubeUrl("qJnjz8FIs6Q");
			l.setCourse(c);
			c.getLessons().add(l);

			Lesson l1 = new Lesson();
			l1.setName("47: Curso-Aulas: Aula DTO");
			l1.setYoutubeUrl("hRgEjn2TGCQ");
			l1.setCourse(c);
			c.getLessons().add(l1);
			
			courseRepository.save(c);
		};
	}
}
