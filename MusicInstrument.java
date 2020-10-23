import java.util.ArrayList;

public class MusicInstrument implements Playable {

    MusicInstrument(){
        totalWeight = 0;
        parts = new ArrayList();      
    }

    private MIType type;

    ArrayList<MIPart> parts;

    private double totalWeight;

    public double getTotalWeight() {
        return totalWeight;
    }

    public MusicInstrument addPart(MIPart part) {
        parts.add(part);
        totalWeight += part.getWeight();
        return this;
    }

    public void setType(MIType type) {
        this.type = type;
    }

    public MIType type() {
        return this.type;
    }

    public void play() {
        System.out.println("i'm playing");
    }

    public void tune() {
        System.out.println("tune now");
    }
}