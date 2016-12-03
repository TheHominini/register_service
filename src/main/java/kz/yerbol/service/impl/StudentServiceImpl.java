package kz.yerbol.service.impl;

import kz.yerbol.service.StudentService;
import kz.yerbol.dao.domain.*;
import kz.yerbol.dao.*;



public class StudentServiceImpl implements StudentService {
  
  RegisterDAO dao = new RegisterDAO();


  public void addStudent(Student student, Specialty specialty){
    EmailSenderServiceImpl eServiceImpl = new EmailSenderServiceImpl();

    student.setSpecialty(specialty);
    eServiceImpl.sendEmail(student.getEmail1());
    dao.addStudent(student);
  }

  public void removeStudent(){

  }
}