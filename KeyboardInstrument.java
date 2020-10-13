package labs2020Java.lab1;

class KeyboardInstrument extends MusicInstrument {
    
    public KeyboardInstrument() {
        setType(MIType.KEYBOARD);
    }

    @Override
    public MIType type() {
        return super.type();
    }

    @Override
    public void play() {
        System.out.println("Playing keyboard instrument");
    }
}