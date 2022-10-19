import java.lang.reflect.Array;
import java.util.ArrayList;

public class AutoSpaceNormalased implements SpaceNormalased {

    @Override
    public String normalasedSpace(String forNormalased) {
    char[] charForNormalased = forNormalased.toCharArray();

    int simbol = 0;
    int bukva = 0;

    StringBuilder word = new StringBuilder();

    // " a ,  bb  c"
        for (int i = 0; i < charForNormalased.length; i++) {
            if (Character.isAlphabetic(charForNormalased[i])) {
                if (!word.isEmpty() && (bukva == 0)) {
                    word.append(" ");
                }
                    bukva = 1;
                    simbol = 0;
                    word.append(charForNormalased[i]);
            } else if (charForNormalased[i] == ' ') {
                bukva = 0;
            } else if (charForNormalased[i] == ',') {
                if (simbol == 0 && !word.isEmpty()) {
                    simbol = 1;
                    bukva = 0;
                    word.append(charForNormalased[i]);
                }
            }


        }
        String result = word.toString();
        return result;
    }
}
