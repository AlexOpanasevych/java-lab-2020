public class Body extends MIPart {
    
    Body(double weight) {
        super(weight, MIPartType.WOOD, MIType.KEYBOARD);
        setWeight(weight);
    }

    @Override
    public java.lang.String toString() {
        return "body";
    }

}
