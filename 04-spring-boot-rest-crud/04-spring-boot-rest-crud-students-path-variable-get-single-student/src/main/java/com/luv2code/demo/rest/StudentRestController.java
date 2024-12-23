package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;  // ver que se esta definiendo como field

    @PostConstruct      //recordar que se cargara una sola vez cuando el Student Bean es construido
    public void loadData() {
//TODO que pasaría si se quiere refrescar la información después de un tiempo
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }




    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;     //recordar que aqui entra jackson
    }


    @GetMapping("/students/{studentId}")    //Se hace uso de PathVariable para que en el endpoin se pueda pasar un id (las variables deben de coincidir)
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list ... keep it simple for now

        return theStudents.get(studentId);
    }
}







