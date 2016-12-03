package kz.yerbol.dao.domain;
// Generated 28.10.2016 18:30:19 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


 @Entity
 @Table(name = "Faculty")
public class Faculty  implements java.io.Serializable {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "idFaculty")
		private Integer idFaculty;

		@Column(name = "name")
    private String name;

		@OneToMany(mappedBy = "faculty")
    private Set<Specialty> specialties = new HashSet<Specialty>(0);

    public Faculty() {
    }

    public Faculty(String name, Set specialties) {
       this.name = name;
       this.specialties = specialties;
    }
   
    public Integer getIdFaculty() {
        return this.idFaculty;
    }
    
    public void setIdFaculty(Integer idFaculty) {
        this.idFaculty = idFaculty;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getSpecialties() {
        return this.specialties;
    }
    
    public void setSpecialties(Set specialties) {
        this.specialties = specialties;
    }

}


