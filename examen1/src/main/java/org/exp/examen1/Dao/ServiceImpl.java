package org.exp.examen1.Dao;

import jakarta.persistence.*;

import java.util.List;

public class ServiceImpl {

    private EntityManagerFactory entityMF;
    private EntityManager entityM;
    private EntityTransaction entityT;
    private final String SELECT_USER_QUERY = "SELECT u from User u WHERE u.email = :email AND u.password = :password";
    public ServiceImpl(){
        entityMF = Persistence.createEntityManagerFactory("jpa-database");
        entityM  = entityMF.createEntityManager();
        entityT  = entityM.getTransaction();
    }

    public List<String> getAllNamesDao() {
        Query query = entityM.createQuery("SELECT e.name FROM Employe e");
        return query.getResultList();
    }
}
