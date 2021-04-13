import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Boolean isPrime=true;
        Scanner sc = new Scanner(System.in); //Creating the object for scanner class and passing the input stream from the key board
        System.out.println("Please enter a whole number");
        int num=sc.nextInt();
        sc.close();

        int i=2;
        while(i <= num/2)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
            i++;
        }
//If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
