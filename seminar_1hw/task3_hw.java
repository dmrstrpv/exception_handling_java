// Задание 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих
// массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
// пользователя.

import java.util.Arrays;

public class task3_hw {


    public static void main(String [] args){

        int arr1 [] = {1,2,3,4,5,5,66,6};
        int arr2 [] = {1,2,3,4,5,5,66,77,79};
        System.out.println(Arrays.toString(arraySubtraction(arr1, arr2)));

    }

    public static int[] arraySubtraction(int [] array1, int [] array2) {
        if (array1.length != array2.length) {
            
            throw new RuntimeException("Длины массивов не равны");
            
        } else {
            int [] array3 = new int [array1.length];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i] - array2[i];
            }
            return array3;
        }
    }
}
