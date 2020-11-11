/**
 * Tune
 */
public class Tune extends MIPart{

    public Tune(double weight) {
        super(weight, MIPartType.METAL, MIType.KEYBOARD);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "tune";
    }
}