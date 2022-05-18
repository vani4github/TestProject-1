import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        System.out.println("Prg Even or Odd");
        int a;
        System.out.println("Enter the number:");
        Scanner input =new Scanner(System.in);
        a=input.nextInt();
        if (a%2 ==0){
            System.out.println("Given number is even");
        }else
        {
            System.out.println("given number is odd");
        }
    }
}
