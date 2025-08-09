import java.util.*;
public class HashMapQn{
    static Map<Integer,Integer> freqCount(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return map;
    }

    static char firstNonRepeatingChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '_';
    }

    static int[] twoSum(int[] arr,int tar){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=tar-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    static List<List<String>> grpAnagrams(String[] str){
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    static int longestUniqueSubString(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

    static int majorityElement(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int threshold=arr.length/2;
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>threshold){
                return n;
            }
        }
        return -1;
    }

    static boolean isIsomorphic(String s,String t){
        if(s.length() !=t.length()){ 
            return false; //differnt length
        }
        //if the character in s can be replaced to get t,preserving the order,with 1-1 mapping
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> used=new HashSet<>();  //keep track of characters already mapped to in t and to avoid 2 characters in s mapping to the same character in t.
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            //case 1: Character already mapped
            if(map.containsKey(c1)){
                if(map.get(c1) !=c2){
                    return false;  //mismatch in mapping in (s--->t)
                }
            }
            //character not mapped yet
            else{
                if(used.contains(c2)){
                    return false; //each unique character in s should map to a unique character in t.(one character is used for mapping then again it not used for mapping)
                }
                map.put(c1,c2);
                used.add(c2);
            }
        }
        return true;
    }

    static List<Integer> distinctCharsinSubString(String s,int k){
        List<Integer> li=new ArrayList<>();
        if(k>s.length() || k<=0){
            return li;
        }
        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            HashSet<Character> h=new HashSet<>();
            for(char c:s.toCharArray()){
                h.add(c);
            }
            li.add(h.size());
        }
        return li;
    }
    public static void main(String ar[]){
        int[] arr={1,2,1,2,4,3,5,3};
        System.out.println(freqCount(arr));
    }
}
