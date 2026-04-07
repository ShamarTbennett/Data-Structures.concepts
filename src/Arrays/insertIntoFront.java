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


        int[] array= {1,2,3,4,5,6};
        for(int i: array){
            System.out.print(i+ " ");
        }
        System.out.println();
        
        int[] cor= infront(array, 51);
        for(int i: cor){
            System.out.print(i + " ");
        }
         System.out.println(); System.out.println();
         
        int[] cors= anywhere(array, 0,51);
        for(int i: cors){
            System.out.print(i + " ");
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


    ///insering to the front of teh array only and not expanding it
     public static int[] infront(int[] array, int value){
        int[] newarry = new int[array.length]; //creating anew array
        
        newarry[0] = value; //assign it to the front of the new aarray 
        
        for(int i=0; i<array.length-1; i++){//pushed out the last value in the onld one to make room for the new value
            newarry[i +1]=array[i]; //copying the rest of the old array into the new one
        }
        return newarry;///returning the new array
    }

    //inserting anywher withing thw array and making it expand
    public static int[] anywhere(int[] array, int index, int value){
        int[] newarr= new int[array.length+1];//creating a new array with an extra space for the insertib=ng value
        
        for(int i=0; i<index;i++){//cpoying the values before the intended index for inserting
            newarr[i] = array[i];
        }
        newarr[index] = value;//assign the value to the intended index
        
        for(int i=index; i< array.length;i++){//copying teh rest of the values from the old array to the new one
            newarr[i+1] = array[i];
        }
        return newarr;
    }
}
