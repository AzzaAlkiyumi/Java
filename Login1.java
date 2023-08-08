import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {


        //Login
        Scanner read = new Scanner(System.in);
        String email = "azza@gmail.com";
        String Password = "123456789";
        System.out.println("Enter your email:");
        String enteremail = read.nextLine();


        if (enteremail.equals(email)) {
            System.out.println("Enter your Password:");
            String enterpass = read.nextLine();
            if (enterpass.equals(Password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("your password is not correct!");
            }
        } else {
            System.out.println("your email is not correct!");
        }

    }
}
