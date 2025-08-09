public class First20{
    //check num is even or odd
    static void checkEvenOdd(int num){
        if(num % 2==0){
            System.out.println(num+" "+"num is even");
        }
        else System.out.println(num+" "+"num is odd");
    }
    //find factorial of a number
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f *=i;
        }
        return f;
    }
    //check if a number is a prime
    static boolean isPrime(int num){
        if(num<=1)
        return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
    //reverse a number
    static int rev(int n){
        int r=0;
        while(n !=0){
            r=r*10 + n % 10;
            n /=10;
        }
        return r;
    }
    //fibonacci up to n term
    static void fibo(int n){
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println();
    }
    //palindrome number
    static boolean isPalindrome(int num){
        return num==rev(num);
    }
    //sum of digits
    static int sumOfDigits(int n){
        int sum=0;
        while(n !=0){
            sum +=n % 10;
            n /=10;
        }
        return sum;
    }
    //armstrong number
    static boolean isArmstrong(int num){
        int ori=num;
        int res=0;
        int n=String.valueOf(num).length();
        while(num !=0){
            int digit=num % 10;
            res +=Math.pow(digit,n);
            num /=10;
        }
        return res==ori;
    }
    //largest 3 number
    static int lar(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else
        return c;
    }
    //check leap year
    static boolean isleapyear(int year){
        return (year % 4==0 && year % 100 !=0) || (year % 400==0);
    }
    //count digits in anumber
    static int countDigits(int num){
        int len=0;
        while(num !=0){
            int rem=num % 10;
            len++;
            num /=10;
        }
        return len;
    }
    //cal power(x^y)
    static int powerOf(int x,int y){
        int res=1;
        for(int i=1;i<=y;i++){
            res *=x;
        }
        return res;
    }
    //swap 2 num without temp
    static void swapnumber(int a,int b){
        System.out.println("Before swapping"+" "+a+":"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping"+" "+a+":"+b);
    }
    //print factors of anumber
    static void printFactors(int num){
        for(int i=1;i<=num;i++){
            if(num % i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    //Gcd of 2 number
    static int gcd(int a,int b){
        while(b !=0){
            int t=b;
            b=a % b;
            a=t;
        }
        return a;
    }
    //lcm of 2 num
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    //reverse a string
    static String reve(String s){
        String res="";
        for(char ch:s.toCharArray()){
            res =ch +res;
        }
        return res;
    }
    //count vowels
    static int countVowels(String s){
        int c=0,v=0;
        for(char ch:s.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch) ==-1){
                c++;
            }
            else{
                v++;
            }
        }
        return v;
    }
    //check if string is palindrome
    static boolean isPalindromeString(String s){
        return s.equalsIgnoreCase(reve(s));
    }
    //multiplication table
    static void mul(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n+ "x" +i+"="+(n * i));
        }
    }





    public static void main(String ar[]){
        checkEvenOdd(9);
        System.out.println(fact(5));
        System.out.println(isPrime(17));
        System.out.println(rev(9856));
        fibo(9);
        System.out.println(isPalindrome(787));
        System.out.println(sumOfDigits(999));
        System.out.println(isArmstrong(153));
        System.out.println(lar(5,7,9));
        System.out.println(isleapyear(2002));
        System.out.println(countDigits(89876));
        System.out.println(powerOf(4,3));
        swapnumber(5,7);
        printFactors(25);
        System.out.println(gcd(4,5));
        System.out.println(lcm(5,9));
        System.out.println(reve("Mango"));
        System.out.println(countVowels("Bangalore"));
        System.out.println(isPalindromeString("MADAM"));
        mul(5);
    }
}