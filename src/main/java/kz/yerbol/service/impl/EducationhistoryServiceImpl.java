package kz.yerbol.service.impl;

import java.util.List;
import kz.yerbol.dao.RegisterDAO;
import kz.yerbol.domain.Educationhistory;
import kz.yerbol.domain.Student;
import kz.yerbol.service.EducationhistoryService;
public class EducationhistoryServiceImpl implements EducationhistoryService{

  RegisterDAO dao = new RegisterDAO();
  
  public Boolean addEducationhistory(Student student, List<Educationhistory> edhistory) {
    return dao.addEducationhistory(student, edhistory);
  }

  public void removeEducationhistory()  {

  }
}