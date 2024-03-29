package org.exp.examen1.Controller;
import org.exp.examen1.Dao.ServiceImpl;
import org.exp.examen1.Model.Employe;
import org.exp.examen1.Model.Project;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class EmployeBean {
    Employe employe;
    Project project;
    ServiceImpl srv;

    int implication;

    List<String> employeNames;

    @PostConstruct
    public void init(){
        srv= new ServiceImpl();
        employeNames = new ArrayList<>();
        employeNames=srv.getAllNamesDao();
    }

    public void affecterEmploye(){
        System.out.println("affecter");
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<String> getEmployeNames() {
        return employeNames;
    }

    public void setEmployeNames(List<String> employeNames) {
        this.employeNames = employeNames;
    }

    public ServiceImpl getSrv() {
        return srv;
    }

    public void setSrv(ServiceImpl srv) {
        this.srv = srv;
    }

    public int getImplication() {
        return implication;
    }

    public void setImplication(int implication) {
        this.implication = implication;
    }
}
