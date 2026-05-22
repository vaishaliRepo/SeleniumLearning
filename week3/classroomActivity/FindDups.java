package week3.classroomActivity;

import java.util.Arrays;

public class FindDups {

    public static void main(String[] args) 
    {

        int[] num={2, 5, 7, 7, 5, 9, 2, 3}; 

        //sort the array
        Arrays.sort(num);
             // 2,2,3,5,5,7,7,9
        //finding the duplicate number

    System.out.println("Duplicate value are");

    for (int i = 0; i < num.length; i++)
    {
       for (int j = i + 1; j < num.length; j++)
         {
           if (num[i] == num[j]) 
            {
              System.out.println(num[i]);
            }
         }
    }

    System.out.println(Arrays.toString(num));

       
    }

}
