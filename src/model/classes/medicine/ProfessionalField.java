package model.classes.medicine;

/**
 * @author Zhunio
 */
public class ProfessionalField {
    private int code_pro;
    private String name_pro;

    public ProfessionalField() {
        
    }

    public ProfessionalField(String name_pro) {
        this.name_pro = name_pro;
    }

    public ProfessionalField(int code_pro, String name_pro) {
        this.code_pro = code_pro;
        this.name_pro = name_pro;
    }

    public int getCode_pro() {
        return code_pro;
    }

    public void setCode_pro(int code_pro) {
        this.code_pro = code_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }
    
}
