package kz.yerbol.service.impl;

import java.util.List;
import kz.yerbol.dao.RegisterDAO;
import kz.yerbol.dao.domain.*;
import kz.yerbol.service.EducationhistoryService;
public class EducationhistoryServiceImpl implements EducationhistoryService{

  RegisterDAO dao = new RegisterDAO();
  
  public void addEducationhistory(Student student, List<Educationhistory> edhistory) {
    dao.addEducationhistory(student, edhistory);
  }

  public void removeEducationhistory()  {

  }
}