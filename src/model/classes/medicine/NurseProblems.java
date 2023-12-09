package model.classes.medicine;
/**
 * @author Zhunio
 */
public class NurseProblems {
    private int code_nup;
    private String name_nup;
    private String type_nup;
    private boolean hereditary_nup;

    public NurseProblems() {
        
    }

    public NurseProblems(String name_nup, String type_nup, boolean hereditary_nup) {
        this.name_nup = name_nup;
        this.type_nup = type_nup;
        this.hereditary_nup = hereditary_nup;
    }

    public NurseProblems(int code_nup, String name_nup, String type_nup, boolean hereditary_nup) {
        this.code_nup = code_nup;
        this.name_nup = name_nup;
        this.type_nup = type_nup;
        this.hereditary_nup = hereditary_nup;
    }

    public int getCode_nup() {
        return code_nup;
    }

    public String getName_nup() {
        return name_nup;
    }

    public void setName_nup(String name_nup) {
        this.name_nup = name_nup;
    }

    public String getType_nup() {
        return type_nup;
    }

    public void setType_nup(String type_nup) {
        this.type_nup = type_nup;
    }

    public boolean isHereditary_nup() {
        return hereditary_nup;
    }

    public void setHereditary_nup(boolean hereditary_nup) {
        this.hereditary_nup = hereditary_nup;
    }
    

}
