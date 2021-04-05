
import java.util.Scanner;
public class ScannerClassTraining {


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); //Creating the object for scanner class and passing the input stream from the key board
                System.out.println("Please Enter your name");
                String name = sc.next(); //Setting the string value from the user input
                System.out.println("Please Enter your gender - f or m");
                String gender = sc.next(); //Setting the Int value from the user input
                System.out.println("Please Enter the mark for subject 1");
                int subject1 = sc.nextInt(); //Setting the Int value from the user input
                System.out.println("Please Enter the mark for subject 2");
                int subject2 = sc.nextInt(); //Setting the Int value from the user input
                System.out.println("Please Enter the mark for subject 3");
                int subject3 = sc.nextInt(); //Setting the Int value from the user input
                System.out.println("Please Enter the mark for subject 4");
                int subject4 = sc.nextInt(); //Setting the Int value from the user input
                System.out.println("Please Enter the mark for subject 5");
                int subject5 = sc.nextInt(); //Setting the Int value from the user input
                int total = subject1+subject2+subject3+subject4+subject5; //add all the subjects

                //If condition is used in order to execute some expression based on condition
                if(subject1>60 & subject2>60 & subject3>60 &subject4> 60 & subject5>60 & total>400){
                    System.out.println("Hi, \n"+name+" congratulations "+gender+"  You have passed with the distinction and your total is :"+total);
                }
                else if(subject1>60 & subject2>60 & subject3>60 &subject4> 60 & subject5>60 & (total>300)&&(total <400)){
                    System.out.println("Congrats ! You have passed with the first class and your total is :"+total);
                }
                else if(subject1>40 & subject2>40 & subject3>40 &subject4> 40 & subject5>40 & (total<300)){
                    System.out.println("Congrats you have passed with second class and your total is :"+total);
                }
                else
                {
                    System.out.println("Sorry You have failed and your total is :"+total);
                }
            }
        }




