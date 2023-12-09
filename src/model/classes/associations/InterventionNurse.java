package model.classes.associations;

import model.classes.medicine.Intervention;
import model.classes.person.Nurse;

/**
 * @author Zhunio
 */
public class InterventionNurse {
    
    private int code_inn;
    private Intervention fk_codeIntervention_inn;
    private Nurse fk_codeNurse_enn;

    public InterventionNurse() {
    }

    public InterventionNurse(Intervention fk_codeIntervention_inn, Nurse fk_codeNurse_enn) {
        this.fk_codeIntervention_inn = fk_codeIntervention_inn;
        this.fk_codeNurse_enn = fk_codeNurse_enn;
    }

    public InterventionNurse(int code_inn, Intervention fk_codeIntervention_inn, Nurse fk_codeNurse_enn) {
        this.code_inn = code_inn;
        this.fk_codeIntervention_inn = fk_codeIntervention_inn;
        this.fk_codeNurse_enn = fk_codeNurse_enn;
    }

    public int getCode_inn() {
        return code_inn;
    }

    public Intervention getFk_codeIntervention_inn() {
        return fk_codeIntervention_inn;
    }

    public void setFk_codeIntervention_inn(Intervention fk_codeIntervention_inn) {
        this.fk_codeIntervention_inn = fk_codeIntervention_inn;
    }

    public Nurse getFk_codeNurse_enn() {
        return fk_codeNurse_enn;
    }

    public void setFk_codeNurse_enn(Nurse fk_codeNurse_enn) {
        this.fk_codeNurse_enn = fk_codeNurse_enn;
    }
    
 
    
}
