package kz.yerbol.service.impl;

import kz.yerbol.service.StudentService;
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.List;
import java.util.Iterator;
import kz.yerbol.domain.Student;
import kz.yerbol.controller.HibernateUtil;



public class StudentServiceImpl implements StudentService {
  
  Session session = null;

  public void StudentServiceImpl()  {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public void addStudent(Student student, int idSpecialty){
    
    try {
      org.hibernate.Transaction tx = session.beginTransaction();
      Query q = session.createQuery("insert into Student(`id_specialty`, `FirstName`, `LastName`)"+
      " values(" + 1 +", '"+ student.getFirstName() +"', '"+ student.getLastName() +"')");
      q.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void removeStudent(){

  }
}