package model.classes.medicalhistory;

import java.time.LocalTime;
import java.util.Date;
import model.classes.person.Nurse;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class LogbookdetailNurse {
    
    private int code_ldn;
    private Date date_ldn;
    private LocalTime startTime_ldn;
    private LocalTime endTime_ldn;
    private Patient fk_codePatient_ldn;
    private String evolution_ldn;
    private String followUp_ldn;
    private String urgency_ldn;
    private String complication_ldn;
    private Nurse fk_codeNurse_ldn;

    public LogbookdetailNurse() {
    }

    public LogbookdetailNurse(Date date_ldn, LocalTime startTime_ldn, LocalTime endTime_ldn, Patient fk_codePatient_ldn, String evolution_ldn, String followUp_ldn, String urgency_ldn, String complication_ldn, Nurse fk_codeNurse_ldn) {
        this.date_ldn = date_ldn;
        this.startTime_ldn = startTime_ldn;
        this.endTime_ldn = endTime_ldn;
        this.fk_codePatient_ldn = fk_codePatient_ldn;
        this.evolution_ldn = evolution_ldn;
        this.followUp_ldn = followUp_ldn;
        this.urgency_ldn = urgency_ldn;
        this.complication_ldn = complication_ldn;
        this.fk_codeNurse_ldn = fk_codeNurse_ldn;
    }

    public LogbookdetailNurse(int code_ldn, Date date_ldn, LocalTime startTime_ldn, LocalTime endTime_ldn, Patient fk_codePatient_ldn, String evolution_ldn, String followUp_ldn, String urgency_ldn, String complication_ldn, Nurse fk_codeNurse_ldn) {
        this.code_ldn = code_ldn;
        this.date_ldn = date_ldn;
        this.startTime_ldn = startTime_ldn;
        this.endTime_ldn = endTime_ldn;
        this.fk_codePatient_ldn = fk_codePatient_ldn;
        this.evolution_ldn = evolution_ldn;
        this.followUp_ldn = followUp_ldn;
        this.urgency_ldn = urgency_ldn;
        this.complication_ldn = complication_ldn;
        this.fk_codeNurse_ldn = fk_codeNurse_ldn;
    }

    public int getCode_ldn() {
        return code_ldn;
    }

    public Date getDate_ldn() {
        return date_ldn;
    }

    public void setDate_ldn(Date date_ldn) {
        this.date_ldn = date_ldn;
    }

    public LocalTime getStartTime_ldn() {
        return startTime_ldn;
    }

    public void setStartTime_ldn(LocalTime startTime_ldn) {
        this.startTime_ldn = startTime_ldn;
    }

    public LocalTime getEndTime_ldn() {
        return endTime_ldn;
    }

    public void setEndTime_ldn(LocalTime endTime_ldn) {
        this.endTime_ldn = endTime_ldn;
    }

    public Patient getFk_codePatient_ldn() {
        return fk_codePatient_ldn;
    }

    public void setFk_codePatient_ldn(Patient fk_codePatient_ldn) {
        this.fk_codePatient_ldn = fk_codePatient_ldn;
    }

    public String getEvolution_ldn() {
        return evolution_ldn;
    }

    public void setEvolution_ldn(String evolution_ldn) {
        this.evolution_ldn = evolution_ldn;
    }

    public String getFollowUp_ldn() {
        return followUp_ldn;
    }

    public void setFollowUp_ldn(String followUp_ldn) {
        this.followUp_ldn = followUp_ldn;
    }

    public String getUrgency_ldn() {
        return urgency_ldn;
    }

    public void setUrgency_ldn(String urgency_ldn) {
        this.urgency_ldn = urgency_ldn;
    }

    public String getComplication_ldn() {
        return complication_ldn;
    }

    public void setComplication_ldn(String complication_ldn) {
        this.complication_ldn = complication_ldn;
    }

    public Nurse getFk_codeNurse_ldn() {
        return fk_codeNurse_ldn;
    }

    public void setFk_codeNurse_ldn(Nurse fk_codeNurse_ldn) {
        this.fk_codeNurse_ldn = fk_codeNurse_ldn;
    }
    
    
}
