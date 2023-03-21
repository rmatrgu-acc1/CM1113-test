/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchpad;
import java.util.*;

/**
 *
 * @author rogermcdermott
 */
public class ScratchpadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //call recursive method below this line
        int[] numbers = {11, 22, 3,66, 41, 15};
        System.out.println(getMax(numbers));
        
        
    }
    
    
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) { //If reached end of array
            return arr[index];
        } else {
            int max = findMax(arr, index + 1); // recursive call
            return Math.max(arr[index], max);
        }
    }
    
    public static int getMax(int[] nums){
        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1){
            return nums[0];
        } else {
            int lastIndex = nums.length;
            int[] tail = Arrays.copyOfRange(nums, 1, lastIndex);
            return Math.max(nums[tail.length - 1], getMax(tail));
        }
    }  
    
    
}
