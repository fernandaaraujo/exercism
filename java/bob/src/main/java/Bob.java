/**
 * Created by faraujo on 1/2/17.
 */

public class Bob {
    public static final String SURE = "Sure.";
    public static final String WHOA_CHILL_OUT = "Whoa, chill out!";
    public static final String FINE_BE_THAT_WAY = "Fine. Be that way!";
    public static final String WHATEVER = "Whatever.";

    public String hey(String talkedToBob) {
        if (checkIfIsSayingAnything(talkedToBob)) {
            return FINE_BE_THAT_WAY;
        } else if (checkIfIsYell(talkedToBob)) {
            return WHOA_CHILL_OUT;
        } else if (checkIfIsAQuestion(talkedToBob)) {
            return SURE;
        } else {
            return WHATEVER;
        }
    }

    private boolean checkIfIsSayingAnything(String talkedToBob) {
        return talkedToBob.replace(" ", "").isEmpty();
    }

    private boolean checkIfIsYell(String talkedToBob) {
        if (!checkIfIsNumeric(talkedToBob))
            return talkedToBob.equals(talkedToBob.toUpperCase());

        return false;
    }

    private boolean checkIfIsNumeric(String talkedToBob) {
        try {
            String phraseNormalized = getPhraseWithoutCharacters(talkedToBob);
            Integer.parseInt(phraseNormalized);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    private String getPhraseWithoutCharacters(String talkedToBob) {
        return talkedToBob.replaceAll("[^a-zA-Z0-9\\s]", "").replace(" ", "");
    }

    public boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    private boolean checkIfIsAQuestion(String talkedToBob) {
        return talkedToBob.charAt(talkedToBob.length() - 1) == '?';
    }
}
