package kz.yerbol.service.impl;

import kz.yerbol.service.StudentService;
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.List;
import java.util.Iterator;
import kz.yerbol.domain.Student;
import kz.yerbol.domain.*;
import kz.yerbol.controller.HibernateUtil;



public class StudentServiceImpl implements StudentService {
  
  Session session = null;


  public void addStudent(Student student, int idSpecialty){

    this.session = HibernateUtil.getSessionFactory().openSession();
    
    try {
      Faculty f = new Faculty();
      f.setIdFaculty(5);
      f.setName("LL");
      session.save(f);
      session.close();
      
    } catch (Exception e) {
      e.printStackTrace();
      if (session != null && session.isOpen()){
        session.close();
      }
      
    }
  }

  public void removeStudent(){

  }
}