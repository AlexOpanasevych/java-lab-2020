package musicinstrument.src;

public enum MIType {
    STRING(1), KEYBOARD(2), PERCUSSION(3), WOODWIND(4), BRASS(5), ELECTRIC(6);

    private final int code;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

    public int getCode() {
        return code;
    }

    public static String allTypes() {
        return String.join(", ", STRING.toString(), KEYBOARD.toString(), PERCUSSION.toString(), WOODWIND.toString(), 
        BRASS.toString(), ELECTRIC.toString());
    }

    private MIType(int code) {
        this.code = code;
    }
}