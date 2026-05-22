package org.testleaf.week4.ClassroomActivity;

public class Overloading {

    public void reportStep(String msg, String Status)
    {
       System.out.println(msg);
       System.out.println(Status);
    }
    public void reportStep(String msg, String Status,boolean snap)
    {
       System.out.println(msg);
       System.out.println(Status);
       System.out.println(snap);
    }

    public static void main(String[] args) {

        Overloading Over= new Overloading();
        Over.reportStep("Goodmorning","Happy");
        Over.reportStep("GoodEvening", "Tired",true);
        
    }

}
