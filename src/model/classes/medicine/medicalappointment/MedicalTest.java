package model.classes.medicine.medicalappointment;

import java.util.Date;
import model.classes.person.LaboratoryTechnician;

/**
 *
 * @author Zhunio
 */
public class MedicalTest {
    
    private int code_met;
    private int samplenumber_met;
    private String type_met;
    private Date resultDate_met;
    private String observagtions_met;
    private MedicalOrder fk_codeMedicalOrder;
    private LaboratoryTechnician fk_codeLaboratoryTechnician;

    public MedicalTest() {
    }

    public MedicalTest(int samplenumber_met, String type_met, Date resultDate_met, String observagtions_met, MedicalOrder fk_codeMedicalOrder, LaboratoryTechnician fk_codeLaboratoryTechnician) {
        this.samplenumber_met = samplenumber_met;
        this.type_met = type_met;
        this.resultDate_met = resultDate_met;
        this.observagtions_met = observagtions_met;
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
        this.fk_codeLaboratoryTechnician = fk_codeLaboratoryTechnician;
    }

    public MedicalTest(int code_met, int samplenumber_met, String type_met, Date resultDate_met, String observagtions_met, MedicalOrder fk_codeMedicalOrder, LaboratoryTechnician fk_codeLaboratoryTechnician) {
        this.code_met = code_met;
        this.samplenumber_met = samplenumber_met;
        this.type_met = type_met;
        this.resultDate_met = resultDate_met;
        this.observagtions_met = observagtions_met;
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
        this.fk_codeLaboratoryTechnician = fk_codeLaboratoryTechnician;
    }

    public int getCode_met() {
        return code_met;
    }

    public int getSamplenumber_met() {
        return samplenumber_met;
    }

    public void setSamplenumber_met(int samplenumber_met) {
        this.samplenumber_met = samplenumber_met;
    }

    public String getType_met() {
        return type_met;
    }

    public void setType_met(String type_met) {
        this.type_met = type_met;
    }

    public Date getResultDate_met() {
        return resultDate_met;
    }

    public void setResultDate_met(Date resultDate_met) {
        this.resultDate_met = resultDate_met;
    }

    public String getObservagtions_met() {
        return observagtions_met;
    }

    public void setObservagtions_met(String observagtions_met) {
        this.observagtions_met = observagtions_met;
    }

    public MedicalOrder getFk_codeMedicalOrder() {
        return fk_codeMedicalOrder;
    }

    public void setFk_codeMedicalOrder(MedicalOrder fk_codeMedicalOrder) {
        this.fk_codeMedicalOrder = fk_codeMedicalOrder;
    }

    public LaboratoryTechnician getFk_codeLaboratoryTechnician() {
        return fk_codeLaboratoryTechnician;
    }

    public void setFk_codeLaboratoryTechnician(LaboratoryTechnician fk_codeLaboratoryTechnician) {
        this.fk_codeLaboratoryTechnician = fk_codeLaboratoryTechnician;
    }
    
    
}
