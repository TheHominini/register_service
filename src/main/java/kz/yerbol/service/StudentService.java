package kz.yerbol.service;

import kz.yerbol.domain.Specialty;
import kz.yerbol.domain.Student;

public interface StudentService  {
  public Boolean addStudent(Student student, Specialty specialty);
  public void removeStudent();
  
}