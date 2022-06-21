import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file3_3");
        Scanner scan = new Scanner(reader);
        int maxleng = 0;
        String word = null;
        String ex = null;
        while (scan.hasNext()) {
            ex = scan.nextLine();
            if (ex.length() > maxleng) {
                maxleng = ex.length();
                word = ex;
            }
        }
        System.out.println(word);
    }
}
