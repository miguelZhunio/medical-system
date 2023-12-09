package model.classes.medicine.medicalappointment;

import java.util.Date;
import model.classes.person.Doctor;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class MedicalOrder {
    
    private int code_meo;
    private Date realizationDate_meo;
    private String diagnosis_meo;
    private String observations_meo;
    private Patient fk_codePatient_meo;
    private Doctor fk_codeDoctor_meo;
    private boolean status_meo;

    public MedicalOrder() {
    }

    public MedicalOrder(Date realizationDate_meo, String diagnosis_meo, String observations_meo, Patient fk_codePatient_meo, Doctor fk_codeDoctor_meo, boolean status_meo) {
        this.realizationDate_meo = realizationDate_meo;
        this.diagnosis_meo = diagnosis_meo;
        this.observations_meo = observations_meo;
        this.fk_codePatient_meo = fk_codePatient_meo;
        this.fk_codeDoctor_meo = fk_codeDoctor_meo;
        this.status_meo = status_meo;
    }

    public MedicalOrder(int code_meo, Date realizationDate_meo, String diagnosis_meo, String observations_meo, Patient fk_codePatient_meo, Doctor fk_codeDoctor_meo, boolean status_meo) {
        this.code_meo = code_meo;
        this.realizationDate_meo = realizationDate_meo;
        this.diagnosis_meo = diagnosis_meo;
        this.observations_meo = observations_meo;
        this.fk_codePatient_meo = fk_codePatient_meo;
        this.fk_codeDoctor_meo = fk_codeDoctor_meo;
        this.status_meo = status_meo;
    }

    public int getCode_meo() {
        return code_meo;
    }

    public Date getRealizationDate_meo() {
        return realizationDate_meo;
    }

    public void setRealizationDate_meo(Date realizationDate_meo) {
        this.realizationDate_meo = realizationDate_meo;
    }

    public String getDiagnosis_meo() {
        return diagnosis_meo;
    }

    public void setDiagnosis_meo(String diagnosis_meo) {
        this.diagnosis_meo = diagnosis_meo;
    }

    public String getObservations_meo() {
        return observations_meo;
    }

    public void setObservations_meo(String observations_meo) {
        this.observations_meo = observations_meo;
    }

    public Patient getFk_codePatient_meo() {
        return fk_codePatient_meo;
    }

    public void setFk_codePatient_meo(Patient fk_codePatient_meo) {
        this.fk_codePatient_meo = fk_codePatient_meo;
    }

    public Doctor getFk_codeDoctor_meo() {
        return fk_codeDoctor_meo;
    }

    public void setFk_codeDoctor_meo(Doctor fk_codeDoctor_meo) {
        this.fk_codeDoctor_meo = fk_codeDoctor_meo;
    }

    public boolean isStatus_meo() {
        return status_meo;
    }

    public void setStatus_meo(boolean status_meo) {
        this.status_meo = status_meo;
    }

    
}
