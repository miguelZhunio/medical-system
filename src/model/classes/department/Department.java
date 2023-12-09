package model.classes.department;

import model.classes.person.HealthEmployer;

/**
 *
 * @author Zhunio
 */
public class Department {
    private int code_dep;
    private String name_dep;
    private HealthEmployer fk_codePresident_dep;
    private String desciption_dep;  
    private boolean status_dep;
    private boolean heated_dep;
    private int ability_dep;

    public Department() {
        
    }

    public Department(int code_dep, String name_dep, HealthEmployer fk_codePresident_dep, String desciption_dep, boolean status_dep, boolean heated_dep, int ability_dep) {
        this.code_dep = code_dep;
        this.name_dep = name_dep;
        this.fk_codePresident_dep = fk_codePresident_dep;
        this.desciption_dep = desciption_dep;
        this.status_dep = status_dep;
        this.heated_dep = heated_dep;
        this.ability_dep = ability_dep;
    }

    public int getCode_dep() {
        return code_dep;
    }

    public String getName_dep() {
        return name_dep;
    }

    public void setName_dep(String name_dep) {
        this.name_dep = name_dep;
    }

    public HealthEmployer getFk_codePresident_dep() {
        return fk_codePresident_dep;
    }

    public void setFk_codePresident_dep(HealthEmployer fk_codePresident_dep) {
        this.fk_codePresident_dep = fk_codePresident_dep;
    }

    public String getDesciption_dep() {
        return desciption_dep;
    }

    public void setDesciption_dep(String desciption_dep) {
        this.desciption_dep = desciption_dep;
    }

    public boolean isStatus_dep() {
        return status_dep;
    }

    public void setStatus_dep(boolean status_dep) {
        this.status_dep = status_dep;
    }

    public boolean isHeated_dep() {
        return heated_dep;
    }

    public void setHeated_dep(boolean heated_dep) {
        this.heated_dep = heated_dep;
    }

    public int getAbility_dep() {
        return ability_dep;
    }

    public void setAbility_dep(int ability_dep) {
        this.ability_dep = ability_dep;
    }

    
}
