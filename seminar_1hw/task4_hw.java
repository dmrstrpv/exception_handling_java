// Задание 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращает новый массив, каждый элемент которого равен частному элементов двух
    // входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
    // пользователя. При выполнении метода единственное исключение, которое пользователь может увидеть
    // - RuntimeException, т.е. ваше. 

import java.util.Arrays;

public class task4_hw {

    public static void main(String [] args){

        double arr1 [] = {1,2,3,74,5,555,66,6};
        double arr2 [] = {159,2,3,4,5,5,66,6};
        System.out.println(Arrays.toString(arraySubtraction(arr1, arr2)));

    }

    public static double[] arraySubtraction(double [] array1, double [] array2) {
        if (array1.length != array2.length) {
            
            throw new RuntimeException("Длины массивов не равны");
            
        } else {
            double [] array3 = new double [array1.length];
            for (int i = 0; i < array1.length; i++) {
                if (array2[i] == 0){
                    throw new RuntimeException("На ноль делить нельзя");
                }
                array3[i] = array1[i] / array2[i];
            }
            return array3;
        }
    }
}
