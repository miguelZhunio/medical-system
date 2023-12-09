package model.classes.associations;

import model.classes.medicine.MedicaParameters;
import model.classes.medicine.medicalappointment.MedicalOrder;

/**
 * @author Zhunio
 */
public class MedicaParametersOrder {
    
    private int code_mep;
    private String name_mep;
    private MedicaParameters fk_codeMedicaParameters;
    private MedicalOrder fk_codeMedicalOrder;

    public MedicaParametersOrder() {
    }

    public MedicaParametersOrder(String name_mep, MedicaParameters fk_codeMedicaParameters, MedicalOrder fk_codeMedicalOrder) {
        this.name_mep = name_mep;
        this.fk_codeMedicaParameters = fk_codeMedicaParameters;
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
    }

    public MedicaParametersOrder(int code_mep, String name_mep, MedicaParameters fk_codeMedicaParameters, MedicalOrder fk_codeMedicalOrder) {
        this.code_mep = code_mep;
        this.name_mep = name_mep;
        this.fk_codeMedicaParameters = fk_codeMedicaParameters;
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
    }

    public int getCode_mep() {
        return code_mep;
    }

    public String getName_mep() {
        return name_mep;
    }

    public void setName_mep(String name_mep) {
        this.name_mep = name_mep;
    }

    public MedicaParameters getFk_codeMedicaParameters() {
        return fk_codeMedicaParameters;
    }

    public void setFk_codeMedicaParameters(MedicaParameters fk_codeMedicaParameters) {
        this.fk_codeMedicaParameters = fk_codeMedicaParameters;
    }

    public MedicalOrder getFk_codeMedicalOrder() {
        return fk_codeMedicalOrder;
    }

    public void setFk_codeMedicalOrder(MedicalOrder fk_codeMedicalOrder) {
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
    }
    
    
    
}
