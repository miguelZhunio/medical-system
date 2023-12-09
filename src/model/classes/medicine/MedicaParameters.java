package model.classes.medicine;

/**
 *
 * @author Zhunio
 */
public class MedicaParameters {
    
    private int code_par;
    private String name_par;
    private String unit_par;
    private String type_par;

    public MedicaParameters() {
    }

    public MedicaParameters(String name_par, String unit_par, String type_par) {
        this.name_par = name_par;
        this.unit_par = unit_par;
        this.type_par = type_par;
    }

    public MedicaParameters(int code_par, String name_par, String unit_par, String type_par) {
        this.code_par = code_par;
        this.name_par = name_par;
        this.unit_par = unit_par;
        this.type_par = type_par;
    }

    public int getCode_par() {
        return code_par;
    }

    public String getName_par() {
        return name_par;
    }

    public void setName_par(String name_par) {
        this.name_par = name_par;
    }

    public String getUnit_par() {
        return unit_par;
    }

    public void setUnit_par(String unit_par) {
        this.unit_par = unit_par;
    }

    public String getType_par() {
        return type_par;
    }

    public void setType_par(String type_par) {
        this.type_par = type_par;
    }
    
    
}
