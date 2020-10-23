import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        MusicInstrument keyboard = new KeyboardInstrument();
        keyboard.setType(MIType.KEYBOARD);
        keyboard.addPart(new Body(3)).addPart(new Tune(1.5));

        Iterator<MIPart> iterator = keyboard.parts.listIterator();
        while (iterator.hasNext()) {
            MIPart part = iterator.next();
            System.out.println("Type of part: " + part.type.toString() + " weight: " + part.getWeight());
        }
        keyboard.tune();
        keyboard.play();
    }
}
