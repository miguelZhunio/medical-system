package model.classes.associations;

import javax.imageio.ImageIO;
import model.classes.address.Country;
import model.classes.person.Person;

/**
 *
 * @author Zhunio
 */
public class CountryPerson {
    private int code_cop;
    private Person fk_idPerson_cop;
    private Country fk_codePerson_cop;
    private ImageIO photo_cop;

    public CountryPerson() {
        super();
    }

    public CountryPerson(Person fk_idPerson_cop, Country fk_codePerson_cop, ImageIO photo_cop) {
        this.fk_idPerson_cop = fk_idPerson_cop;
        this.fk_codePerson_cop = fk_codePerson_cop;
        this.photo_cop = photo_cop;
    }

    public int getCode_cop() {
        return code_cop;
    }

    public Person getFk_idPerson_cop() {
        return fk_idPerson_cop;
    }

    public void setFk_idPerson_cop(Person fk_idPerson_cop) {
        this.fk_idPerson_cop = fk_idPerson_cop;
    }

    public Country getFk_codePerson_cop() {
        return fk_codePerson_cop;
    }

    public void setFk_codePerson_cop(Country fk_codePerson_cop) {
        this.fk_codePerson_cop = fk_codePerson_cop;
    }

    public ImageIO getPhoto_cop() {
        return photo_cop;
    }

    public void setPhoto_cop(ImageIO photo_cop) {
        this.photo_cop = photo_cop;
    }
    

}
