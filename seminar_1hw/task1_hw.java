// Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные
// стандартные для Java исключения;

public class task1_hw{
    

    public static void main(String[] args) {
        //stackOverFlowError();
        //System.out.println(divisionByZero(1, 0));
        //nullPointer(null);
        //indexOutOfBounds();
    
    }

    //  public static int stackOverFlowError() {
    //     int counter = 0;
    //     while (true) {
    //         counter += 1000000;
    //         stackOverFlowError();
    //     }
    
    // }

    public static int divisionByZero(int a, int b) {
        return a / b;
    }

    public static void nullPointer(int [] array){
        for (int index = 0; index < array.length; index++) {
            // some code
        }
    }

    public static void indexOutOfBounds(){
        int[] array = new int []{2, 7, 4, 5};
        for (int index = 0; index < array.length + 1; index++) {
            int tmp = array[index];
            System.out.println(tmp);
        }
    }
}