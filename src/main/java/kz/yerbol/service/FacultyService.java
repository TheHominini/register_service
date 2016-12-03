package kz.yerbol.service;

import java.util.List;
import kz.yerbol.dao.domain.*;

/**
 *
 * @author Yerbol
 */
public interface FacultyService {
    
    public List<Faculty> getFacultyList();
    public void addFaculty();
    public void removeFaculty();
}
