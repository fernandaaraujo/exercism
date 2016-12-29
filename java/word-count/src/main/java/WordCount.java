import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String,Integer> phrase(String phrase) {
        String phraseNormalized = phrase.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] splitPhrase = phraseNormalized.split(" ");
        Map<String,Integer> expectedWordCount = new HashMap<>();

        for (String word: splitPhrase) {
            if (!word.isEmpty())
                expectedWordCount.put(word, countWords(word, splitPhrase));
        }

        return expectedWordCount;
    }

    public int countWords(String word, String[] phrase){
        int count = 0;
        for (String piece: phrase) {
            if (piece.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
