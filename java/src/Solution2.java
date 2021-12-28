import java.io.*;
import java.util.*;

public class Solution2 {

   static boolean isAnagram(String A, String B) {
       char[] chars = A.toCharArray();
       Arrays.sort(chars);
       String sorted = new String(chars);
       char[] chars1 = B.toCharArray();
       Arrays.sort(chars1);
       String sorted1 = new String(chars1);
       
       if (sorted.equalsIgnoreCase(sorted1)) {
           return true;
       } else {
           return false;
       }
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A.toLowerCase(),B.toLowerCase());
        System.out.println((ret) ? "anagram":"not anagram");
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}