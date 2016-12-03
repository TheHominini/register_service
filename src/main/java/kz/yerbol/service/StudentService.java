package kz.yerbol.service;

import kz.yerbol.dao.domain.*;

public interface StudentService  {
  public void addStudent(Student student, Specialty specialty);
  public void removeStudent();
  
}