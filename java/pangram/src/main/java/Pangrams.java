import java.util.HashMap;
import java.util.Map;

/**
 * Created by faraujo on 12/29/16.
 */

public class Pangrams {

    public static boolean isPangram(String pangram) {
        Map<Character,Integer> panagramCount = new HashMap<>();

        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            panagramCount.put(ch, count(ch, pangram.toUpperCase()));
        }

        return checkPangram(panagramCount);
    }

    private static boolean checkPangram(Map<Character, Integer> panagramCount) {
        if (panagramCount.containsValue(0)) {
            return false;
        }

        return true;
    }

    public static int count(Character pangramPiece, String panagram) {
        int count = 0;

            for (int i = 0; i < panagram.length(); i++) {
                Character letter = panagram.charAt(i);
                if (pangramPiece == letter)
                    count++;
            }

        return count;
    }
}
