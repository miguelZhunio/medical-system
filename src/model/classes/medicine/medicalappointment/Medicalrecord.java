package model.classes.medicine.medicalappointment;
/**
 * @author Zhunio
 */
public class Medicalrecord {
    
    private int code_mer;
    private String description_mer;
    private String observations_mer;
    private MedicalAppointment fk_codeMedicalappointment_mer;

    public Medicalrecord() {
    }

    public Medicalrecord(String description_mer, String observations_mer, MedicalAppointment fk_codeMedicalappointment_mer) {
        this.description_mer = description_mer;
        this.observations_mer = observations_mer;
        this.fk_codeMedicalappointment_mer = fk_codeMedicalappointment_mer;
    }

    public Medicalrecord(int code_mer, String description_mer, String observations_mer, MedicalAppointment fk_codeMedicalappointment_mer) {
        this.code_mer = code_mer;
        this.description_mer = description_mer;
        this.observations_mer = observations_mer;
        this.fk_codeMedicalappointment_mer = fk_codeMedicalappointment_mer;
    }
  
    public int getCode_mer() {
        return code_mer;
    }

    public String getDescription_mer() {
        return description_mer;
    }

    public void setDescription_mer(String description_mer) {
        this.description_mer = description_mer;
    }

    public String getObservations_mer() {
        return observations_mer;
    }

    public void setObservations_mer(String observations_mer) {
        this.observations_mer = observations_mer;
    }

    public MedicalAppointment getFk_codeMedicalappointment_mer() {
        return fk_codeMedicalappointment_mer;
    }

    public void setFk_codeMedicalappointment_mer(MedicalAppointment fk_codeMedicalappointment_mer) {
        this.fk_codeMedicalappointment_mer = fk_codeMedicalappointment_mer;
    }
   
    
}
