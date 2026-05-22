package week3.HomeAssignment;

import java.util.Arrays;

public class FindMissingElement {

    public static void main(String args[])
    {
        int[] num = { 1, 4, 3, 2, 8, 6, 7 };

        // sorting the array
        Arrays.sort(num);
        //1,2,3,4,6,7,8

        // printing the sorted array
        System.out.println("The sorted array is: " + Arrays.toString(num));

        // iterating through the array
        
            for (int i = 0; i < num.length;i++) 
                {
                    if((i+1)!=num[i])
                    {
                        System.out.println("Missing number in the array:" + (i+1));                        
                        break;
                    }
             
                }
        
    }

}