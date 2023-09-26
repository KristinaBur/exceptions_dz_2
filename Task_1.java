// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try {
            getFloat();
            System.out.println(getFloat());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите дробное число, типа float");

        }

    }

    public static Float getFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        Float floaat = in.nextFloat();

        in.close();

        return floaat;
    }
}