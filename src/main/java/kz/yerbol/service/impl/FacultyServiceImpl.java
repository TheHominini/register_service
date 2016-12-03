package kz.yerbol.service.impl;

import java.util.List;
import kz.yerbol.service.FacultyService;
import kz.yerbol.dao.domain.*;
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