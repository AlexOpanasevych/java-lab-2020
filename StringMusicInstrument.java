public class StringMusicInstrument extends MusicInstrument {

    public StringMusicInstrument() {
        setType(MIType.STRING);
    }

    @Override
    public MIType type() {
        return super.type();
    }

    @Override
    public void play() {
        System.out.println("Playing keyboard instrument");
    }

    public boolean equals(StringMusicInstrument obj) {
        // bad, i know
        return this.parts.size() == obj.parts.size();
    }

}
