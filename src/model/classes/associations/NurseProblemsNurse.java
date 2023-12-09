package model.classes.associations;

import model.classes.medicine.ProblemSolutionsNurse;
import model.classes.person.Nurse;

/**
 * @author Zhunio
 */
public class NurseProblemsNurse {
    private int code_npn;
    private ProblemSolutionsNurse fk_codeProblemSolutionsNurse_npn;
    private Nurse fk_codeNurse_npn;

    public NurseProblemsNurse() {     
    }

    public NurseProblemsNurse(ProblemSolutionsNurse fk_codeProblemSolutionsNurse_npn, Nurse fk_codeNurse_npn) {
        this.fk_codeProblemSolutionsNurse_npn = fk_codeProblemSolutionsNurse_npn;
        this.fk_codeNurse_npn = fk_codeNurse_npn;
    }

    public NurseProblemsNurse(int code_npn, ProblemSolutionsNurse fk_codeProblemSolutionsNurse_npn, Nurse fk_codeNurse_npn) {
        this.code_npn = code_npn;
        this.fk_codeProblemSolutionsNurse_npn = fk_codeProblemSolutionsNurse_npn;
        this.fk_codeNurse_npn = fk_codeNurse_npn;
    }

    public int getCode_npn() {
        return code_npn;
    }

    public ProblemSolutionsNurse getFk_codeProblemSolutionsNurse_npn() {
        return fk_codeProblemSolutionsNurse_npn;
    }

    public void setFk_codeProblemSolutionsNurse_npn(ProblemSolutionsNurse fk_codeProblemSolutionsNurse_npn) {
        this.fk_codeProblemSolutionsNurse_npn = fk_codeProblemSolutionsNurse_npn;
    }

    public Nurse getFk_codeNurse_npn() {
        return fk_codeNurse_npn;
    }

    public void setFk_codeNurse_npn(Nurse fk_codeNurse_npn) {
        this.fk_codeNurse_npn = fk_codeNurse_npn;
    }
  
}
