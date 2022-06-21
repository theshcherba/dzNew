import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class lab1_3 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> linkList = new LinkedList<String>();
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\file1_3.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            // проверка на 0
            if (line.contains("0") && line.length() == 1){ //
                break;
            }
            linkList.add(line);
            line = reader.readLine(); // считываем остальные строки в цикле
        }

        while (linkList.size() != 0) {
            System.out.println(linkList.pollLast());
        }
    }
}
