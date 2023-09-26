// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            String string = input.nextLine();
            string = string.trim();
            if(string.isEmpty())
                throw new IllegalArgumentException ("Пустые строки вводить нельзя");
            else
                System.out.println(string);
        }
    }
}