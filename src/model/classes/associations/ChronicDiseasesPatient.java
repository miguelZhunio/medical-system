package model.classes.associations;

import model.classes.medicine.ChronicDiseases;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class ChronicDiseasesPatient {
    private int code_chd;
    private ChronicDiseases fk_codeChronicDiseases_chd;
    private Patient fk_codePatient_chd;

    public ChronicDiseasesPatient() {
    }

    public ChronicDiseasesPatient(ChronicDiseases fk_codeChronicDiseases_chd, Patient fk_codePatient_chd) {
        this.fk_codeChronicDiseases_chd = fk_codeChronicDiseases_chd;
        this.fk_codePatient_chd = fk_codePatient_chd;
    }

    public ChronicDiseasesPatient(int code_chd, ChronicDiseases fk_codeChronicDiseases_chd, Patient fk_codePatient_chd) {
        this.code_chd = code_chd;
        this.fk_codeChronicDiseases_chd = fk_codeChronicDiseases_chd;
        this.fk_codePatient_chd = fk_codePatient_chd;
    }

    public int getCode_chd() {
        return code_chd;
    }

    public ChronicDiseases getFk_codeChronicDiseases_chd() {
        return fk_codeChronicDiseases_chd;
    }

    public void setFk_codeChronicDiseases_chd(ChronicDiseases fk_codeChronicDiseases_chd) {
        this.fk_codeChronicDiseases_chd = fk_codeChronicDiseases_chd;
    }

    public Patient getFk_codePatient_chd() {
        return fk_codePatient_chd;
    }

    public void setFk_codePatient_chd(Patient fk_codePatient_chd) {
        this.fk_codePatient_chd = fk_codePatient_chd;
    }
    
    
}
