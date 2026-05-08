package week1;

public class fibonacciSeries {
    public static void main(String[] args) {
        
        int n=8;
        int a=0;
        int b=1;

        for (int i=0;i<n;i++)
        {
         if (i==n-1)
            {
                System.out.println(a);
            break;
            }
            System.out.print(a + ", ");
           
        int c=a+b;
        a=b;
        b=c;

        }
    }

}
