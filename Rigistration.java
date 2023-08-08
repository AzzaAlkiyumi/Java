import java.util.Scanner;

public class Rigistration {
    public static void main(String[] args) {

        //register

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your email: ");
        String email1 = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String birthDateStr = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPassword = input.nextLine();

        if (password.equals(confirmPassword)) {

            System.out.println("Account created successfully!");

        } else {

            System.out.println("Passwords do not match");

        }
    }
}
