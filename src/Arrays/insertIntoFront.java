package Arrays;
public class insertIntoFront{ 
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4};

        for (int i: arry){
            System.out.print(i +" ");
        }
        System.out.println();


        int[] newArr = insertInFront(arry, 0, 99);

        // Print result
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertInFront(int[] arry, int position, int value) {
        int[] newArr = new int[arry.length];

        // Copy elements before position
        for (int i = 0; i < position; i++) {
            newArr[i] = arry[i];
        }

        // Insert value
        newArr[position] = value;

        // Shift remaining elements to the right
        for (int i = position; i < arry.length -1; i++) {
            newArr[i+1] = arry[i];
        }

        return newArr;
    }

    /*public static int[] insertsInFront(int[] arry, int position, int value) {
        int[] newArr = new int[arry.length];

        // Copy elements before position
        for (int i = 0; i < position; i++) {
            newArr[i] = arry[i];
        }

        // Insert value
        newArr[position] = value;

        // Shift remaining elements
        for (int i = position; i < arry.length-1; i++) {
            newArr[i + 1] = arry[i];
        }

        return newArr;
    }*/

    public static int[] insertInFront(int[] arry, int value) {
        int[] newArr = new int[arry.length];

        // Insert at front
        newArr[0] = value;

        // Shift everything right (drop last)
        for (int i = 0; i < arry.length - 1; i++) {
            newArr[i + 1] = arry[i];
        }

        return newArr;
    }
}
