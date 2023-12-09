package model.classes.medicine.medicament;

import java.util.Date;
import model.classes.department.Installation;

/**
 * @author Zhunio
 */
public class Medications {
    
    private int code_med;
    private String name_med;
    private Date manufacturedDate_med;
    private Date expirationDate_med;
    private int amount_med;
    private boolean underPrescription_med;
    private double price_med;
    private Installation fk_codeInstallation_med;
    private Provider fk_codeProvider_med;

    public Medications() {
    }

    public Medications(String name_med, Date manufacturedDate_med, Date expirationDate_med, int amount_med, boolean underPrescription_med, double price_med, Installation fk_codeInstallation_med, Provider fk_codeProvider_med) {
        this.name_med = name_med;
        this.manufacturedDate_med = manufacturedDate_med;
        this.expirationDate_med = expirationDate_med;
        this.amount_med = amount_med;
        this.underPrescription_med = underPrescription_med;
        this.price_med = price_med;
        this.fk_codeInstallation_med = fk_codeInstallation_med;
        this.fk_codeProvider_med = fk_codeProvider_med;
    }

    public Medications(int code_med, String name_med, Date manufacturedDate_med, Date expirationDate_med, int amount_med, boolean underPrescription_med, double price_med, Installation fk_codeInstallation_med, Provider fk_codeProvider_med) {
        this.code_med = code_med;
        this.name_med = name_med;
        this.manufacturedDate_med = manufacturedDate_med;
        this.expirationDate_med = expirationDate_med;
        this.amount_med = amount_med;
        this.underPrescription_med = underPrescription_med;
        this.price_med = price_med;
        this.fk_codeInstallation_med = fk_codeInstallation_med;
        this.fk_codeProvider_med = fk_codeProvider_med;
    }

    public int getCode_med() {
        return code_med;
    }

    public String getName_med() {
        return name_med;
    }

    public void setName_med(String name_med) {
        this.name_med = name_med;
    }

    public Date getManufacturedDate_med() {
        return manufacturedDate_med;
    }

    public void setManufacturedDate_med(Date manufacturedDate_med) {
        this.manufacturedDate_med = manufacturedDate_med;
    }

    public Date getExpirationDate_med() {
        return expirationDate_med;
    }

    public void setExpirationDate_med(Date expirationDate_med) {
        this.expirationDate_med = expirationDate_med;
    }

    public int getAmount_med() {
        return amount_med;
    }

    public void setAmount_med(int amount_med) {
        this.amount_med = amount_med;
    }

    public boolean isUnderPrescription_med() {
        return underPrescription_med;
    }

    public void setUnderPrescription_med(boolean underPrescription_med) {
        this.underPrescription_med = underPrescription_med;
    }

    public double getPrice_med() {
        return price_med;
    }

    public void setPrice_med(double price_med) {
        this.price_med = price_med;
    }

    public Installation getFk_codeInstallation_med() {
        return fk_codeInstallation_med;
    }

    public void setFk_codeInstallation_med(Installation fk_codeInstallation_med) {
        this.fk_codeInstallation_med = fk_codeInstallation_med;
    }

    public Provider getFk_codeProvider_med() {
        return fk_codeProvider_med;
    }

    public void setFk_codeProvider_med(Provider fk_codeProvider_med) {
        this.fk_codeProvider_med = fk_codeProvider_med;
    }
    
    
    
    
    
    
    
    
}
