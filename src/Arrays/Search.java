package Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        int result = searchs(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchs(int[] arr, int value){

        for(int i = 0; i < arr.length; i++){
            if(value == arr[i]){
                return 20001;
            }
        }
        return -1;
    }


    
}
