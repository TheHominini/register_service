package kz.yerbol.service.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import kz.yerbol.controller.HibernateUtil;
import kz.yerbol.service.FacultyService;
import kz.yerbol.domain.Faculty;
import kz.yerbol.dao.*;





public class FacultyServiceImpl implements FacultyService{

  private RegisterDAO dao = new RegisterDAO();
  private String query;


  public List<Faculty> getFacultyList(){

    query = "from Faculty";
    List<Faculty> facultyList = null;
    facultyList = (List<Faculty>) dao.getList(query);
    return facultyList;
  }

  public void addFaculty(){

  }

  public void removeFaculty(){

  }
}