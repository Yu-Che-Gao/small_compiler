package lexer;

public class Word extends Token {
    public final String lexeme;

    public Word(String s, int t) {
        super(t);
        lexeme = new String(s);
    }

    public String toString() {
        return lexeme;
    }

    public static final Word
        temp=new Word("t", Tag.TEMP);
}
