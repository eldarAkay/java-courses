import java.io.FileNotFoundException;


public class Main {
    private static String fileName = "F://Java/simpletext.txt";

    public static String getFileName() {
        return fileName;
    }

    public static void main(String args[]) throws FileNotFoundException {
        WordFinder.findWord();
    }

}
