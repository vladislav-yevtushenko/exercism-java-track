import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    String originalString;
    char[] originalCharArray;

    public Anagram(String originalString) {
        this.originalString = originalString;
        originalCharArray = originalString.toLowerCase().toCharArray();
    }

    public List<String> match(List<String> inputList) {
        List<String> resultList = new ArrayList<>();

        for (String inputStr : inputList) {

            if (!inputStr.equalsIgnoreCase(originalString)) {
                Arrays.sort(originalCharArray);

                char[] inputCharArray = inputStr.toLowerCase().toCharArray();
                Arrays.sort(inputCharArray);

                if (Arrays.equals(originalCharArray, inputCharArray)) {
                    resultList.add(inputStr);
                }
            }

        }

        return resultList;
    }
}
