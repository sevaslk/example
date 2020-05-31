
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AnagramTest {
    private Anagram anagram = new Anagram();

    @Test
    void reverseStringShouldReturnReversedStringWhenRegularString() {
        assertEquals("123 sa tr1e!wq", anagram.reverseString("123 as qw1e!rt"));
    }

    @Test
    void reverseStringShouldReturnSameStringWhenZero() {
        assertEquals("0", anagram.reverseString("0"));
    }

    @Test
    void reverseStringShouldReturnSameStringWhenEmptyString() {
        assertEquals("", anagram.reverseString(""));
    }

    @Test
    void reverseStringShouldReturnSameStringWhenNumbersOnly() {
        assertEquals("123-9", anagram.reverseString("123-9"));
    }

    @Test
    void reverseStringShouldReturnSameStringWhenSpacesOnly() {
        assertEquals("     ", anagram.reverseString("     "));
    }

    @Test
    void reverseStringShouldReturnReversedStringWhenSpacesAtBeginOfString() {
        assertEquals("     123ytrewq", anagram.reverseString("     123qwerty"));
    }

    @Test
    void reverseStringShouldReturnReversedStringWhenSpacesAtEndOfString() {
        assertEquals("123ytrewq     ", anagram.reverseString("123qwerty     "));
    }

    @Test
    void reverseStringShouldReturnReversedStringWhenManySpacesBetweenWords() {
        assertEquals("123     ytrewq", anagram.reverseString("123     qwerty"));
    }

    @Test
    void reverseStringShouldReturnSameStringWhenSpecialSymbols() {
        assertEquals("~!@#$%^&*()_+|?\\/.,[]{}-=", anagram.reverseString("~!@#$%^&*()_+|?\\/.,[]{}-="));
    }

    @Test
    void reverseStringShouldThrowExceptionWhenNull() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> anagram.reverseString(null));
        assertEquals("Argument is null", exception.getMessage());
    }

    @Test
    void reverseWordShouldReturnReversedStringWhenRegularString() {
        assertEquals("     123ytrewq", anagram.reverseWord("     123qwerty"));
    }
}
