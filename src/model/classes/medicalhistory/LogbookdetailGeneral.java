package model.classes.medicalhistory;

import java.time.LocalTime;
import java.util.Date;
import model.classes.person.Nurse;
import model.classes.person.Patient;

/**
 * @author Zhunio
 */
public class LogbookdetailGeneral {
    
    private int code_ldg;
    private Date date_ldg;
    private LocalTime startTime_ldg;
    private LocalTime endTime_ldg;
    private String patientsTreated_ldg;
    private String examsTaken_ldg;
    private String proceduresPerformed_ldg;
    private String observations_ldg;
    private int fk_codeHealthEmployer_ldg;

    public LogbookdetailGeneral() {
    }

    public LogbookdetailGeneral(Date date_ldg, LocalTime startTime_ldg, LocalTime endTime_ldg, String patientsTreated_ldg, String examsTaken_ldg, String proceduresPerformed_ldg, String observations_ldg, int fk_codeHealthEmployer_ldg) {
        this.date_ldg = date_ldg;
        this.startTime_ldg = startTime_ldg;
        this.endTime_ldg = endTime_ldg;
        this.patientsTreated_ldg = patientsTreated_ldg;
        this.examsTaken_ldg = examsTaken_ldg;
        this.proceduresPerformed_ldg = proceduresPerformed_ldg;
        this.observations_ldg = observations_ldg;
        this.fk_codeHealthEmployer_ldg = fk_codeHealthEmployer_ldg;
    }

    public LogbookdetailGeneral(int code_ldg, Date date_ldg, LocalTime startTime_ldg, LocalTime endTime_ldg, String patientsTreated_ldg, String examsTaken_ldg, String proceduresPerformed_ldg, String observations_ldg, int fk_codeHealthEmployer_ldg) {
        this.code_ldg = code_ldg;
        this.date_ldg = date_ldg;
        this.startTime_ldg = startTime_ldg;
        this.endTime_ldg = endTime_ldg;
        this.patientsTreated_ldg = patientsTreated_ldg;
        this.examsTaken_ldg = examsTaken_ldg;
        this.proceduresPerformed_ldg = proceduresPerformed_ldg;
        this.observations_ldg = observations_ldg;
        this.fk_codeHealthEmployer_ldg = fk_codeHealthEmployer_ldg;
    }

    public int getCode_ldg() {
        return code_ldg;
    }

    public Date getDate_ldg() {
        return date_ldg;
    }

    public void setDate_ldg(Date date_ldg) {
        this.date_ldg = date_ldg;
    }

    public LocalTime getStartTime_ldg() {
        return startTime_ldg;
    }

    public void setStartTime_ldg(LocalTime startTime_ldg) {
        this.startTime_ldg = startTime_ldg;
    }

    public LocalTime getEndTime_ldg() {
        return endTime_ldg;
    }

    public void setEndTime_ldg(LocalTime endTime_ldg) {
        this.endTime_ldg = endTime_ldg;
    }

    public String getPatientsTreated_ldg() {
        return patientsTreated_ldg;
    }

    public void setPatientsTreated_ldg(String patientsTreated_ldg) {
        this.patientsTreated_ldg = patientsTreated_ldg;
    }

    public String getExamsTaken_ldg() {
        return examsTaken_ldg;
    }

    public void setExamsTaken_ldg(String examsTaken_ldg) {
        this.examsTaken_ldg = examsTaken_ldg;
    }

    public String getProceduresPerformed_ldg() {
        return proceduresPerformed_ldg;
    }

    public void setProceduresPerformed_ldg(String proceduresPerformed_ldg) {
        this.proceduresPerformed_ldg = proceduresPerformed_ldg;
    }

    public String getObservations_ldg() {
        return observations_ldg;
    }

    public void setObservations_ldg(String observations_ldg) {
        this.observations_ldg = observations_ldg;
    }

    public int getFk_codeHealthEmployer_ldg() {
        return fk_codeHealthEmployer_ldg;
    }

    public void setFk_codeHealthEmployer_ldg(int fk_codeHealthEmployer_ldg) {
        this.fk_codeHealthEmployer_ldg = fk_codeHealthEmployer_ldg;
    }

}
