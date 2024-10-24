package com.luv2code.springcoredemo;

import com.luv2code.springcoredemo.dao.StudentDAO;
import com.luv2code.springcoredemo.dao.StudentDAOImpl;
import com.luv2code.springcoredemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
Crear la interfaz del DAO y su implementación
Crear su entity con los siguientes atributos
- id        - con su generation type
- firstName - nombre de columna first_name
- lastName  - nombre de columna last_name
- email

Generar getters/setter e implementar el toString()

Cuando se guarde un student desplegar su id en consola

*/
@SpringBootApplication
public class SpringcoredemoApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringcoredemoApplication.class,args);
    }
    @Bean
    @Autowired
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner -> {
            System.out.println("saving data");
            Student tempStudent = createData();
            studentDAO.save(tempStudent);
            System.out.println(tempStudent.getId());
        };
    }
    Student createData(){
        return new Student("abcd","def","ghi");
    }
}
