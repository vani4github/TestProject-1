import java.util.Scanner;

public class Leapyear {
    public static void main(String args[]){
    int year;
    System.out.println("enter leap year");
    Scanner Sc = new Scanner(System.in);
        System.out.println("enter year:");
        year = Sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Given year is leap year:");
        }
        else {
            System.out.println("Given year is not a leap year:");
        }


    }

}
