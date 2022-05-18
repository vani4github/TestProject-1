import java.util.Scanner;

public class Multiply {
    public static void main(String args[]){
        System.out.println("multiply two numbers");

        int a;
        int b;
        Scanner num=new Scanner(System.in);
        System.out.println("enter first num:");
        a=num.nextInt();
        System.out.println("enter second num:");
        b=num.nextInt();


        int mul=a*b;
        System.out.println("mul="+mul);

    }
}
