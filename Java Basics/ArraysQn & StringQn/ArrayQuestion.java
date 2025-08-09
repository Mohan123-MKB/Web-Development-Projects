import java.util.*;
public class ArrayQuestion{
    //largest and smallest
    public static void largestSmallest(int[] arr){
        int max=arr[0],min=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max + " "+ min);
    }
    //Reverse Array
    public static void revArr(int[] arr){
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
    //bubble sort
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //sum of elements
    public static int sumArray(int[] arr){
        int sum=0;
        for(int i:arr){
            sum +=i;
        }
        return sum;
    }
    //check if array contains element
    public static boolean containsel(int[] arr,int tar){
        for(int i:arr){
            if(i==tar)
            return true;
        }
        return false;
    }
    //print even and odd elements
    public static int[] evenOdd(int[] arr){
        int[] res=new int[arr.length];
        int k=0;
        for(int i:arr){
            if(i%2==0){
                res[k++]=i;
            } 
        }
         for(int n:arr){
            if(n%2 !=0){
                res[k++]=n;
            } 
        }
        return res;
    }
    //count occurences of a number
    public static int countOcc(int[] arr,int tar){
        int count=0;
        for(int n:arr){
            if(n==tar){
                count++;
            }
        }
        return count;
    }
    //second largest element
    public static int secLargest(int[] arr){
        int lar=0,secLar=0;
        for(int i:arr){
            if(i>lar){
                secLar=lar;
                lar=i;
            }
            else if(i>secLar && i !=lar){
                secLar=i;
            }
        }
        return secLar;
    }
    //rotate array by k positions(right)
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr,int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s++]=arr[e];
            arr[e--]=t;
        }
    }
    //removing duplicates 
    public static void removeDuplicates(int[] arr){
        Set<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
    //find common element in 2 array
    public static ArrayList<Integer> commonElement(int[] arr,int[] arr1){
        Set<Integer> set=new HashSet<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:arr){
            set.add(i);
        }
    
        for(int i:arr1){
            if(set.contains(i)){
                li.add(i);
            }
        }
         return li;
    }
    public static void mergeSortedArray(int[] arr,int[] arr1){
        int i=0,j=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<arr1[j]){
                System.out.print(arr[i++]+" ");
            }
            else{
                System.out.print(arr1[j++]+" ");
            }
        }
        while(i<arr.length){
             System.out.print(arr[i++]+" ");
        }
         while(j<arr1.length){
             System.out.print(arr1[j++]+" ");
        }
        System.out.println();
    }
    //move all zeros to end
    public static void moveZerosToEnd(int[] arr){
        int index=0;
        for(int i:arr){
            if(i !=0){
                arr[index++]=i;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean arrEquals(int[] arr,int[] arr1){
        int n=arr.length;
        int m=arr1.length;
        if(n !=m) return false;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
    //frequency of each element
    public static void freqCount(int[] arr){
        Map<Integer,Integer> map=new TreeMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
    //kadene algorithm
    public static int maxSubArraySum(int[] arr){
        int maxi=arr[0];
        int curmaxi=arr[0];
        for(int i=1;i<arr.length;i++){
            curmaxi=Math.max(arr[i],curmaxi+arr[i]);
            maxi=Math.max(maxi,curmaxi);
        }
        return maxi;
    }
    //find missing number
    public static int missingNumber(int[] arr2){
        int n=arr2.length;
        int tot=n*(n+1)/2;
        for(int i:arr2){
            tot -=i;
        }
        return tot;
    }
    //find duplicates
    public static int duplicates(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            if(!set.add(i))
            return i;
        }
        return -1;
    }
    public static boolean hasSubarraySum(int[] arr,int sum){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curSum=0;
            for(int j=i;j<n;j++){
                curSum +=arr[j];
                if(curSum==sum) return true;
            }
        }
        return false;
    }
    public static void pairsWithSum(int[] arr,int sum){
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            int complement=sum-i;
            if(set.contains(complement)){
                System.out.println(i+" "+complement);
            }
            set.add(i);
        }
    }
    public static void main(String ar[]){
        int[] arr={10,0,0,2,8,5,0,0,9,66,3,45};
        int[] arr1={5,9,6,8};
        int[] arr2={1,2,3,4,5,7,8,9};
        largestSmallest(arr);
        revArr(arr.clone());
        bubbleSort(arr.clone());
        System.out.println(sumArray(arr));
        System.out.println(containsel(arr,45));
        int[] ans=evenOdd(arr);
        System.out.println(Arrays.toString(ans));
        rotateArray(arr,2);
        removeDuplicates(arr);
        ArrayList<Integer> anse=commonElement(arr,arr1);
        System.out.println(anse);
        mergeSortedArray(arr,arr1);
        moveZerosToEnd(arr.clone());
        System.out.println(arrEquals(arr,arr1));
        freqCount(arr);
        System.out.println(maxSubArraySum(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(duplicates(arr));
        System.out.println(hasSubarraySum(arr,75));
        pairsWithSum(arr,13);
    }
}