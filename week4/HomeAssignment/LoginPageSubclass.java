package org.testleaf.week4.HomeAssignment;

public class LoginPageSubclass extends BasePageOverriding{

   
    public void performCommonTasks()
    {
        System.out.println("LoginPageSubclass method is executed from Subclass");
        super.performCommonTasks();
    }


    public static void main(String args[]){

        LoginPageSubclass subobj= new LoginPageSubclass();
        subobj.findElement();
        subobj.clickElement();
        subobj.performCommonTasks();

    }
    

}
