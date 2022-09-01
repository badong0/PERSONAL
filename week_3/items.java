public class items {
    // Enemy attributes
   int price;
   float weight;
   int quantity;
   String description;
   boolean canbetraded;

    // Enemy method
   public void itemProperties() {
       System.out.println("This item is:  " + description + " priced on: " + price + " weighted " + weight + " quantity , " + quantity + ", " + "can be traded? " + canbetraded);

   }
}
