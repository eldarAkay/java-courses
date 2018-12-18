import java.io.*;

public class TextUtil {

    public static String getLongestWord(File file) throws FileNotFoundException {
        String text = read(file);
        String word[] = text.split(" ");
        int maxLen = word[0].length();
        int iMax = 0;

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > maxLen) {
                maxLen = word[i].length();
                iMax = i;
            }
        }

        return word[iMax];
    }

    private static String read(File file) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();

        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }

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
}
