package lab2_CommandInterpreter.lab2_5and6;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();//считывание из консоли 1 строки
        String[] inputArray = userInput.split(" ");//разбиваем строку по пробелам,получая массив
        if (inputArray[0].equals("repeat") | inputArray[0].equals("repeat ")) {//проверяет евляется ли нулевой эл repeat
            int count = 0;
            try {
                count = Integer.parseInt(inputArray[inputArray.length - 2]);//получаем количество повторений
            } catch (NumberFormatException e) {
                System.err.println("Введено не целочисленное значние!");

            }
            for (int k = 0; k < count; k++) {//цикл выводит второй аргумент count раз
//                for (int i = 1; i < inputArray.length - 1; i++) {//
//                    System.out.print(inputArray[i]+" ");
//                }
                System.out.print(inputArray[2]+'\n');
            }
        }
    }
}
