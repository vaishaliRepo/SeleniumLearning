package week1.day2;

public class Palindrome1 {
    public static void main(String[] args) {
        
        int input=1331;
        int temp=input;
        int output = 0;

        while(temp>0)
        {
            int rem= input %10;
            output= output*10+rem;
            temp=temp/10;
        }
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


