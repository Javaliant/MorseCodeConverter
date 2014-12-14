/**
 * Created by Luigi on 12/14/2014. Enum set for MorseCodeConverter
 */
public enum Morse {
    MC_1(".----", '1'), MC_2("..---", '2'),MC_3("...--", '3'),

    MC_4("....-", '4'), MC_5(".....", '5'), MC_6("-....", '6'),

    MC_7("--...", '7'), MC_8("---..", '8'), MC_9("----.", '9'),

    MC_0("-----", '0'), MC_A(".-", 'A'), MC_B("-...", 'B'),

    MC_C("-.-.", 'C'), MC_D("-..", 'D'), MC_E(".", 'E'),

    MC_F("..-.", 'F'), MC_G("--.", 'G'), MC_H("....", 'H'),

    MC_I("..", 'I'), MC_J(".---", 'J'), MC_K("-.-", 'K'),

    MC_L(".-..", 'L'), MC_M("--", 'M'), MC_N("-.", 'N'),

    MC_O("---", 'O'), MC_P(".--.", 'P'), MC_Q("--.-", 'Q'),

    MC_R(".-.", 'R'), MC_S("...", 'S'), MC_T("-", 'T'),

    MC_U("..-", 'U'), MC_V("...-", 'V'), MC_W(".--", 'W'),

    MC_X("-..-", 'X'), MC_Y("-.--", 'Y'), MC_Z("--..", 'Z'),
    MC_SPACE("/", ' ');

    public final String morse;
    public final char code;

    Morse(String morse, char code) {
        this.morse = morse;
        this.code = code;
    }
}
