package model.classes.medicine;
/**
 * @author Zhunio
 */
public class ChronicDiseases {
    
    private int code_chr;
    private String name_chr;
    private String type_chr;
    private boolean hereditary_chr;

    public ChronicDiseases() {
        
    }

    public ChronicDiseases(String name_chr, String type_chr, boolean hereditary_chr) {
        this.name_chr = name_chr;
        this.type_chr = type_chr;
        this.hereditary_chr = hereditary_chr;
    }

    public ChronicDiseases(int code_chr, String name_chr, String type_chr, boolean hereditary_chr) {
        this.code_chr = code_chr;
        this.name_chr = name_chr;
        this.type_chr = type_chr;
        this.hereditary_chr = hereditary_chr;
    }

    public int getCode_chr() {
        return code_chr;
    }

    public String getName_chr() {
        return name_chr;
    }

    public void setName_chr(String name_chr) {
        this.name_chr = name_chr;
    }

    public String getType_chr() {
        return type_chr;
    }

    public void setType_chr(String type_chr) {
        this.type_chr = type_chr;
    }

    public boolean isHereditary_chr() {
        return hereditary_chr;
    }

    public void setHereditary_chr(boolean hereditary_chr) {
        this.hereditary_chr = hereditary_chr;
    }
 
}
