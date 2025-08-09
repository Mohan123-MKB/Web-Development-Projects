import java.util.*;
public class removeduplicates{
    public static void main(String[] args) {
        //Remove duplicates
        List<Integer> li=new ArrayList<>(List.of(4,2,3,2,1,4));
        Set<Integer> unique=new LinkedHashSet<>(li);
        System.out.println(unique);

        //Frequency of elements
        List<String> words=Arrays.asList("apple","banana","apple","orange","apple");
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);

        //sort a list of integers
        List<Integer> nums=new ArrayList<>(List.of(5,4,2,9,7,3,1));
        System.out.println("Ascending order");
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("Descending order");
        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);

        //Find duplicates elements
        List<Integer> list=new ArrayList<>(List.of(4,6,5,4,3,2,2,5));
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dupli=new HashSet<>();
        for(int n:list){
            if(!seen.add(n)){
                dupli.add(n);
            }
        }
        System.out.println(dupli);

        //Stack implementation using Deque
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //merge 2 lists and remove duplicates
        List<Integer> l1=Arrays.asList(1,2,3);
        List<Integer> l2=Arrays.asList(3,5,7);
        Set<Integer> merged=new LinkedHashSet<>();
        merged.addAll(l1);
        merged.addAll(l2);
        System.out.println(merged);

        //first non repeating characters
        String str="swiss";
        Map<Character,Integer> m=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> en:m.entrySet()){
            if(en.getValue()==1){
                System.out.println(en.getKey());
                break;
            }
        }

        //reverse a list
        List<Integer> l=new ArrayList<>(List.of(3,4,5,2,5,7));
        Collections.reverse(l);
        System.out.println(l);

        //Count even and odd numbers in a list.
        List<Integer> lists=Arrays.asList(1,2,3,6,8,9,10);
        int even=0,odd=0;
        for(int n:lists){
            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even+":"+odd);
    }

}