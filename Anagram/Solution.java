/**
 * 
 */
package Anagram;

/**
 * @author Aman
 *
 */
import java.util.Scanner;

public class Solution {

 static boolean isAnagram(String a, String b) {
        // Complete the function
        String [] arr1 = a.toLowerCase().split("");
        String [] arr2 = b.toLowerCase().split("");
        String str="";
        String atr="";
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        boolean flag=false;
        for(int i=0;i<arr1.length;i++){
        	str+=arr1[i];  
        }
        for(int i=0;i<arr2.length;i++){
        	atr+=arr2[i];  
        }
        if(str.equalsIgnoreCase(atr)) {
        	flag=true;
        }
        return flag;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


