package lab3_IO;

import java.io.*;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file3_1");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();

    }
}
