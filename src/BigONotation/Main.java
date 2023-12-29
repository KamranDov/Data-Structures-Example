package BigONotation;

public class Main {

    public static void main(String[] args) {
//        System.out.println(countEvens(new int[]{5, 6, 4, 8}));
        System.out.println(countEvens1(new int[]{11,2,66,24}, 2));
    }

    //    public static int countEvens(int[] array) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
    //asagdaki kod Constant Time-dir - O(1)
    public static int countEvens1(int[] array, int i) {
        if (array[i] % 2 == 0) {
        }
        return array[i];
    }
}