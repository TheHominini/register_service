package kz.yerbol.controller;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import kz.yerbol.domain.*;
import kz.yerbol.service.impl.*;


 
@ManagedBean
@SessionScoped
public class RegisterController implements Serializable {

  public static final Long serialVersionUID = 1L;

    
  private Student student = new Student();
  private Faculty faculty = new Faculty();
  private Specialty specialty = new Specialty();
  private Educationhistory educationhistory = new Educationhistory();

  public void register(){
    
    StudentServiceImpl studentService = new StudentServiceImpl();
    //EducationhistoryServiceImpl educationhistoryService = new EducationhistoryServiceImpl();
    
    try {
      studentService.addStudent(student, specialty.getIdspecialty());
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }

  }


  public Student getStudent() {
    return student;
  }
 
  public void setStudent(Student student) {
    this.student = student;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  public void setFaculty(Faculty faculty) {
    this.faculty = faculty;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
  }

  public Educationhistory getEducationhistory() {
    return educationhistory;
  }

  public void setEducationhistory(Educationhistory educationhistory)  {
    this.educationhistory = educationhistory;
  }
         
}