package anushka;
import java.util.Scanner;
import java.util.Arrays;


public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitives

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 345;
        arr[4] = 4;
        // To print a particular element
        System.out.println(arr[3]);

        //input using for loops
        //method1:
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//
//        }

        //Method 2: using enhanced for loop
//
//        for (int j : arr) { // for every element in array,print the element
//            System.out.println(j + " "); //here j represent element of array
//
//        }

//        for(int i = 0;i< arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

        //easy way to print also the best one
        //System.out.println(Arrays.toString(arr));

        // Array of Objects
        String[] str = new String[4];
        for(int i = 0;i <str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
