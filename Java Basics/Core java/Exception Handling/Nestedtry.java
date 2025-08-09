import java.util.*;
import java.io.*;
public class Nestedtry {
    public static void main(String[] args) {
    // try{
    //     try{
    //         int a=5/0;
    //     }catch(ArithmeticException e){
    //         System.out.println(e.getMessage());
    //     }
    // }
    // catch(Exception e){
    //     System.out.println();
    // }
    try{
        String[] arr={"java",null};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array error");
        }
    }
    catch(NullPointerException e){
        System.out.println("null error");
    }
}
}
