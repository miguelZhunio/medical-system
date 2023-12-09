package model.classes.associations;

import model.classes.medicine.Allergies;
import model.classes.person.Patient;

/**
 *
 * @author Zhunio
 */
public class AllergiesPatient {
    private int code_Alp;
    private Allergies allergies;
    private Patient patient;

    public AllergiesPatient() {
    }

    public AllergiesPatient(Allergies allergies, Patient patient) {
        this.allergies = allergies;
        this.patient = patient;
    }

    public AllergiesPatient(int code_Alp, Allergies allergies, Patient patient) {
        this.code_Alp = code_Alp;
        this.allergies = allergies;
        this.patient = patient;
    }

    public int getCode_Alp() {
        return code_Alp;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
   
    
}
