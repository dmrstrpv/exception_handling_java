 // Задание 2. Посмотрите на код, и подумайте сколько разных типов
// исключений вы тут сможете получить?


public class task2_hw {
     

    public static void main(String [] args) {
        String [][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "0", "0", "1", "1", "66"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
        };
       
        System.out.println(sum2d(arr0));
        //sum2d(null); // NullPointerException
        //ArrayIndexOutOfBoundsException

        
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    
}
