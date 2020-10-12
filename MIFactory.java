package classes;

import classes.MIType;

public class MIFactory {

    public MIPart createMI(MIType type) {
        switch (type) {
            case STRING:
                return new StringMusicInstrument();
                break;
        
            default:
                break;
        }
    }

}