package kz.yerbol.dao;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import kz.yerbol.dao.domain.*;


public class RegisterDAO {

  Session session = null;

  public RegisterDAO(){
    this.session = HibernateUtil.getSessionFactory().openSession();
  }

  public List getList(String query){

    List list = null;
    try {
      Query q = session.createQuery(query);
      list = (List) q.list();
      return list;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public void addStudent(Student student){

    try {
      session.save(student);
      session.close();
     
    } catch (Exception e) {
      e.printStackTrace();
      if (session != null && session.isOpen()){
        session.close();
      }
    }
  }

  public void addEducationhistory(Student student, List<Educationhistory> edhistory){

    ArrayList<Educationhistory> educationhistories = (ArrayList<Educationhistory>) edhistory;
    for (Educationhistory education : educationhistories){
      education.setStudent(student);
    //   try {
    //     session.save(education);
        
    //   } catch (Exception e) {
    //     e.printStackTrace();
    //     if (session != null && session.isOpen()){
    //       session.close();
    //     }
    //   }
    // }
    // session.close();
  }
}
}