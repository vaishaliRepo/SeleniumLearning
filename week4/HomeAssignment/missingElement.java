package org.testleaf.week4.HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingElement {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 10, 6, 8 };
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        System.out.println(list);
        // sorting the array
        Collections.sort(list);

        System.out.println("Items in the array are sorted in ascending order :" + list);

        //1,2,3,4,6,8,10
        //0,1,2,3,4,5,6   
        for (int i = 0; i < list.size()-1; i++) {  
            if (list.get(i) + 1 != list.get(i + 1)) 
                 {
                for (int j = list.get(i) + 1; j < list.get(i + 1); j++) {
                    System.out.println("Missing Number: " + j);
                }
            }
        }

    }

}
