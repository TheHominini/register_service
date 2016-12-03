import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;
import kz.yerbol.dao.domain.*;

import kz.yerbol.service.impl.FacultyServiceImpl;
public class FacultyServiceTest{

  private FacultyServiceImpl fService = new FacultyServiceImpl();
  
  @Test
  public void testGetFaculty(){
    List<String> expect = new LinkedList<String>();
    expect.add("ECO");
    expect.add("Engineering");
    expect.add("LOW");
    expect.add("Philo");

    List<String> facultyNames = new LinkedList<String>();
    List<Faculty> facultyList = fService.getFacultyList();
    for (Faculty fac : facultyList){
      facultyNames.add(fac.getName());
    }
    
    Assert.assertEquals(expect, facultyNames);
  
  }

}