package kz.yerbol.service;

import java.util.List;
import kz.yerbol.dao.domain.*;

public interface EducationhistoryService  {
  public void addEducationhistory(Student student, List<Educationhistory> edhistory);
  public void removeEducationhistory();
}