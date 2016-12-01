package kz.yerbol.service.impl;

import kz.yerbol.service.StudentService;
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.List;
import java.util.Iterator;
import kz.yerbol.domain.Student;
import kz.yerbol.domain.*;
import kz.yerbol.controller.HibernateUtil;
import kz.yerbol.dao.RegisterDAO;



public class StudentServiceImpl implements StudentService {
  
  RegisterDAO dao = new RegisterDAO();


  public Boolean addStudent(Student student, Specialty specialty){

    student.setSpecialty(specialty);

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+student.getFirstName());
    return dao.addStudent(student);
  }

  public void removeStudent(){

  }
}