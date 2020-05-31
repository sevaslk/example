
import static java.lang.Character.isLetter;

import java.util.StringTokenizer;

public class Anagram {

    public String reverseString(String originalString) {
        if (originalString == null) {
            throw new IllegalArgumentException("Argument is " + originalString);
        }
        StringBuilder result = new StringBuilder(originalString);
        StringTokenizer tokenizer = new StringTokenizer(originalString, " ", true);
        String[] words = new String[tokenizer.countTokens()];
        for (int i = 0; tokenizer.hasMoreElements(); i++) {
            words[i] = tokenizer.nextToken();
        }

        for (int i = 0; i < words.length; i++) {
            int indexStart = result.indexOf(words[i]);
            int indexEnd = result.indexOf(words[i]) + words[i].length();
            result.replace(indexStart, indexEnd, reverseWord(words[i]));
        }
        return result.toString();
    }

    String reverseWord(String originalWord) {
        char[] result = originalWord.toCharArray();
        int endPosition = result.length - 1;

        for (int startPosition = 0; startPosition < endPosition; startPosition++) {
            if (!isLetter(result[endPosition])) {
                endPosition--;
            }
            if (isLetter(result[startPosition])) {
                char temp = result[startPosition];
                result[startPosition] = result[endPosition];
                result[endPosition] = temp;
                endPosition--;
            }
        }
        return new String(result);
    }
}
