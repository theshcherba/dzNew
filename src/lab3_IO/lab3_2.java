package lab3_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file3_2");
        Scanner scanner = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNextLine()){//добавляем строки из файла в коллекцию
            strings.add(scanner.nextLine());
        }
        Object [] output = strings.toArray();//преобразуем коллекцию к массиву и выводим
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
