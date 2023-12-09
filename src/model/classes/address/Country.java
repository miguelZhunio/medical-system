package model.classes.address;
/**
 * @author Zhunio
 */
public class Country {
    private int code_cou;
    private String name_cou;
    private String typePhoto_cou;

    public Country() {
        
    }
    

    public Country(String name_cou, String typePhoto_cou) {
        this.name_cou = name_cou;
        this.typePhoto_cou = typePhoto_cou;
    }

    public int getCode_cou() {
        return code_cou;
    }

    public String getName_cou() {
        return name_cou;
    }

    public void setName_cou(String name_cou) {
        this.name_cou = name_cou;
    }

    public String getTypePhoto_cou() {
        return typePhoto_cou;
    }

    public void setTypePhoto_cou(String typePhoto_cou) {
        this.typePhoto_cou = typePhoto_cou;
    }  
    
}
