package org.testleaf.week4.ClassroomActivity;

public class OverrideSubclass extends Overriding {

    public void takeSnap()
    {
        System.out.println("TakeSnap method in subclass");
         super.takeSnap();
    }


    public static void main(String[] args) {

        OverrideSubclass sub= new OverrideSubclass();
        sub.takeSnap();
        sub.reportStep();
       
        
    }

}
