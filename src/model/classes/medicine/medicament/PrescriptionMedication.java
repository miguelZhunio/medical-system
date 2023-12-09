package model.classes.medicine.medicament;
/**
 * @author Zhunio
 */
public class PrescriptionMedication {
    
    private int code_prm;
    private int amount_prm;
    private String consumptionInstructions_prm;
    private double subtotal_prm;
    private Medications fk_codeMedications_prm;
    private double priceMed_prm;
    private Prescription fk_codePrescription_prm;

    public PrescriptionMedication() {
    }

    public PrescriptionMedication(int amount_prm, String consumptionInstructions_prm, double subtotal_prm, Medications fk_codeMedications_prm, double priceMed_prm, Prescription fk_codePrescription_prm) {
        this.amount_prm = amount_prm;
        this.consumptionInstructions_prm = consumptionInstructions_prm;
        this.subtotal_prm = subtotal_prm;
        this.fk_codeMedications_prm = fk_codeMedications_prm;
        this.priceMed_prm = priceMed_prm;
        this.fk_codePrescription_prm = fk_codePrescription_prm;
    }

    public PrescriptionMedication(int code_prm, int amount_prm, String consumptionInstructions_prm, double subtotal_prm, Medications fk_codeMedications_prm, double priceMed_prm, Prescription fk_codePrescription_prm) {
        this.code_prm = code_prm;
        this.amount_prm = amount_prm;
        this.consumptionInstructions_prm = consumptionInstructions_prm;
        this.subtotal_prm = subtotal_prm;
        this.fk_codeMedications_prm = fk_codeMedications_prm;
        this.priceMed_prm = priceMed_prm;
        this.fk_codePrescription_prm = fk_codePrescription_prm;
    }

    public int getCode_prm() {
        return code_prm;
    }

    public int getAmount_prm() {
        return amount_prm;
    }

    public void setAmount_prm(int amount_prm) {
        this.amount_prm = amount_prm;
    }

    public String getConsumptionInstructions_prm() {
        return consumptionInstructions_prm;
    }

    public void setConsumptionInstructions_prm(String consumptionInstructions_prm) {
        this.consumptionInstructions_prm = consumptionInstructions_prm;
    }

    public double getSubtotal_prm() {
        return subtotal_prm;
    }

    public void setSubtotal_prm(double subtotal_prm) {
        this.subtotal_prm = subtotal_prm;
    }

    public Medications getFk_codeMedications_prm() {
        return fk_codeMedications_prm;
    }

    public void setFk_codeMedications_prm(Medications fk_codeMedications_prm) {
        this.fk_codeMedications_prm = fk_codeMedications_prm;
    }

    public double getPriceMed_prm() {
        return priceMed_prm;
    }

    public void setPriceMed_prm(double priceMed_prm) {
        this.priceMed_prm = priceMed_prm;
    }

    public Prescription getFk_codePrescription_prm() {
        return fk_codePrescription_prm;
    }

    public void setFk_codePrescription_prm(Prescription fk_codePrescription_prm) {
        this.fk_codePrescription_prm = fk_codePrescription_prm;
    }
    
    
}
