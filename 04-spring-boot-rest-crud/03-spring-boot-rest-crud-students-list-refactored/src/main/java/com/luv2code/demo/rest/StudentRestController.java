package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once! once the given bean is constructed

    @PostConstruct      //only loads the students data once!
    public void loadData() {
        //La siguiente linea, así es como estaba en el proyecto anterior (Kata36)
        //lo cual esta mal, pues se estaba creando una nueva instancia cada que se llamaba el endpoint
        //List<Student> theStudents = new ArrayList<>();
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }


    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;     //solo regresar la lista gracias a la anotación @PostConstruct
    }

}







