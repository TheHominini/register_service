package kz.yerbol.service.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import kz.yerbol.controller.HibernateUtil;
import kz.yerbol.service.FacultyService;
import kz.yerbol.domain.Faculty;





public class FacultyServiceImpl implements FacultyService{
  Session session = null;

  public FacultyServiceImpl(){
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();

  }
  public List<Faculty> getFacultyList(){
    List<Faculty> facultyList = null;
    try {
      org.hibernate.Transaction tx = session.beginTransaction();
      Query q = session.createQuery("from Faculty");
      facultyList = (List<Faculty>) q.list();
      return facultyList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public void addFaculty(){

  }

  public void removeFaculty(){

  }
}