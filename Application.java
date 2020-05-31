
import java.util.logging.Logger;

public class Application {
    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        String originalText = "   a1bcd? efg!h, <>?%@/  ����33����  sdgf<j,kl.        123 as";
        Anagram anagram = new Anagram();
        
        String reversedText = anagram.reverseString(originalText);
        logger.info(reversedText);
    }
}
