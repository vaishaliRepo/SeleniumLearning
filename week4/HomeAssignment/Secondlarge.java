package org.testleaf.week4.HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secondlarge {

    public static void main(String[] args) {
        
        int[] arr1={3, 2, 11, 4, 6, 7};
        List<Integer> list1= new ArrayList<>();

        for (int i=0;i<arr1.length; i++){
            list1.add(arr1[i]);
        }

        System.out.println("Array is added to the list and the values are : " +list1);

        //sorting the array

        Collections.sort(list1);

        System.out.println("Sorted array is :" +list1);

        Integer integer = list1.get(list1.size()-2);

        System.out.println("Second element from the last is : " +integer);

        
    }

}
