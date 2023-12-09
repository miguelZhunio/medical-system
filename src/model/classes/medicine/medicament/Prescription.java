package model.classes.medicine.medicament;

import java.util.Date;
import model.classes.person.Doctor;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class Prescription {
    
    private int code_pre;
    private Date date_pre;
    private String type_pre;
    private double total_pre;
    private Patient fk_codePatient_pre;
    private Doctor fk_codeDoctor_pre;
    private boolean status_pre;

    public Prescription() {
    }

    public Prescription(Date date_pre, String type_pre, double total_pre, Patient fk_codePatient_pre, Doctor fk_codeDoctor_pre, boolean status_pre) {
        this.date_pre = date_pre;
        this.type_pre = type_pre;
        this.total_pre = total_pre;
        this.fk_codePatient_pre = fk_codePatient_pre;
        this.fk_codeDoctor_pre = fk_codeDoctor_pre;
        this.status_pre = status_pre;
    }

    public Prescription(int code_pre, Date date_pre, String type_pre, double total_pre, Patient fk_codePatient_pre, Doctor fk_codeDoctor_pre, boolean status_pre) {
        this.code_pre = code_pre;
        this.date_pre = date_pre;
        this.type_pre = type_pre;
        this.total_pre = total_pre;
        this.fk_codePatient_pre = fk_codePatient_pre;
        this.fk_codeDoctor_pre = fk_codeDoctor_pre;
        this.status_pre = status_pre;
    }

    public int getCode_pre() {
        return code_pre;
    }

    public Date getDate_pre() {
        return date_pre;
    }

    public void setDate_pre(Date date_pre) {
        this.date_pre = date_pre;
    }

    public String getType_pre() {
        return type_pre;
    }

    public void setType_pre(String type_pre) {
        this.type_pre = type_pre;
    }

    public double getTotal_pre() {
        return total_pre;
    }

    public void setTotal_pre(double total_pre) {
        this.total_pre = total_pre;
    }

    public Patient getFk_codePatient_pre() {
        return fk_codePatient_pre;
    }

    public void setFk_codePatient_pre(Patient fk_codePatient_pre) {
        this.fk_codePatient_pre = fk_codePatient_pre;
    }

    public Doctor getFk_codeDoctor_pre() {
        return fk_codeDoctor_pre;
    }

    public void setFk_codeDoctor_pre(Doctor fk_codeDoctor_pre) {
        this.fk_codeDoctor_pre = fk_codeDoctor_pre;
    }

    public boolean isStatus_pre() {
        return status_pre;
    }

    public void setStatus_pre(boolean status_pre) {
        this.status_pre = status_pre;
    }
    
   
    
}
