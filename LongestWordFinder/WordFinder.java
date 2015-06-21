
import java.io.*;


public class WordFinder {
    static File file = new File(Main.getFileName());

    public static String read() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exist();

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();

    }

    private static void exist() throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void findWord() throws FileNotFoundException {
        String textFromFile = read();
        String word[] = textFromFile.split(" ");
        int maxLen = word[0].length();
        int iMax = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > maxLen) {
                maxLen = word[i].length();
                iMax = i;
            }
        }
        System.out.println("The longest word in the text is - " + word[iMax]);
    }

}
