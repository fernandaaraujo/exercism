import java.util.Random;

/**
 * Created by faraujo on 1/2/17.
 */

public class Robot {
    public static final int QUANTITY_NUMBERS_IN_NAME = 3;
    public static final int QUANTITY_LETTERS_IN_NAME = 2;
    private String name;
    private String oldRobotName;

    public Robot() {
        this.name = getRandomName();
    }

    private String getRandomName() {
        return getLettersOfRobotName() + getNumbersOfRobotName();
    }

    private String getNumbersOfRobotName() {
        String numbersOfName = "";

        for (int i = 0; i< QUANTITY_NUMBERS_IN_NAME; i++)
            numbersOfName += getRandomNumber();

        return numbersOfName;
    }

    private String getLettersOfRobotName() {
        String lettersOfName = "";
        char[] alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i< QUANTITY_LETTERS_IN_NAME; i++)
            lettersOfName += alphabetLetters[getRandomNumber()];

        return lettersOfName;
    }

    private int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(9);
    }

    public String getName() {
        return name;
    }

    public void reset() {
        this.oldRobotName = name;
        checkIfNameExists();
    }

    private void checkIfNameExists() {
        boolean isSameName = true;
        while (isSameName) {
            if (oldRobotName == name) {
                this.name = getRandomName();
                isSameName = false;
            }
        }
    }
}
