package model.classes.address;

import model.classes.address.City;

/**
 *
 * @author Zhunio
 */
public class Neighborhood {
    private int code_bar;
    private String name_bar;
    private City fk_codeCity_bar;

    public Neighborhood() {
    }

    public Neighborhood(String name_bar, City fk_codeCity_bar) {
        this.name_bar = name_bar;
        this.fk_codeCity_bar = fk_codeCity_bar;
    }

    public int getCode_bar() {
        return code_bar;
    }

    public String getName_bar() {
        return name_bar;
    }

    public void setName_bar(String name_bar) {
        this.name_bar = name_bar;
    }

    public City getFk_codeCity_bar() {
        return fk_codeCity_bar;
    }

    public void setFk_codeCity_bar(City fk_codeCity_bar) {
        this.fk_codeCity_bar = fk_codeCity_bar;
    }
     
    
}
