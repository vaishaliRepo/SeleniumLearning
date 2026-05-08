package week1.day2;

public class Palindrome {
    public static void main(String[] args) {

      int input=11;
        int output=0;
        

        for (int i=1;i<input;i=i/10)
        {
           int rem= i%10;
           output=output*10+rem;
        {
       
        if(input==output)
        {
            System.out.println(input + " is a palindrome number.");
        }
        else
        {
            System.out.println(input + " is not a palindrome number.");
        }
    }
    }
}

}

