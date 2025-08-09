import java.util.*;
public class StringQn{
    //reverse string
    static String rev(String s){
        String r="";
        for(char c:s.toCharArray()){
            r =c+r;
        }
        return r;
    }
    //check palindrome
    static boolean palindrome(String s){
        String ori=s;
        String rev="";
         for(char ch:s.toCharArray()){
            rev =ch+rev;
        }
        if(ori.equals(rev)){
            return true;
        }
        return false;
    }
    //count vowels and consonants
    static void countVowelsConsonants(String s){
        int v=0,c=0;
        for(char ch:s.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) !=-1){
                    v++;
                }
                c++;
            }
        }
        System.out.println("vowels: "+v+" "+"consonants: "+c);
    }
    //remove duplicates
    static String removeDuplicates(String s){
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(res.indexOf(String.valueOf(ch))==-1){
                res.append(ch);
            }
        }
        return res.toString();
    }
    //frequency of each character
    static void frq(String s){
        int[] arr=new int[256];//Ascii value or use hashmap
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.print((char)i+": "+arr[i]+" ");
            }
        }
    }
    //check if 2 strings are anagram
    static boolean isAnagram(String s,String a){
        char[] arr=s.toCharArray();
        char[] ar=a.toCharArray();
        Arrays.sort(arr);
         Arrays.sort(ar);
         return Arrays.equals(arr,ar);

    }
    //print all substring
    static void printSubstring(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
    //string to integer
    static int stToInt(String s){
        int num=0;
        for(char ch:s.toCharArray()){
            num = num * 10+(ch-'0');
        }
        return num;
    }
    //Is numeric 
    static boolean isnumeric(String s){
        return s.matches("\\d+");
    }
    //Toggle case
    static String togglecase(String s){
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            res.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        return res.toString();
    }
    //count words
    static int countWords(String s){
        return s.trim().split("\\s+").length;
        // int count=0;
        // boolean inword=false;
        // for(char ch:s.toCharArray()){
        //     if(ch !=' ' && ch !='\t' && ch !='\n'){
        //         if(!inword){
        //             count++;
        //             inword=true;
        //         }
        //         else{
        //             inword=false;
        //         }
        //     }
        // }
        // return count;
    }
    //find largest words
    static String largestWords(String s){
        String[] words=s.split("\\s+");
        String lar="";
        for(String word:words){
            if(word.length()>lar.length()){
                lar=word;
            }
        }
        return lar;
    }
    //replace spaces with hypen
    static String replaceSpaces(String s){
        return s.replace(" ","-");
    }
    public static void main(String ar[]){
        System.out.println(rev("balaji hi"));
        System.out.println(palindrome("MADAM"));
        countVowelsConsonants("applesOrange");
        System.out.println(removeDuplicates("aapplle"));
        frq("banana");
        System.out.println();
        System.out.println(isAnagram("nams","sman"));
        printSubstring("car");
         System.out.println();
        System.out.println(stToInt("animal"));
        System.out.println(isnumeric("45245"));
        System.out.println(togglecase("NOman"));
        System.out.println(countWords("maohshdla oqoe hq hdsio balf"));
        System.out.println(largestWords("ksf wehr wegqq ywroas"));
        System.out.println(replaceSpaces("Good morning sir i am mohan balji from tamil nadu so i am enthusiasist in software developer "));
        
    }

}