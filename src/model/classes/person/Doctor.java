package model.classes.person;

import java.util.Date;
import model.classes.department.Department;
import model.classes.enums.CivilStatus;
import model.classes.enums.Gender;

/**
 *
 * @author Zhunio
 */
public class Doctor extends HealthEmployer {
    
    private int code_doc;
    private String featuredArea_doc;

    public Doctor() {
        super();
    }

    public Doctor(String featuredArea_doc, double qualification_hea, String tuitionNumber_hea, double salary_hea, Department department_hea, String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        super(qualification_hea, tuitionNumber_hea, salary_hea, department_hea, id_per, firstName_per, secondName_per, lastName_per, mothersLastName_per, phone_per, reservationPhone_per, gender_per, email_per, birthDate_per, civilStatus_per);
        this.featuredArea_doc = featuredArea_doc;
    }

    public int getCode_doc() {
        return code_doc;
    }

    public String getFeaturedArea_doc() {
        return featuredArea_doc;
    }

    public void setFeaturedArea_doc(String featuredArea_doc) {
        this.featuredArea_doc = featuredArea_doc;
    } 
    
    
    
}
