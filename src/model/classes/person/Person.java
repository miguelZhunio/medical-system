package model.classes.person;

import java.util.Date;
import model.classes.enums.CivilStatus;
import model.classes.enums.Gender;

/**
 *
 * @author Zhunio
 */
abstract public class Person {
    
    private String id_per;
    private String firstName_per;
    private String secondName_per;
    private String lastName_per;
    private String mothersLastName_per;
    private String phone_per;
    private String reservationPhone_per;
    private Gender gender_per;
    private String email_per;
    private Date birthDate_per;
    private CivilStatus civilStatus_per;
    private boolean status;

    public Person() {
        
    }

    public Person(String id_per, String firstName_per, String secondName_per, String lastName_per, String mothersLastName_per, String phone_per, String reservationPhone_per, Gender gender_per, String email_per, Date birthDate_per, CivilStatus civilStatus_per) {
        this.id_per = id_per;
        this.firstName_per = firstName_per;
        this.secondName_per = secondName_per;
        this.lastName_per = lastName_per;
        this.mothersLastName_per = mothersLastName_per;
        this.phone_per = phone_per;
        this.reservationPhone_per = reservationPhone_per;
        this.gender_per = gender_per;
        this.email_per = email_per;
        this.birthDate_per = birthDate_per;
        this.civilStatus_per = civilStatus_per;
        this.status = true;
    }

    public String getId_per() {
        return id_per;
    }

    public void setId_per(String id_per) {
        this.id_per = id_per;
    }

    public String getFirstName_per() {
        return firstName_per;
    }

    public void setFirstName_per(String firstName_per) {
        this.firstName_per = firstName_per;
    }

    public String getSecondName_per() {
        return secondName_per;
    }

    public void setSecondName_per(String secondName_per) {
        this.secondName_per = secondName_per;
    }

    public String getLastName_per() {
        return lastName_per;
    }

    public void setLastName_per(String lastName_per) {
        this.lastName_per = lastName_per;
    }

    public String getMothersLastName_per() {
        return mothersLastName_per;
    }

    public void setMothersLastName_per(String mothersLastName_per) {
        this.mothersLastName_per = mothersLastName_per;
    }

    public String getPhone_per() {
        return phone_per;
    }

    public void setPhone_per(String phone_per) {
        this.phone_per = phone_per;
    }

    public String getReservationPhone_per() {
        return reservationPhone_per;
    }

    public void setReservationPhone_per(String reservationPhone_per) {
        this.reservationPhone_per = reservationPhone_per;
    }

    public Gender getGender_per() {
        return gender_per;
    }

    public void setGender_per(Gender gender_per) {
        this.gender_per = gender_per;
    }

    public String getEmail_per() {
        return email_per;
    }

    public void setEmail_per(String email_per) {
        this.email_per = email_per;
    }

    public Date getBirthDate_per() {
        return birthDate_per;
    }

    public void setBirthDate_per(Date birthDate_per) {
        this.birthDate_per = birthDate_per;
    }

    public CivilStatus getCivilStatus_per() {
        return civilStatus_per;
    }

    public void setCivilStatus_per(CivilStatus civilStatus_per) {
        this.civilStatus_per = civilStatus_per;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
