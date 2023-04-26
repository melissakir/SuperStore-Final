import java.util.ArrayList;
import java.util.Random;

class Store {
    private ArrayList<Item> items;
    Random rand = new Random();

    
    public Store() {
        this.items = new ArrayList<Item>();
        this.items.add(new Fruit ("Apple", 3, 3));
        this.items.add(new Fruit ("Banana", 2, 2));
        this.items.add(new Fruit ("Orange", 2, 2));
        this.items.add(new Fruit ("Raspberries", 6, 6));
        this.items.add(new Fruit ("Blueberries", 6, 6));
        this.items.add(new Vegetable ("Broccoli", 8, 7.36));
        this.items.add(new Vegetable("Lettuce", 7, 6.44));
        this.items.add(new Vegetable ("Carrots", 7, 6.44));
        this.items.add(new Vegetable ("Onion", 8, 7.36));
        this.items.add(new Vegetable ("Mushrooms", 10, 9.20));
        this.items.add(new Snack ("Granola bar", 5, 4.75));
        this.items.add(new Snack ("Honey grahams", 4, 3.80));
        this.items.add(new Snack ("Popcorn", 4, 3.80));
        this.items.add(new Snack ("Chedder bunnies", 6, 5.70));
        this.items.add(new Snack ("Pretzels", 5, 4.75));
        this.items.add(new Bakery ("Bread", 12, 12));
        this.items.add(new Bakery ("Pie", 18, 18));
        this.items.add(new Bakery ("Cupcakes", 9, 9));
        this.items.add(new Bakery ("Cookies", 8, 8));
        this.items.add(new Bakery ("Brownies", 7, 7));

    }
    public void displayItems() {
        System.out.println("Here are the items available for purchase:");
        for (int i = 0; i < this.items.size(); i++) {
            Item item = this.items.get(i);
            System.out.println((i+1) + ". " + item.getName() + " ($" + item.getSalePrice() + ")");
        }
    }

    public void updatePrices() {
        // go through every item and maybe put it on sale
        int i = rand.nextInt(2);
        for (Item item: items) {
            if (i == 0){
                item.getSalePrice();
            }
            else if (i == 1) {
                item.getSalePrice();
            }
        }
    }

    public Item getItem(int index) {
        if (index < 1 || index > this.items.size()) {
          return null;
     }
     return this.items.get(index-1); 
    }
}