package week3.classroomActivity;

public class stringReverse {

    public static void main(String[] args)
     {
        String companyName="TestLeaf";

        System.out.println("Reversed String value is:");            
        
        char[] reverse = companyName.toCharArray();

    for(int i=reverse.length-1;i>=0;i--)
    {
    System.out.print(reverse[i]);
    }

    }
}
