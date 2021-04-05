import java.util.Scanner;

public class Apples {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Tuna TunaObject = new Tuna ();

                System.out.println("Enter your name here: ");
                String name = input.nextLine();

                TunaObject.simpleMessage(name);


    }
}
