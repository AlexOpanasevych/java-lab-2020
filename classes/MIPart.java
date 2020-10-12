package classes;

import java.util.ArrayList;
import java.util.List;

public class MIPart {
    private double weight;
    private ArrayList<Double> size;

    MIPartType type;
    

    public double getWeight() {
        return weight;
    }

    public List<Double> getSize() {
        return size;
    }

    public void setSize(ArrayList<Double> size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
