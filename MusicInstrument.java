import java.util.ArrayList;
import java.util.Collections;

import classes.*;

class MusicInstrument implements Playable {

    private MIType type;

    ArrayList<MIPart> parts;

    public void addPart(MIPart part) {
        parts.add(part);
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

    public static void main(String[] args) {
        MIFactory factory = new MIFactory();
        MusicInstrument mi = factory.createMI(MIType.STRING);
        mi.setType(MIType.STRING);
        System.out.println(mi.type());
        mi.play();
    }
}