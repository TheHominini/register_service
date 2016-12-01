package kz.yerbol.controller;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import org.primefaces.event.RowEditEvent;
import java.util.Map;
import java.util.HashMap;
import kz.yerbol.domain.*;
import kz.yerbol.service.impl.*;



 
@ManagedBean
@SessionScoped
public class RegisterController implements Serializable {

  public static final Long serialVersionUID = 1L;

    
  private Student student = new Student();
  private Faculty faculty = new Faculty();
  private Specialty specialty = new Specialty();
  private Educationhistory educationhistory = new Educationhistory();


  public void register(){
    
    StudentServiceImpl studentService = new StudentServiceImpl();
    //EducationhistoryServiceImpl educationhistoryService = new EducationhistoryServiceImpl();
    
    try {
      if (studentService.addStudent(student, specialty)){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Please check your email address."));
      }
      else{
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Registration was failed."));
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Please check all inputs."));
    }
  }


  private static final ArrayList<Educationhistory> historyList = new ArrayList<Educationhistory>();
 
  public ArrayList<Educationhistory> getHistoryList() {
        return historyList;
  }

  public String addAction() {

    Student st = new Student();
    Educationhistory orderitem = new Educationhistory(st, educationhistory.getEducatedPlaceName(), educationhistory.getDuringTime(),
     educationhistory.getAnddress());
    historyList.add(orderitem);
 
    educationhistory.setEducatedPlaceName("");
    educationhistory.setDuringTime("");
    educationhistory.setAnddress("");
    return null;
  }

    public void onEdit(RowEditEvent event) {  

        FacesMessage msg = new FacesMessage("Item Edited",((Educationhistory) event.getObject()).getEducatedPlaceName());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
       
    public void onCancel(RowEditEvent event) {  

        FacesMessage msg = new FacesMessage("Item Cancelled");   
        FacesContext.getCurrentInstance().addMessage(null, msg); 
        historyList.remove((Educationhistory) event.getObject());
    }



  public Student getStudent() {
    return student;
  }
 
  public void setStudent(Student student) {
    this.student = student;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  public void setFaculty(Faculty faculty) {
    this.faculty = faculty;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
  }

  public Educationhistory getEducationhistory() {
    return educationhistory;
  }

  public void setEducationhistory(Educationhistory educationhistory)  {
    this.educationhistory = educationhistory;
  }
         
}