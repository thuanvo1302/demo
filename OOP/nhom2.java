import java.util.*;

public class nhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item[] = {"Coca", "Pepsi", "Sprite", "Snack"};
        double price[] = {2, 3, 2, 1};
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.println("Please enter the number: ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Machine is shutting down");
                break;
            }
            else if (choice < 5 && choice > 0) {
                System.out.println("The value of " + item[choice-1] + " is: " + price[choice-1] + "$, please enter the amount of money: ");
                double money = sc.nextDouble();
                if (money < price[choice-1]) System.out.println("Not enough money to buy this item. Please select again.");
                else {
                    double change = money - price[choice-1];
                    System.out.printf("Your change is %.1f$.\n", change);
                }
            }
            else System.out.println("Please enter a valid number.");
        }
        sc.close();
    }
}
