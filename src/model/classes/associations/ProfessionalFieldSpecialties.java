package model.classes.associations;

import model.classes.medicine.MedicalSpecialties;
import model.classes.medicine.ProfessionalField;

/**
 * @author Zhunio
 */
public class ProfessionalFieldSpecialties {
    
    private int code_prs;
    private double experience_prs;
    private ProfessionalField fk_codeProfesionalfield_prs;
    private MedicalSpecialties fk_codeMedicalspecialties_prs;

    public ProfessionalFieldSpecialties() {
        
    }

    public ProfessionalFieldSpecialties(double experience_prs, ProfessionalField fk_codeProfesionalfield, MedicalSpecialties fk_codeMedicalspecialties) {
        this.experience_prs = experience_prs;
        this.fk_codeProfesionalfield_prs = fk_codeProfesionalfield;
        this.fk_codeMedicalspecialties_prs = fk_codeMedicalspecialties;
    }

    public ProfessionalFieldSpecialties(int code_prs, double experience_prs, ProfessionalField fk_codeProfesionalfield, MedicalSpecialties fk_codeMedicalspecialties) {
        this.code_prs = code_prs;
        this.experience_prs = experience_prs;
        this.fk_codeProfesionalfield_prs = fk_codeProfesionalfield;
        this.fk_codeMedicalspecialties_prs = fk_codeMedicalspecialties;
    }

    public int getCode_prs() {
        return code_prs;
    }

    public double getExperience_prs() {
        return experience_prs;
    }

    public void setExperience_prs(double experience_prs) {
        this.experience_prs = experience_prs;
    }

    public ProfessionalField getFk_codeProfesionalfield() {
        return fk_codeProfesionalfield_prs;
    }

    public void setFk_codeProfesionalfield(ProfessionalField fk_codeProfesionalfield_prs) {
        this.fk_codeProfesionalfield_prs = fk_codeProfesionalfield_prs;
    }

    public MedicalSpecialties getFk_codeMedicalspecialties() {
        return fk_codeMedicalspecialties_prs;
    }

    public void setFk_codeMedicalspecialties(MedicalSpecialties fk_codeMedicalspecialties_prs) {
        this.fk_codeMedicalspecialties_prs = fk_codeMedicalspecialties_prs;
    }    
    
    
}
