package model.classes.medicine;

/**
 * @author Zhunio
 */
public class Allergies {

    private int code_all;
    private String name_all;
    private String type_all;
    private boolean hereditary_all;

    public Allergies() {
        
    }

    public Allergies(String name_all, String type_all, boolean hereditary_all) {
        this.name_all = name_all;
        this.type_all = type_all;
        this.hereditary_all = hereditary_all;
    }

    public Allergies(int code_all, String name_all, String type_all, boolean hereditary_all) {
        this.code_all = code_all;
        this.name_all = name_all;
        this.type_all = type_all;
        this.hereditary_all = hereditary_all;
    }

    public int getCode_all() {
        return code_all;
    }

    public String getName_all() {
        return name_all;
    }

    public void setName_all(String name_all) {
        this.name_all = name_all;
    }

    public String getType_all() {
        return type_all;
    }

    public void setType_all(String type_all) {
        this.type_all = type_all;
    }

    public boolean isHereditary_all() {
        return hereditary_all;
    }

    public void setHereditary_all(boolean hereditary_all) {
        this.hereditary_all = hereditary_all;
    }
    
}
