package Arrays;

public class Deletion {
    
    public static void main(String[] ars){
        int[] arry = {1, 2, 3, 4};

        for (int i: arry){
            System.out.print(i +" ");
        }
        System.out.println();

        int[] newArr = delete(arry,3);

        // Print result
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        System.out.println("--------------------");


        int[] newArrr = removeAtIndex(arry,3);
        // Print result
        for (int num : newArrr) {
            System.out.print(num + " ");
        }
    }

    public static int[] delete(int[] array, int value){
        int count = 0;

        // Count how many elements are NOT equal to value
        for(int i: array){
            if( i != value){
                count++;
            }
        }

        // Create new array
        int[] newarr = new int[count];

        // Copy elements except the one to remove
        int j = 0;
        for (int num : array) {
            if (num != value) {
                newarr[j++] = num;
            }
        }
        return newarr;
    }


    //Remove by INDEX
    public static int[] removeAtIndex(int[] arr, int index) {
        // Check for invalid index
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }
}
