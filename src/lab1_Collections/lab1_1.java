package lab1_Collections;

import java.io.*;
import java.util.Stack;

public class lab1_1 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack(); //создание пустого стека
        File file = new File("C:\\Users\\Лена\\IdeaProjects\\dz\\src\\File\\file1_3.txt");
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            if (line.contains("0") && line.length() == 1){ //
                break;
            }
            stack.push(line);
            line = reader.readLine(); // считываем остальные строки в цикле
        }

        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        while (stack.size() != 0){
            String str = (String) stack.pop();
            writer.println(str);
        }
        // обязательно закрыть
        writer.close();

    }
}

