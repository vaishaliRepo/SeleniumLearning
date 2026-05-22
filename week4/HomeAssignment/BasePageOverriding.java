package org.testleaf.week4.HomeAssignment;

public class BasePageOverriding {

    public void findElement(){
        System.out.println("Find Element is executed from Base class");
    }
    public void clickElement(){
        System.out.println("ClickElement is executed from Base class");
    }
    public void enterText(){
        System.out.println("Enter Text is executed from Base class");
    }
    public void performCommonTasks(){
        System.out.println("Perform common Task is executed from Base class");
    }

    public static void main(String[] args) {
        BasePageOverriding mainobj= new BasePageOverriding();
        mainobj.enterText();
    }
}
