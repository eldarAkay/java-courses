import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {
        String path = "resources/text";
        File file = new File(path);

        String longestWord =  TextUtil.getLongestWord(file);

        System.out.println(String.format("The longest word is - %s", longestWord));
    }
}
