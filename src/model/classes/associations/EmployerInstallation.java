package model.classes.associations;

import java.util.Date;
import model.classes.department.Installation;
import model.classes.person.HealthEmployer;

/**
 * @author Zhunio
 */
public class EmployerInstallation {
    
    private int code_emi;
    private Date startDate_emi;
    private Date endDate_emi;
    private Installation fk_codeInstallation_emi;
    private int fk_codeHealthEmployer;
    private boolean status;

    public EmployerInstallation() {
        
    }

    public EmployerInstallation(Date startDate_emi, Date endDate_emi, Installation fk_codeInstallation_emi, int fk_codeHealthEmployer, boolean status) {
        this.startDate_emi = startDate_emi;
        this.endDate_emi = endDate_emi;
        this.fk_codeInstallation_emi = fk_codeInstallation_emi;
        this.fk_codeHealthEmployer = fk_codeHealthEmployer;
        this.status = status;
    }

    public EmployerInstallation(int code_emi, Date startDate_emi, Date endDate_emi, Installation fk_codeInstallation_emi, int fk_codeHealthEmployer, boolean status) {
        this.code_emi = code_emi;
        this.startDate_emi = startDate_emi;
        this.endDate_emi = endDate_emi;
        this.fk_codeInstallation_emi = fk_codeInstallation_emi;
        this.fk_codeHealthEmployer = fk_codeHealthEmployer;
        this.status = status;
    }

    public int getCode_emi() {
        return code_emi;
    }

    public Date getStartDate_emi() {
        return startDate_emi;
    }

    public void setStartDate_emi(Date startDate_emi) {
        this.startDate_emi = startDate_emi;
    }

    public Date getEndDate_emi() {
        return endDate_emi;
    }

    public void setEndDate_emi(Date endDate_emi) {
        this.endDate_emi = endDate_emi;
    }

    public Installation getFk_codeInstallation_emi() {
        return fk_codeInstallation_emi;
    }

    public void setFk_codeInstallation_emi(Installation fk_codeInstallation_emi) {
        this.fk_codeInstallation_emi = fk_codeInstallation_emi;
    }

    public int getFk_codeHealthEmployer() {
        return fk_codeHealthEmployer;
    }

    public void setFk_codeHealthEmployer(int fk_codeHealthEmployer) {
        this.fk_codeHealthEmployer = fk_codeHealthEmployer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

 
}
