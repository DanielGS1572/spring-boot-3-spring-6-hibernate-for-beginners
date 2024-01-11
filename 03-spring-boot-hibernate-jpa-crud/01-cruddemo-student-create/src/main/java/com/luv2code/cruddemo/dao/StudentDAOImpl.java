package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {
    //TODO 3 pasos principalmente:
    // define field for entity manager
    // inject entity manager using constructor injection
    // implement save method


    private EntityManager entityManager;        //ver que en la implementación se define el entityManager

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional      //Handles Transaction management
    //TODO (solo aplica para hacer modificaciones a la base de datos, no para leer)
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

}










