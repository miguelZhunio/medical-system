package model.classes.medicine.medicament;

import java.util.Date;

/**
 * @author Zhunio
 */
public class Provider {
    private int cod_pro;
    private Date deadline_pro;
    private String name_pro;
    private String contact_pro;

    public Provider() {
    }

    public Provider(Date deadline_pro, String name_pro, String contact_pro) {
        this.deadline_pro = deadline_pro;
        this.name_pro = name_pro;
        this.contact_pro = contact_pro;
    }

    public Provider(int cod_pro, Date deadline_pro, String name_pro, String contact_pro) {
        this.cod_pro = cod_pro;
        this.deadline_pro = deadline_pro;
        this.name_pro = name_pro;
        this.contact_pro = contact_pro;
    }

    public int getCod_pro() {
        return cod_pro;
    }

    public Date getDeadline_pro() {
        return deadline_pro;
    }

    public void setDeadline_pro(Date deadline_pro) {
        this.deadline_pro = deadline_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public String getContact_pro() {
        return contact_pro;
    }

    public void setContact_pro(String contact_pro) {
        this.contact_pro = contact_pro;
    }
    
  
    
}
