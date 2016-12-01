package kz.yerbol.dao;

import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import kz.yerbol.controller.HibernateUtil;
import kz.yerbol.domain.*;


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

  public Boolean addStudent(Student student){

    try {
      session.save(student);
      session.close();
      return Boolean.TRUE;
      
    } catch (Exception e) {
      e.printStackTrace();
      if (session != null && session.isOpen()){
        session.close();
      }
      
    }
    return Boolean.FALSE;
  }
}