public enum MIType {
    STRING,
    KEYBOARD,
    PERCUSSION,
    WOODWIND,
    BRASS,
    ELECTRIC;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}