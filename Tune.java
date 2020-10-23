/**
 * Tune
 */
public class Tune extends MIPart{

    public Tune(double weight) {
        super(weight, MIPartType.METAL);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "tune";
    }
}