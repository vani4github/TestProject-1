import java.util.Scanner;

public class Age {
    public static void main(String args[]){
        System.out.println("age of customers");
        int age1,age2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter customers age1:");
        age1 = Sc.nextInt();
        System.out.println("enter customers age2:");
        age2 = Sc.nextInt();
        if(age1>50) {
            System.out.println("welcome senior");
        }
        else {
            System.out.println("welcome junior");
        }

        }
    }


