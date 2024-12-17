package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	//Ver que se tiene que inyectar el DAO
	@Bean		//ver que no lleva @Autowired porque con la anotación @Bean ya se hace la inyección de dependencias
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO /*Como solo tiene una implementación se le pasa la interfaz*/) {		//Usado para crear un command line application
		// esta lambda es la implementación de la interfaz runner
		return runner -> {			//TODO video 73
			createStudent(studentDAO);


		};
	}



	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());  //ver que se generó un id
		System.out.println(tempStudent.getId());
		System.out.println(studentDAO.getListOfStudents());
	}
}






