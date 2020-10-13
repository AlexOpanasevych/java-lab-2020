package labs2020Java.lab1;

import java.util.List;

class MusicInstrument implements Playable {

    private MIType type;

    List<MIPart> parts;

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

    public static void main(String[] args) {
        MusicInstrument mi = new MusicInstrument();
        mi.setType(MIType.STRING);
        mi.addPart(new Body(3)).addPart(new Tune(1.5));
        mi.tune();
        mi.play();
    }
}