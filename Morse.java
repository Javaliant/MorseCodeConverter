/**
 * Created by Luigi on 12/14/2014. Enum set for MorseCodeConverter
 */
public enum Morse {
    MC_1(".----"), MC_2("..---"),MC_3("...--"),

    MC_4("....-"), MC_5("....."), MC_6("-...."),

    MC_7("--..."), MC_8("---.."), MC_9("----."),

    MC_0("-----"), MC_A(".-"), MC_B("-..."),

    MC_C("-.-."), MC_D("-.."), MC_E("."),

    MC_F("..-."), MC_G("--."), MC_H("...."),

    MC_I(".."), MC_J(".---"), MC_K("-.-"),

    MC_L(".-.."), MC_M("--"), MC_N("-."),

    MC_O("---"), MC_P(".--."), MC_Q("--.-"),

    MC_R(".-."), MC_S("..."), MC_T("-"),

    MC_U("..-"), MC_V("...-"), MC_W(".--"),

    MC_X("-..-"), MC_Y("-.--"), MC_Z("--.."),
    MC_SPACE("/", ' ');

    public final String morse;
    public final char code;
    
    Morse(String morse) {
        this.morse = morse;
        this.code = name().charAt(name().length() -1);
    }

    Morse(String morse, char code) {
        this.morse = morse;
        this.code = code;
    }
}
