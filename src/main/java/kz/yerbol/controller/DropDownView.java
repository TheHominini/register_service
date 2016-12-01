package kz.yerbol.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;
import java.util.Iterator;
import kz.yerbol.service.impl.FacultyServiceImpl;
import kz.yerbol.domain.Faculty;
import kz.yerbol.domain.Specialty;

@ManagedBean
@ViewScoped
public class DropDownView implements Serializable {

    @ManagedProperty("#{registerController}")
    private RegisterController registerController;

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String faculty;
    private String specialty;
    private int specialtyId;
    private Map<String, String> faculties;
    private Map<String, String> specialties;
    private Map<String, Integer> specialtiesId;

    
    @PostConstruct
    public void init() {
        
        faculties  = new HashMap<String, String>();
        
        Map<String,String> map = new HashMap<String, String>();

        FacultyServiceImpl facultyService = new FacultyServiceImpl();
				
				List<Faculty> facultyList = facultyService.getFacultyList();

				specialtiesId = new HashMap<String, Integer>();        
        
				for (Faculty localFaculty : facultyList){
					faculties.put(localFaculty.getName(), localFaculty.getName());
					Set<Specialty> specialtySet = localFaculty.getSpecialties();
					map = new HashMap<String, String>();

            for (Specialty localSpecialty : specialtySet){
							map.put(localSpecialty.getName(), localSpecialty.getName());
                // System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+localSpecialty.getIdspecialty());          Try to get specialty id
                specialtiesId.put(localSpecialty.getName(), localSpecialty.getIdspecialty());
            }

						data.put(localFaculty.getName(), map);
				}


        // faculties.put("CSSE", "CSSE");
        // faculties.put("IS", "IS");
        // faculties.put("MCM", "MCM");
     
 
        // map.put("CSSE 1", "CSSE 1");
        // map.put("CSSE 2", "CSSE 2");
        // map.put("CSSE 3", "CSSE 3");
        // data.put("CSSE", map);
         
        // map = new HashMap<String, String>();
        // map.put("IS 1", "IS 1");
        // map.put("IS 2", "IS 2");
        // map.put("IS 3", "IS 3");
        // data.put("IS", map);
         
        // map = new HashMap<String, String>();
        // map.put("MCM 1", "MCM 1");
        // map.put("MCM 2", "MCM 2");
        // map.put("MCM 3", "MCM 3");
        // data.put("MCM", map);
  }
    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

		public Integer getSpecialtyId(){              
			return specialtyId;
		}

		public void setSpecialtyId(Integer id){
			this.specialtyId = id;
		}



    public Map<String, String> getFaculties() {
        return faculties;
    }

    public Map<String, String> getSpecialties() {
        return specialties;
    }


		 public void setRegisterController(RegisterController rController) {
        this.registerController = rController;
    }

    public void onFacultyChange() {
        if (faculty != null && !faculty.equals("")) {
            specialties = data.get(faculty);
        } else {
            specialties = new HashMap<String, String>();
        }
    }

		public void onSpecialtyChange() {      
        if (specialty != null && !specialty.equals("")) {
            specialtyId = specialtiesId.get(specialty);
						registerController.getSpecialty().setName(specialty);
						registerController.getSpecialty().setIdspecialty(specialtyId);
        } else {
            specialtyId = 0;
        }
    }

}
