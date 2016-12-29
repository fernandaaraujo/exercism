import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        Iterator<Integer> keySetIterator = old.keySet().iterator();

        while (keySetIterator.hasNext()) {
            Integer key = keySetIterator.next();
            for (String oldString: old.get(key)) {
                switch (oldString) {
                    case "D":
                    case "G":
                        expected.put(oldString.toLowerCase(), 2);
                        break;
                        
                    case "B":
                    case "C":
                    case "M":
                    case "P":
                        expected.put(oldString.toLowerCase(), 3);
                        break;

                    case "F":
                    case "H":
                    case "V":
                    case "W":
                    case "Y":
                        expected.put(oldString.toLowerCase(), 4);
                        break;

                    case "K":
                        expected.put(oldString.toLowerCase(), 5);
                        break;

                    case "J":
                    case "X":
                        expected.put(oldString.toLowerCase(), 8);
                        break;

                    case "Q":
                    case "Z":
                        expected.put(oldString.toLowerCase(), 10);
                        break;

                    default:
                        expected.put(oldString.toLowerCase(), 1);
                        break;
                }
            }
        }

        return expected;
    }
}
