import java.util.Arrays;

public class EX7 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10};
        int[] uniqueArray = removeDuplicates(array);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
       
        Arrays.sort(array);
        int uniqueCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index++] = array[i];
            }
        }
        
        return uniqueArray;
    }
}
