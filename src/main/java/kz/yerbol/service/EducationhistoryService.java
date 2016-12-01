package kz.yerbol.service;

import java.util.List;
import kz.yerbol.domain.Educationhistory;
import kz.yerbol.domain.Student;

public interface EducationhistoryService  {
  public Boolean addEducationhistory(Student student, List<Educationhistory> edhistory);
  public void removeEducationhistory();
}