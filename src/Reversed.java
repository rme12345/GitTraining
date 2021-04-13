import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        int n, reverse = 0;
        Scanner sc = new Scanner(System.in); //Creating the object for scanner class and passing the input stream from the key board
        System.out.println("Please enter a whole number");
        n = sc.nextInt();
                while (n !=0 ){
                reverse = reverse *10;
                reverse = reverse + n%10;
            n=n/10;
            }
        System.out.println("Reverse of the number is " + reverse);
    }
}
