package seminar_2hw;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */

public class task1_hw {
     public static void main(String[] args) {
        
        echoMethod();

    }

    public static void echoMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите дробное число");
        try {
            float num = scanner.nextFloat();
            System.out.println("введенное значение " + checkFloat(num));

        } 
        catch (InputMismatchException e) {
            System.err.println(e.getMessage() + " Это не дробное число");
            echoMethod();
        } 
        finally {
        if (scanner != null)
        scanner.close();
        }
    }

    public static float checkFloat (float num) {
            if (num % 1 == 0){
                throw new InputMismatchException("Wrong type");
            } else {
                return num;
            }
    }
}    
