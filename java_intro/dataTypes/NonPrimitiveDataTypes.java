package dataTypes;
import java.util.Arrays;

public class NonPrimitiveDataTypes {
    public static void main(String[] args){
        String str = "string"; // more memory effecient because you can resuse  
        System.out.println(str);

        String str1 = new String("test"); // another way to create new string in Java  
        System.out.println("Another string: "+str1);

        int arr[]; // can store sequence of anthing - integers, chr, floats.
        arr = new int[2]; // determines the size of the array. This is for 2 values 
        arr[0] = 0;
        arr[1] = 1;
        //arr[2] = 2;

        System.out.println(arr); // will print the memory location of array.
        System.out.println(Arrays.toString(arr)); // how to print entire array. 
        System.out.println(arr[0]); // accessing and printing a location in array
    }
    
}
