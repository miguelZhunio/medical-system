package model.classes.medicine;
/**
 * @author Zhunio
 */
public class ProblemSolutionsNurse {
    private int code_psn;
    private String result_psn;
    private String strategy_psn;
    private NurseProblems fk_codeNurseProblems_psn;

    public ProblemSolutionsNurse() {
        
    }

    public ProblemSolutionsNurse(String result_psn, String strategy_psn, NurseProblems fk_codeNurseProblems_psn) {
        this.result_psn = result_psn;
        this.strategy_psn = strategy_psn;
        this.fk_codeNurseProblems_psn = fk_codeNurseProblems_psn;
    }

    public ProblemSolutionsNurse(int code_psn, String result_psn, String strategy_psn, NurseProblems fk_codeNurseProblems_psn) {
        this.code_psn = code_psn;
        this.result_psn = result_psn;
        this.strategy_psn = strategy_psn;
        this.fk_codeNurseProblems_psn = fk_codeNurseProblems_psn;
    }

    public int getCode_psn() {
        return code_psn;
    }

    public String getResult_psn() {
        return result_psn;
    }

    public void setResult_psn(String result_psn) {
        this.result_psn = result_psn;
    }

    public String getStrategy_psn() {
        return strategy_psn;
    }

    public void setStrategy_psn(String strategy_psn) {
        this.strategy_psn = strategy_psn;
    }

    public NurseProblems getFk_codeNurseProblems_psn() {
        return fk_codeNurseProblems_psn;
    }

    public void setFk_codeNurseProblems_psn(NurseProblems fk_codeNurseProblems_psn) {
        this.fk_codeNurseProblems_psn = fk_codeNurseProblems_psn;
    }
    
}
