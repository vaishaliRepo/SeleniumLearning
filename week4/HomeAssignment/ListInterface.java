package org.testleaf.week4.HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        String[] str = { "HCL", "Wipro", "Aspire Systems", "CTS" };

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            list.add(str[i]);
        }
      //  System.out.println(list);

        //sort the list
        Collections.sort(list);

        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i) +",");
        }

        
    }

}
