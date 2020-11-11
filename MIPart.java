public abstract class MIPart {
    private double weight;    
    public MIPartType partType;
    protected MIType miType;
    

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public MIPart(double weight, MIPartType partType, MIType miType) {
        this.weight = weight;
        this.partType = partType;
        this.miType = miType;
    }
    
}
