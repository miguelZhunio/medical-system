package model.classes.person;

import java.util.Date;
import model.classes.department.Department;
import model.classes.enums.CivilStatus;
import model.classes.enums.Gender;

/**
 * @author Zhunio
 */
abstract public class HealthEmployer extends Person{
    private int code_hea;
    private double qualification_hea;
    private String tuitionNumber_hea;
    private double salary_hea;
    private Department department_hea;

    public HealthEmployer() {
        super();
    }

    public HealthEmployer(double qualification_hea, String tuitionNumber_hea, double salary_hea, Department department_hea, String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        super(id_per, firstName_per, secondName_per, lastName_per, mothersLastName_per, phone_per, reservationPhone_per, gender_per, email_per, birthDate_per, civilStatus_per);
        this.qualification_hea = qualification_hea;
        this.tuitionNumber_hea = tuitionNumber_hea;
        this.salary_hea = salary_hea;
        this.department_hea = department_hea;
    }

    public double getQualification_hea() {
        return qualification_hea;
    }

    public void setQualification_hea(double qualification_hea) {
        this.qualification_hea = qualification_hea;
    }

    public String getTuitionNumber_hea() {
        return tuitionNumber_hea;
    }

    public void setTuitionNumber_hea(String tuitionNumber_hea) {
        this.tuitionNumber_hea = tuitionNumber_hea;
    }

    public double getSalary_hea() {
        return salary_hea;
    }

    public void setSalary_hea(double salary_hea) {
        this.salary_hea = salary_hea;
    }

    public Department getDepartment_hea() {
        return department_hea;
    }

    public void setDepartment_hea(Department department_hea) {
        this.department_hea = department_hea;
    }    
    
    
}
