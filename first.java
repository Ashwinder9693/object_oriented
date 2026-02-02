import java.util.*;

public class first {
   

    public static void addition(double a, double b){
        double sum = a+b;
        System.err.println("The sum is: " + sum);
    }
    public static void substraction(double a, double b){
        double difference = a-b;
        System.err.println("The difference is: " + difference);

    }
    public static void multiplication(double a, double b){
        double product = a*b;
        System.err.println("The product is: " + product);
    }

    public static void divide(double a, double b){
        if(b != 0){
            double quotient = a/b;
            System.err.println("The quotient is: " + quotient);
        } else {
            System.err.println("Error: Division by zero is not allowed.");
        }
    }

    public static int choice(){
        Scanner kb = new Scanner(System.in); 
        System.out.println("choose an operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = kb.nextInt();
        return choice;
       }
    
    public static double input(int a){
        Scanner kb = new Scanner(System.in); 
        System.out.println("Enter number " + a + ": ");
        double num = kb.nextDouble();
        return num;
       }


    public static void main(String[] args){
        switch(choice()){
            case 1:
                addition(input(1), input(2));
                break;
            case 2:
                substraction(input(1), input(2)  );
                break;
            case 3:
                multiplication(input(1), input(2));
                break;
            case 4:
                divide(input(1), input(2));
                break;
            default:
                System.err.println("Invalid choice.");
        }
        
    }

}