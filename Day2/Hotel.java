import java.util.*;

class Hotel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Idli");
            System.out.println("2. Dosa");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("You ordered Idli");
            }

            else if (choice == 2) {
                System.out.println("1. Set Dosa");
                System.out.println("2. Normal Dosa");
                System.out.print("Enter dosa type: ");
                int d = sc.nextInt();

                if (d == 1)
                    System.out.println("You ordered Set Dosa");
                else if (d == 2)
                    System.out.println("You ordered Normal Dosa");
                else
                    System.out.println("You have chosen the wrong dosa type. Try again!");
            }

            else if (choice == 3) {
                System.out.println("Thank you");
            }

            else {
                System.out.println("You have chosen the wrong option. Try again!");
            }

        } while (choice != 3);
    }
}
