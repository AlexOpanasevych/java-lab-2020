public abstract class MIPart {
    private double weight;    
    public MIPartType type;
    

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public MIPart(double weight, MIPartType type) {
        this.weight = weight;
        this.type = type;
    }
    
}
