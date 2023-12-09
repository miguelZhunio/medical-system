package model.classes.associations;

import model.classes.person.HealthEmployer;

/**
 * @author Zhunio
 */
public class EmployerAmbitSpecialty {
    
    private int code_eas;
    private ProfessionalFieldSpecialties fk_codeProfessionalFieldSpecialty_eas;
    private HealthEmployer fk_codeHealthemployer_eas;

    public EmployerAmbitSpecialty() {
        
    }

    public EmployerAmbitSpecialty(ProfessionalFieldSpecialties fk_codeProfessionalFieldSpecialty_eas, HealthEmployer fk_codeHealthemployer) {
        this.fk_codeProfessionalFieldSpecialty_eas = fk_codeProfessionalFieldSpecialty_eas;
        this.fk_codeHealthemployer_eas = fk_codeHealthemployer;
    }

    public EmployerAmbitSpecialty(int code_eas, ProfessionalFieldSpecialties fk_codeProfessionalFieldSpecialty_eas, HealthEmployer fk_codeHealthemployer) {
        this.code_eas = code_eas;
        this.fk_codeProfessionalFieldSpecialty_eas = fk_codeProfessionalFieldSpecialty_eas;
        this.fk_codeHealthemployer_eas = fk_codeHealthemployer;
    }

    public int getCode_eas() {
        return code_eas;
    }

    public ProfessionalFieldSpecialties getFk_codeProfessionalFieldSpecialty_eas() {
        return fk_codeProfessionalFieldSpecialty_eas;
    }

    public void setFk_codeProfessionalFieldSpecialty_eas(ProfessionalFieldSpecialties fk_codeProfessionalFieldSpecialty_eas) {
        this.fk_codeProfessionalFieldSpecialty_eas = fk_codeProfessionalFieldSpecialty_eas;
    }

    public HealthEmployer getFk_codeHealthemployer() {
        return fk_codeHealthemployer_eas;
    }

    public void setFk_codeHealthemployer(HealthEmployer fk_codeHealthemployer) {
        this.fk_codeHealthemployer_eas = fk_codeHealthemployer;
    }
     
    
}
