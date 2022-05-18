import java.util.Scanner;

public class MrsMs {
    public static void main(String args[]) {
        System.out.println("MrsMs");
        String name, gender;

        System.out.println("enter your name:");

        Scanner line = new Scanner(System.in);
        name = line.nextLine();

        System.out.println("Enter Your Gender");
        gender = line.nextLine();
        if (gender.equals("male")) {
            System.out.println("welcome Mr." + name);
        } else {
            System.out.println("welcome Mrs." + name);
        }
    }
}






