import java.util.Scanner;

public class task_2 {
    public static void main(String [] args) {
        int[] array = new int []{2, 7, 4};
        // System.out.println(CheckArrLength(array, 2, 7));
        start(array, 3);
    }
    
    public static int CheckArrLength(int [] array, int limit, int num) {
        int length = array.length;
        if (length < limit) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++){
                if (array[i] == num) return i;
            }
            return -2;
        }
    }

    public static void start(int [] array, int limit){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите искомое число");
            int number = scanner.nextInt();
            System.out.println(CheckArrLength(array, limit, number));
        }

    }
}

