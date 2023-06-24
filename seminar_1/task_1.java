public class task_1 {
    public static void main(String [] args) {
        int[] array = new int []{2, 7, 4, 6, 6, 7};
        System.out.println(CheckArrLength(array, 78));
    }
    
    public static int CheckArrLength(int [] array, int limit) {
        int length = array.length;
        if (length < limit) {
            return -1;
        } else return length;
    } 
}

