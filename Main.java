import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("", 50);
        Store store = new Store();
        
        while (player.getMoney() >= 4) {
            System.out.println("Welcome to Whole Foods.");
            System.out.println("You have $" + player.getMoney() + " to spend. You have to have at least $4 left to purchase a reusable bag when you are finished shopping");
            store.displayItems();
            System.out.println("Enter the number of the item you wish to purchase, or 0 to exit: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            }
            
            Item selectedItem = store.getItem(choice);
            
            if (selectedItem == null) {
                System.out.println("Invalid selection. Please try again.");
            } else if (selectedItem.getSalePrice() < player.getMoney()) {
                System.out.println("You don't have enough money to purchase that item. Please try again.");
            } else {
                player.buyItem(selectedItem);
                System.out.println("You purchased " + selectedItem.getName() + " for $" + selectedItem.getSalePrice() + ".");
            }
            store.updatePrices();
        }
        
        System.out.println("Thanks for shopping, " + "! You have $" + player.getMoney() + " left.");
    }
}
