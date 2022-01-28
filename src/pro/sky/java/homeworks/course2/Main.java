package pro.sky.java.homeworks.course2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static IntegerList c = new IntegerListImpl(15);

    private static IntegerList r = new IntegerListImpl(15);

    public static void main(String[] args) {

        c.add(2);
        c.add(4);
        c.add(1);
        c.add(8);
        c.add(11);
        c.add(15);
        c.add(7);

        r.add(2);
        r.add(4);
        r.add(1);
        r.add(8);
        r.add(11);
        r.add(15);
        r.add(7);

//        System.out.println(c.equals(r));
//        System.out.println(c.add(7, 6));
//        System.out.println(c.add(20, 9));
//        System.out.println(c.set(6, 13));
//        System.out.println(c.set(8, 13));
//        System.out.println(c.removeItem(2));
//        System.out.println(c.removeItem(55));
//        System.out.println(c.removeByIndex(0));
//        System.out.println(c.removeByIndex(-100));
//        System.out.println(c.contains(11));
//        System.out.println(c.contains(777));
//        System.out.println(c.indexOf("bbb"));
//        System.out.println(c.indexOf(7));
//        System.out.println(c.lastIndexOf(11));
//        System.out.println(c.lastIndexOf(99));
//        System.out.println(c.get(1));
//        System.out.println(c.get(-100));
//        System.out.println(c.size());
//        System.out.println(c.isEmpty());
//        System.out.println(Arrays.toString(c.toArray()));
//        c.clear();
//        System.out.println(Arrays.toString(c.toArray()));












//        Random r = new Random();
//        int[] arr1 = new int[100_000];
//        for (int i = 0; i < 100_000; i++) {
//            arr1[i] = r.nextInt(100_000);
//        }
//        int[] arr2 = Arrays.copyOf(arr1, 100_000);
//        int[] arr3 = Arrays.copyOf(arr1, 100_000);
////        System.out.println(Arrays.toString(arr1));
//
//
//
//        long start = System.currentTimeMillis();
////        sortBubble(arr1); //9772
////        sortSelection(arr2); //2274
//        sortInsertion(arr3); //515
//        System.out.println(System.currentTimeMillis() - start);
//
//    }
//
//    private static void swapElements(int[] arr, int indexA, int indexB) {
//        int tmp = arr[indexA];
//        arr[indexA] = arr[indexB];
//        arr[indexB] = tmp;
//    }
//
//    public static void sortBubble(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swapElements(arr, j, j + 1);
//                }
//            }
//        }
//    }
//
//    public static void sortSelection(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minElementIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minElementIndex]) {
//                    minElementIndex = j;
//                }
//            }
//            swapElements(arr, i, minElementIndex);
//        }
//    }
//
//    public static void sortInsertion(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i;
//            while (j > 0 && arr[j - 1] >= temp) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = temp;
//        }
    }
}
