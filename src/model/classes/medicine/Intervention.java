package model.classes.medicine;
/**
 * @author Zhunio
 */
public class Intervention {
    
    private int code_int;
    private String name_int;
    private int maxPopulation_int;
    private int minPopulation_int;

    public Intervention() {
    }

    public Intervention(String name_int, int maxPopulation_int, int minPopulation_int) {
        this.name_int = name_int;
        this.maxPopulation_int = maxPopulation_int;
        this.minPopulation_int = minPopulation_int;
    }

    public Intervention(int code_int, String name_int, int maxPopulation_int, int minPopulation_int) {
        this.code_int = code_int;
        this.name_int = name_int;
        this.maxPopulation_int = maxPopulation_int;
        this.minPopulation_int = minPopulation_int;
    }

    public int getCode_int() {
        return code_int;
    }

    public String getName_int() {
        return name_int;
    }

    public void setName_int(String name_int) {
        this.name_int = name_int;
    }

    public int getMaxPopulation_int() {
        return maxPopulation_int;
    }

    public void setMaxPopulation_int(int maxPopulation_int) {
        this.maxPopulation_int = maxPopulation_int;
    }

    public int getMinPopulation_int() {
        return minPopulation_int;
    }

    public void setMinPopulation_int(int minPopulation_int) {
        this.minPopulation_int = minPopulation_int;
    }

    
}
