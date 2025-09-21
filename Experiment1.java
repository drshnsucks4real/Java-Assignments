import java.util.*;


public class Experiment1
{
    public static void main(String args[])
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        boolean flag = true;
        int count = 0;
        ArrayList<Integer> prime = new ArrayList<>(); 
        for (int i = n1 ; i<=n2; i++)
        {
            for (int j = 2;j <= i/2;j++)
            {
                flag = true;
                if (i % j == 0 )
                {
                    flag = false;
                    break;
                }
            }if (flag == true)
            {
            prime.add(i);
            count++;
            }
        }
        System.out.println("The Prime Numbers Between "+ n1 + " and "+ n2 + " are: \n");
        for (int i=0;i<count;i++)
        {
            System.out.println(prime.get(i));
        }
        int min = prime.getFirst();
        int max = prime.getLast();
        System.out.println("Smallest Number: "+ min);
        System.out.println("Greatest Number: "+ max);

        int num1 = min;
        int num2 = max;
        int num3 = 0;

        System.out.println("Fibonacci Series: ");
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2;i<count;i++)
        {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
} 