package model.classes.medicine.medicalappointment;

import java.time.LocalTime;
import java.util.Date;
import model.classes.person.Doctor;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class MedicalAppointment {
    
    private int code_mea;
    private Date issuedDate_mea;
    private LocalTime startTime_mea;
    private LocalTime endTime_mea;
    private String type_mea;
    private Patient fk_codePatient_mea;
    private Doctor fk_codeDoctor_mea;

    public MedicalAppointment() {
    }

    public MedicalAppointment(Date issuedDate_mea, LocalTime startTime_mea, LocalTime endTime_mea, String type_mea, Patient fk_codePatient_mea, Doctor fk_codeDoctor_mea) {
        this.issuedDate_mea = issuedDate_mea;
        this.startTime_mea = startTime_mea;
        this.endTime_mea = endTime_mea;
        this.type_mea = type_mea;
        this.fk_codePatient_mea = fk_codePatient_mea;
        this.fk_codeDoctor_mea = fk_codeDoctor_mea;
    }

    public MedicalAppointment(int code_mea, Date issuedDate_mea, LocalTime startTime_mea, LocalTime endTime_mea, String type_mea, Patient fk_codePatient_mea, Doctor fk_codeDoctor_mea) {
        this.code_mea = code_mea;
        this.issuedDate_mea = issuedDate_mea;
        this.startTime_mea = startTime_mea;
        this.endTime_mea = endTime_mea;
        this.type_mea = type_mea;
        this.fk_codePatient_mea = fk_codePatient_mea;
        this.fk_codeDoctor_mea = fk_codeDoctor_mea;
    }

    public int getCode_mea() {
        return code_mea;
    }

    public Date getIssuedDate_mea() {
        return issuedDate_mea;
    }

    public void setIssuedDate_mea(Date issuedDate_mea) {
        this.issuedDate_mea = issuedDate_mea;
    }

    public LocalTime getStartTime_mea() {
        return startTime_mea;
    }

    public void setStartTime_mea(LocalTime startTime_mea) {
        this.startTime_mea = startTime_mea;
    }

    public LocalTime getEndTime_mea() {
        return endTime_mea;
    }

    public void setEndTime_mea(LocalTime endTime_mea) {
        this.endTime_mea = endTime_mea;
    }

    public String getType_mea() {
        return type_mea;
    }

    public void setType_mea(String type_mea) {
        this.type_mea = type_mea;
    }

    public Patient getFk_codePatient_mea() {
        return fk_codePatient_mea;
    }

    public void setFk_codePatient_mea(Patient fk_codePatient_mea) {
        this.fk_codePatient_mea = fk_codePatient_mea;
    }

    public Doctor getFk_codeDoctor_mea() {
        return fk_codeDoctor_mea;
    }

    public void setFk_codeDoctor_mea(Doctor fk_codeDoctor_mea) {
        this.fk_codeDoctor_mea = fk_codeDoctor_mea;
    }

    
    
}
