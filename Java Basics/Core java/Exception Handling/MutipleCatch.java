import java.util.*;
import java.io.*;
public class MutipleCatch {
    public static void main(String[] args) {
        // 1. Handle IOException and NullPointerException
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("reading from a file...");
            BufferedReader br=new BufferedReader(new FileReader("nonexistfile.txt"));
            String line=br.readLine();
            System.out.println(line.length());
            br.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Line was null.");
        }
        //2.Handle InputMismatchException and ArithmeticException
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=a/b;
            System.out.println(res);
        }
        catch(InputMismatchException e){
            System.out.println("enter valid details...");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero...");
        }
        //3.cal with 3 exception handlers
        try{
            System.out.println("enter num 1..");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            String op=sc.next();
            int cal=0;
            switch(op){
                case "+":
                  cal=n1+n2;
                  break;
                case "-":
                cal=n1-n2;
                break;
                case "*":
                cal=n1*n2;
                break;
                case "/":
                cal=n1/n2;
                break;
                default:
                throw new IllegalArgumentException("invalid operation...");
            }
            System.out.println(cal);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid number");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //4.Try block that triggers 2 exceptions
        try{
            String text=null;
            int[] arr=new int[2];
            System.out.println(text.length());//NullPointerException
            System.out.println(arr[5]);//ArrayindexoutOfboundsException
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    } 
}
