package model.classes.person;

import java.util.Date;
import model.classes.department.Department;
import model.classes.enums.CivilStatus;
import model.classes.enums.Gender;

/**
 * @author Zhunio
 */
public class LaboratoryTechnician extends HealthEmployer {
    
    private int code_lab;
    private boolean equipmentMaintenance;

    public LaboratoryTechnician() {
    }

    public LaboratoryTechnician(boolean equipmentMaintenance, double qualification_hea, String tuitionNumber_hea, double salary_hea, Department department_hea, String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        super(qualification_hea, tuitionNumber_hea, salary_hea, department_hea, id_per, firstName_per, secondName_per, lastName_per, mothersLastName_per, phone_per, reservationPhone_per, gender_per, email_per, birthDate_per, civilStatus_per);
        this.equipmentMaintenance = equipmentMaintenance;
    }

    public LaboratoryTechnician(int code_lab, boolean equipmentMaintenance, double qualification_hea, String tuitionNumber_hea, double salary_hea, Department department_hea, String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        super(qualification_hea, tuitionNumber_hea, salary_hea, department_hea, id_per, firstName_per, secondName_per, lastName_per, mothersLastName_per, phone_per, reservationPhone_per, gender_per, email_per, birthDate_per, civilStatus_per);
        this.code_lab = code_lab;
        this.equipmentMaintenance = equipmentMaintenance;
    }
    
    

    public int getCode_lab() {
        return code_lab;
    }

    public boolean isEquipmentMaintenance() {
        return equipmentMaintenance;
    }

    public void setEquipmentMaintenance(boolean equipmentMaintenance) {
        this.equipmentMaintenance = equipmentMaintenance;
    }
        
     
}
