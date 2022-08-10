import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password!";
        int counter = 0;
        String user = "";
        Scanner reader = new Scanner(System.in);

        while (user.isEmpty()) {
            System.out.print("Please enter your username: ");
            user = reader.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter your password: ");
            String pass = reader.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("You have been validated");
                break;
            } else {
                System.out.println("Access not authorised");
                counter++;

                if (counter == 3) {
                    System.out.println("You have been banned");
                }
            }
        }
    }
}
