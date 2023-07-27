package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDao) {
//		System.out.println("Creating new student");
////		Student student = new Student("hari", "prathap", "prathap0611@gmail.com");
//
//		System.out.println("Saving student");
//		studentDao.save(student);

//		System.out.println("Saved Student, Generated Student id:" + student.getId());

		studentDao.delete(1);

//		student1.setFirstName("Kasturi Hari");
//
//		studentDao.update(student1);
//
		List<Student> students = studentDao.findAll();

		for(Student student: students) {
			System.out.println(student);
		}

	}

}
