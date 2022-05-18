import java.util.Scanner;

public class GirlsBoys {
    public static void main(String args[]){
        System.out.println("GirlsBoys");
        String name,gender;
        Scanner line = new Scanner(System.in);
        System.out.println("enter your name:");
        name = line.nextLine();
        System.out.println("enter your gender:");
        gender = line.nextLine();
        if(gender.equals("male")){
            System.out.println("welcome mr:"+name);

        }
        else{
            System.out.println("welcome mrs:"+name);
        }


    }
}
