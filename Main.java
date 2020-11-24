import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Please input keyboard parts weights (delimiter ',')");
        Scanner input = new Scanner(System.in);
        java.lang.String[] in = input.nextLine().split(",");
        input.close();

        MusicInstrument keyboard = new KeyboardInstrument();
        keyboard.setType(MIType.KEYBOARD);
        keyboard.addPart(new Body(Integer.parseInt(in[0]))).addPart(new Tune(Integer.parseInt(in[1])));

        Iterator<MIPart> iterator = keyboard.getParts().listIterator();
        System.out.println("All possible types of music instruments:" + MIType.allTypes());
        while (iterator.hasNext()) {
            MIPart part = iterator.next();
            System.out.println(new StringBuilder("Type of part: ").append(part.partType).append(" weight: ").append(part.getWeight()).toString());
        }
        keyboard.tune();
        keyboard.play();

        MusicInstrument guitar = new StringMusicInstrument();
        guitar.addPart(new GuitarString(1)).addPart(new GuitarString(1));
        iterator = guitar.getParts().listIterator();
        while (iterator.hasNext()) {
            MIPart part = iterator.next();
            System.out.println("Type of part: " + part.partType + " weight: " + part.getWeight());
        }
    }
}
