package model.classes.department;

import java.util.Date;
import model.classes.enums.TypeTeam;

/**
 * @author Zhunio
 */
public class Equipment {
    private int code_equ;
    private String name_equ;
    private Date acquisitionDate_equ;
    private TypeTeam type_equ;
    private double price_equ;
    private Installation fk_codeInstallation;
    private boolean status_equ;

    public Equipment() {
    }

    public Equipment(String name_equ, Date acquisitionDate_equ, TypeTeam type_equ, double price_equ, Installation fk_codeInstallation, boolean status_equ) {
        this.name_equ = name_equ;
        this.acquisitionDate_equ = acquisitionDate_equ;
        this.type_equ = type_equ;
        this.price_equ = price_equ;
        this.fk_codeInstallation = fk_codeInstallation;
        this.status_equ = status_equ;
    }    
    
    public Equipment(int code_equ, String name_equ, Date acquisitionDate_equ, TypeTeam type_equ, double price_equ, Installation fk_codeInstallation, boolean status_equ) {
        this.code_equ = code_equ;
        this.name_equ = name_equ;
        this.acquisitionDate_equ = acquisitionDate_equ;
        this.type_equ = type_equ;
        this.price_equ = price_equ;
        this.fk_codeInstallation = fk_codeInstallation;
        this.status_equ = status_equ;
    }

    public int getCode_equ() {
        return code_equ;
    }

    public String getName_equ() {
        return name_equ;
    }

    public void setName_equ(String name_equ) {
        this.name_equ = name_equ;
    }

    public Date getAcquisitionDate_equ() {
        return acquisitionDate_equ;
    }

    public void setAcquisitionDate_equ(Date acquisitionDate_equ) {
        this.acquisitionDate_equ = acquisitionDate_equ;
    }

    public TypeTeam getType_equ() {
        return type_equ;
    }

    public void setType_equ(TypeTeam type_equ) {
        this.type_equ = type_equ;
    }

    public double getPrice_equ() {
        return price_equ;
    }

    public void setPrice_equ(double price_equ) {
        this.price_equ = price_equ;
    }

    public Installation getFk_codeInstallation() {
        return fk_codeInstallation;
    }

    public void setFk_codeInstallation(Installation fk_codeInstallation) {
        this.fk_codeInstallation = fk_codeInstallation;
    }

    public boolean isStatus_equ() {
        return status_equ;
    }

    public void setStatus_equ(boolean status_equ) {
        this.status_equ = status_equ;
    }
    
    

    
    
    
    
}
