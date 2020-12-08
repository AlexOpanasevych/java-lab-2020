package musicinstrument.src;

import musicinstrument.src.exceptions.IncompatibleMIPartTypeException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IncompatibleMIPartTypeException {
        
        System.out.println("Please input keyboard parts weights (delimiter ',')");
        Scanner input = new Scanner(System.in);
        java.lang.String[] in = input.nextLine().split(",");
        input.close();
        List<MusicInstrument> instruments = new ArrayList<>();
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

        instruments.add(keyboard);

        MusicInstrument guitar = new StringMusicInstrument();
        guitar.addPart(new GuitarString(1)).addPart(new GuitarString(1));
        iterator = guitar.getParts().listIterator();
        while (iterator.hasNext()) {
            MIPart part = iterator.next();
            System.out.println("Type of part: " + part.partType + " weight: " + part.getWeight());
        }

        instruments.add(guitar);

        List<MusicInstrument> keyboardInstruments =
                instruments
                        .stream()
                        .filter(p-> p.type().equals(MIType.KEYBOARD))
                        .collect(Collectors.toList());
        double totalWeight = instruments.stream().mapToDouble(MusicInstrument::getTotalWeight).sum();

        MusicInstrument mostWeight = instruments.stream().max(Comparator.comparing(MusicInstrument::getTotalWeight)).get();

        double averageWeight = instruments.stream().mapToDouble(MusicInstrument::getTotalWeight).average().getAsDouble();

        Map<String, List<MusicInstrument>> miMap = instruments.stream().collect(Collectors.groupingBy(instrument -> instrument.getTotalWeight() > 5 ? "heavy" : "light"));
        System.out.println("Map of instruments" + miMap);

        MIPart mostCommonPart =
                instruments.stream()
                        .flatMap(
                                sf -> sf.getParts().stream()).max(Comparator.comparing(MIPart::getMiType)).get();
        System.out.println(mostCommonPart);
    }
}
