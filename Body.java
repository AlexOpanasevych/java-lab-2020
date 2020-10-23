public class Body extends MIPart {
    
    Body(double weight) {
        super(weight, MIPartType.WOOD);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "body";
    }

}
