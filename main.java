package com.company;
import java.util.Scanner;

class BadFileNameException extends Exception {
    public BadFileNameException(String errorMessage) {
        super(errorMessage);
    }
}
public class main {

    public static void main(String[] args) {
        String b = null;
        String s = null;
        try {
            Scanner check = new Scanner(System.in);
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Введите кол-во элементов в базе данных: ");
            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            String array[] = new String[size + 1]; // Создаём массив int размером в size
            System.out.println("Введите ИНН и ФИО находящиеся в базе данных:");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i <= size; i++) {
                array[i] = input.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
            }
            System.out.print("Введенная информация");
            for (int i = 0; i <= size; i++) {
                System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }

            System.out.print("Введите ИНН и ФИО ");
            Scanner scan = new Scanner(System.in);
            s = scan.nextLine();

            for (int i = 0; i < array.length; ++i) {
                if (array[i].contains(s)) {
                    b = array[i];
                    System.out.println("Искомые данные прошли проверку " + array[i]);
                }
                else {
                    throw new Error();
                }
            }
        }
        catch (Error e) {
            System.out.println("Искомые данные не прошли проверку");
        }
    }
}