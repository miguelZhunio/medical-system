package model.classes.address;

import model.classes.person.Person;

/**
 * @author Zhunio
 */
public class Address {
    private int id_adr;
    private String primaryStreet_adr;
    private String secondaryStreet_adr;
    private boolean status_adr;
    private Person fk_idPer_adr;
    private Neighborhood fk_codeNeighborhood_adr;

    public Address() {
    }

    public Address(int id_adr, String primaryStreet_adr, String secondaryStreet_adr, boolean status_adr, Person fk_idPer_adr, Neighborhood fk_codeNeighborhood_adr) {
        this.id_adr = id_adr;
        this.primaryStreet_adr = primaryStreet_adr;
        this.secondaryStreet_adr = secondaryStreet_adr;
        this.status_adr = status_adr;
        this.fk_idPer_adr = fk_idPer_adr;
        this.fk_codeNeighborhood_adr = fk_codeNeighborhood_adr;
    }

    public int getId_adr() {
        return id_adr;
    }

    public String getPrimaryStreet_adr() {
        return primaryStreet_adr;
    }

    public void setPrimaryStreet_adr(String primaryStreet_adr) {
        this.primaryStreet_adr = primaryStreet_adr;
    }

    public String getSecondaryStreet_adr() {
        return secondaryStreet_adr;
    }

    public void setSecondaryStreet_adr(String secondaryStreet_adr) {
        this.secondaryStreet_adr = secondaryStreet_adr;
    }

    public boolean isStatus_adr() {
        return status_adr;
    }

    public void setStatus_adr(boolean status_adr) {
        this.status_adr = status_adr;
    }

    public Person getFk_idPer_adr() {
        return fk_idPer_adr;
    }

    public void setFk_idPer_adr(Person fk_idPer_adr) {
        this.fk_idPer_adr = fk_idPer_adr;
    }

    public Neighborhood getFk_codeNeighborhood_adr() {
        return fk_codeNeighborhood_adr;
    }

    public void setFk_codeNeighborhood_adr(Neighborhood fk_codeNeighborhood_adr) {
        this.fk_codeNeighborhood_adr = fk_codeNeighborhood_adr;
    }
     
}
