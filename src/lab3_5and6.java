import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab3_5and6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу для считывания данных");
        Scanner scanner1 = new Scanner(System.in);//считывает путь к файлу 1 из консоли
        String name1 = scanner1.nextLine();//записывает путь в переменную
        System.out.println("Введите путь к файлу для записи данных из другого файла");
        Scanner scanner2 = new Scanner(System.in);
        String name2 = scanner2.nextLine();
        FileReader reader = new FileReader(name1);
        Scanner scanner3 = new Scanner(reader);//считывает данные из 1 файла
        PrintWriter writer = new PrintWriter(name2, "UTF-8");//для записи
        String string;
        int max;
        String biggestWord;
        while (scanner3.hasNextLine()) {//проверка всех строк
            biggestWord = null;
            max = 0;
            string = scanner3.nextLine();
            String[] words = string.split(" ");//разбиваем строку на массив слов
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > max) {
                    max = words[i].length();
                    biggestWord = words[i];
                }

            }
            writer.println(biggestWord);

        }
        reader.close();
        writer.close();
    }
}
