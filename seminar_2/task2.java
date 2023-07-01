package seminar_2;

    /**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */

public class task2 {

    public static void main(String[] args) {
         String [][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "0", "0", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
        };

        
        String[][] arr = new String[][] {
                {"1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };




        System.out.println(sum2d(arr0));
        System.out.println(sum2d(arr));

    }

    private static int sum2d(String[][] arr) {
        int sum = 0;

        try {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив не квадрат");
        }  catch (NumberFormatException e) {
            System.out.println("Есть не только числа");
        }  
        // catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
        //     System.out.println("Ошибка");
        // }
        return sum;
        
    }
}

