package model.classes.address;

/**
 *
 * @author Zhunio
 */
public class Province {
    private int code_pro;
    private String name_pro;
    private Country fk_codeCountry_pro;

    public Province() {
    }

    public Province(String name_pro, Country fk_codeCountry_pro) {
        this.name_pro = name_pro;
        this.fk_codeCountry_pro = fk_codeCountry_pro;
    }

    public int getCode_pro() {
        return code_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public Country getFk_codeCountry_pro() {
        return fk_codeCountry_pro;
    }

    public void setFk_codeCountry_pro(Country fk_codeCountry_pro) {
        this.fk_codeCountry_pro = fk_codeCountry_pro;
    } 
    
}
