package model.classes.address;
/** 
 * @author Zhunio
 */
public class City {
    
    private int code_cit;
    private String name_cit;
    private Province fk_codeProvince_cit;

    public City() {
        
    }

    public City(String name_cit, Province fk_codeProvince_cit) {
        this.name_cit = name_cit;
        this.fk_codeProvince_cit = fk_codeProvince_cit;
    }

    public int getCode_cit() {
        return code_cit;
    }

    public String getName_cit() {
        return name_cit;
    }

    public void setName_cit(String name_cit) {
        this.name_cit = name_cit;
    }

    public Province getFk_province_cit() {
        return fk_codeProvince_cit;
    }

    public void setFk_province_cit(Province fk_codeProvince_cit) {
        this.fk_codeProvince_cit = fk_codeProvince_cit;
    }
    
}
