package model.classes.person;

import java.util.Date;
import model.classes.department.Installation;
import model.classes.enums.CivilStatus;
import model.classes.enums.Gender;

/**
 *
 * @author Zhunio
 */
public class Patient extends Person{
    private int code_pat;
    private Person fk_emergencyContact_pat;
    private String observations_pat;
    private Installation installation_pat;

    public Patient() {
        super();
    }

    public Patient(Person fk_emergencyContact_pat, String observations_pat, Installation installation_pat, String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        super(id_per, firstName_per, secondName_per, lastName_per, mothersLastName_per, phone_per, reservationPhone_per, gender_per, email_per, birthDate_per, civilStatus_per);
        this.fk_emergencyContact_pat = fk_emergencyContact_pat;
        this.observations_pat = observations_pat;
        this.installation_pat = installation_pat;
    }
    
    public int getCode_pat() {
        return code_pat;
    }

    public Person getFk_emergencyContact_pat() {
        return fk_emergencyContact_pat;
    }

    public void setFk_emergencyContact_pat(Person fk_emergencyContact_pat) {
        this.fk_emergencyContact_pat = fk_emergencyContact_pat;
    }

    public String getObservations_pat() {
        return observations_pat;
    }

    public void setObservations_pat(String observations_pat) {
        this.observations_pat = observations_pat;
    }

    public Installation getInstallation_pat() {
        return installation_pat;
    }

    public void setInstallation_pat(Installation installation_pat) {
        this.installation_pat = installation_pat;
    }
     
}
