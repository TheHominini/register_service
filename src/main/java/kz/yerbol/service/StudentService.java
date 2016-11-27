package kz.yerbol.service;

import kz.yerbol.domain.Student;

public interface StudentService  {
  public void addStudent(Student student, int idSpecialty);
  public void removeStudent();
  
}