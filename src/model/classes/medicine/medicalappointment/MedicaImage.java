package model.classes.medicine.medicalappointment;

import model.classes.person.Radiologist;
import java.util.Date;
import javax.imageio.ImageIO;
import model.classes.medicine.medicament.Prescription;

/**
 * @author Zhunio
 */
public class MedicaImage {
    private int code_ima;
    private ImageIO image_ima;
    private Date resultDate_img;
    private String observations_ima;
    private Prescription fk_codePrescription_ima;
    private Radiologist fk_codeRadiologist;

    public MedicaImage() {
    }

    public MedicaImage(ImageIO image_ima, Date resultDate_img, String observations_ima, Prescription fk_codePrescription_ima, Radiologist fk_codeRadiologist) {
        this.image_ima = image_ima;
        this.resultDate_img = resultDate_img;
        this.observations_ima = observations_ima;
        this.fk_codePrescription_ima = fk_codePrescription_ima;
        this.fk_codeRadiologist = fk_codeRadiologist;
    }

    public MedicaImage(int code_ima, ImageIO image_ima, Date resultDate_img, String observations_ima, Prescription fk_codePrescription_ima, Radiologist fk_codeRadiologist) {
        this.code_ima = code_ima;
        this.image_ima = image_ima;
        this.resultDate_img = resultDate_img;
        this.observations_ima = observations_ima;
        this.fk_codePrescription_ima = fk_codePrescription_ima;
        this.fk_codeRadiologist = fk_codeRadiologist;
    }

    public int getCode_ima() {
        return code_ima;
    }


    public ImageIO getImage_ima() {
        return image_ima;
    }

    public void setImage_ima(ImageIO image_ima) {
        this.image_ima = image_ima;
    }

    public Date getResultDate_img() {
        return resultDate_img;
    }

    public void setResultDate_img(Date resultDate_img) {
        this.resultDate_img = resultDate_img;
    }

    public String getObservations_ima() {
        return observations_ima;
    }

    public void setObservations_ima(String observations_ima) {
        this.observations_ima = observations_ima;
    }

    public Prescription getFk_codePrescription_ima() {
        return fk_codePrescription_ima;
    }

    public void setFk_codePrescription_ima(Prescription fk_codePrescription_ima) {
        this.fk_codePrescription_ima = fk_codePrescription_ima;
    }

    public Radiologist getFk_codeRadiologist() {
        return fk_codeRadiologist;
    }

    public void setFk_codeRadiologist(Radiologist fk_codeRadiologist) {
        this.fk_codeRadiologist = fk_codeRadiologist;
    }

    
}
