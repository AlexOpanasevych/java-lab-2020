import java.util.ArrayList;
import java.util.List;

public class MusicInstrument implements Playable {

    MusicInstrument(){
        totalWeight = 0;
        parts = new ArrayList<>();      
    }

    MusicInstrument(ArrayList<MIPart> parts){
        totalWeight = 0;
        parts = new ArrayList<>(parts);
    }

    protected MIType type;

    private Note note;

    private ArrayList<MIPart> parts;

    private double totalWeight;

    public double getTotalWeight() {
        return totalWeight;
    }

    public MusicInstrument addPart(MIPart part) {
        try {
            if(this.type.equals(part.miType))
                throw new IncompatibleMIPartTypeException();
            parts.add(part);
            totalWeight += part.getWeight();
            return this;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    public void setType(MIType type) {
        this.type = type;
    }

    public MIType type() {
        return this.type;
    }
    @Override
    public void play() {
        System.out.println("i'm playing");
    }

    public void tune() {
        System.out.println("tune now");
    }

    public List<MIPart> getParts() {
        return parts;
    }
}