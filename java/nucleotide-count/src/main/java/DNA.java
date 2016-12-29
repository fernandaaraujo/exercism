import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class DNA {
    private String dna;

    public DNA(String dna) {
        this.dna = dna;
    }

    public Map<Character,Integer> nucleotideCounts() {
        Map<Character, Integer> counts = new HashMap<>();

        counts.put('A', count('A'));
        counts.put('C', count('C'));
        counts.put('G', count('G'));
        counts.put('T', count('T'));

        return counts;
    }

    public int count(char dnaPiece) {
        int count = 0;
        String dnaSequence = "ACGT";

        if (dnaSequence.contains(Character.toString(dnaPiece))) {
            for (int i = 0; i < dna.length(); i++)
                if (dna.charAt(i) == dnaPiece)
                    count++;
        } else {
            throw new IllegalArgumentException();
        }

        return count;
    }
}
