import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String anagram;

    public Anagram(String anagram) {
        this.anagram = anagram.toLowerCase();
    }

    public List<String> match(List<String> strings) {
        List<String> matches = new ArrayList<>();

        for (String word: strings) {
            if (isAnagram(word.toLowerCase())) {
                matches.add(word);
            }
        }

        return matches;
    }

    public String padronizedAnagram() {
        char[] groupLettersAnagram = anagram.toCharArray();
        Arrays.sort(groupLettersAnagram);

        return new String(groupLettersAnagram);
    }

    public String padronizedWord(String word) {
        char[] groupLettersdWord = word.toCharArray();
        Arrays.sort(groupLettersdWord);

        return new String(groupLettersdWord);
    }

    public boolean isAnagram(String word) {
        if (anagram.equals(word))
            return false;

        if (word.length() != anagram.length())
            return false;

        return compareWordAndAnagram(word);
    }

    public boolean compareWordAndAnagram(String word) {
        String wordToCompare = padronizedWord(word);
        String anagramToCompare = padronizedAnagram();

        return anagramToCompare.equals(wordToCompare);
    }
}
