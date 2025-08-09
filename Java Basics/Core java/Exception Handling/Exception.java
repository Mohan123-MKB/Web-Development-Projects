//try catch block
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1.Handle ArrayIndexOutOfBoundsException
        try{
            int[] arr={10,20,30};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        //2.Handle NumberFormatException
        try{
            System.out.println("enter number:");
            String ip=sc.nextLine();
            int num=Integer.parseInt(ip);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        //Handle ArithmeticException
        try{
            System.out.println("enter 2 number");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int res=n1/n2;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //4.Handle FileNotFoundException
        try{
            FileReader f=new FileReader("AI TOOLS.txt");          
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block always executed whether exception occur or not");
        }
        sc.close();
    }
}