public class Hamming {
    public static int compute(String dnaOriginal, String dnaToCompare) {
        if (isDNAOfSameSize(dnaOriginal, dnaToCompare)) {
            return getCountDifferentCharacters(dnaOriginal, dnaToCompare);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static int getCountDifferentCharacters(String dnaOriginal, String dnaToCompare) {
        int count = 0;
        for (int i = 0; i < dnaOriginal.length(); i++) {
            if (dnaOriginal.charAt(i) != dnaToCompare.charAt(i))
                count++;
        }
        return count;
    }

    private static boolean isDNAOfSameSize(String dnaOriginal, String dnaToCompare) {
        return dnaOriginal.length() == dnaToCompare.length();
    }
}
