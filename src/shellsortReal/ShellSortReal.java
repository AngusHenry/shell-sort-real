/*
 * Angus Henry
 */

package shellsortReal;

import java.util.Scanner;

/**
 *
 * @author anhen3335
 */
public class ShellSortReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println ("How many numbers do you want to sort 10 ,100, 1000, 10000, 100000");
        int number;
        int i, j;
        int maths;
        i = input.nextInt();

         int[] random = new int[i];
       
       
       for(j = 0; j < i; j++){
        maths = (int)(Math.random() * i);
          random[j] = maths;
       }
        ShellSortReal ob = new ShellSortReal(); 
        long start = System.nanoTime(); // get starting time
        ob.sort(random);
        long end = System.nanoTime(); // get ending time
         System.out.println("Elapsed time: " + (end - start) + "nano seconds");
        printArray(random); 
    }
    
    int sort(int arr[]) { 
        int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2) { 
            for (int i = gap; i < n; i += 1) { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    }
    static void printArray(int nums[]) 
    { 
        int n = nums.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(nums[i] + " "); 
        System.out.println(); 
    } 
    
}
