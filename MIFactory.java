public class MIFactory {

    public MusicInstrument createMI(MIType type) {
        switch (type) {
            case STRING:
                return new StringMusicInstrument();
            case KEYBOARD:
                return new KeyboardInstrument();
            default:
                return null;
        }
    }

}