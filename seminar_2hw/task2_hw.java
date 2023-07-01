package seminar_2hw;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */

public class task2_hw {

     public static void main(String[] args) {

        int [] intArray = new int [] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
    }
}

