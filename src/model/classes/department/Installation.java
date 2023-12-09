package model.classes.department;

import model.classes.address.Address;

/**
 * @author Zhunio
 */
public class Installation {
    private int code_ins;
    private Address fk_codeAddress_ins;
    private String name_ins;
    private boolean status_ins;
    private Department fk_codeDepartment_ins;

    public Installation() {
    }
    

    public Installation(int code_ins, Address fk_codeAddress_ins, String name_ins, boolean status_ins, Department fk_codeDepartment_ins) {
        this.code_ins = code_ins;
        this.fk_codeAddress_ins = fk_codeAddress_ins;
        this.name_ins = name_ins;
        this.status_ins = status_ins;
        this.fk_codeDepartment_ins = fk_codeDepartment_ins;
    }

    public int getCode_ins() {
        return code_ins;
    }

    public Address getFk_codeAddress_ins() {
        return fk_codeAddress_ins;
    }

    public void setFk_codeAddress_ins(Address fk_codeAddress_ins) {
        this.fk_codeAddress_ins = fk_codeAddress_ins;
    }

    public String getName_ins() {
        return name_ins;
    }

    public void setName_ins(String name_ins) {
        this.name_ins = name_ins;
    }

    public boolean isStatus_ins() {
        return status_ins;
    }

    public void setStatus_ins(boolean status_ins) {
        this.status_ins = status_ins;
    }

    public Department getFk_codeDepartment_ins() {
        return fk_codeDepartment_ins;
    }

    public void setFk_codeDepartment_ins(Department fk_codeDepartment_ins) {
        this.fk_codeDepartment_ins = fk_codeDepartment_ins;
    }
    
    
}
