
// import the Scanner class
import java.util.Scanner;

public class app {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        orderPizza();
    }
    static void orderPizza(){  

        System.out.println("Hello Welcome to Pizza Store!" + '\n' + "Here are the orders!" + '\n' +"a1 Creamy Garlic & 5 Cheese, a2 Angel's Supreme, a3 Angel's Pepperoni" + '\n' + "a4 Toppings So Bongga, a5 Chessy Burger, a6 Creamy Spinach Dip" + '\n' +"Please pick the letter of your pizza choice");
        // String a1 = "Creamy Garlic & 5 Cheese";
        // String a2 = "Angel's Supreme";
        // String a3 = "Angel's Pepperoni";
        // String a4 = "Toppings So Bongga";
        // String a5 = "Chessy Burger";
        // String a6 = "Creamy Spinach Dip";
        
        String pizza = "";
        double pricePizza = (0);



        String choice = scan.next();
        switch (choice) {
			case "a1":
				pizza = "Creamy Spinach Dip Pizza";
				pricePizza = 515.00;
				break;
			case "a2":
				pizza = "Angel's Supreme";
				pricePizza = 515.00;
				break;
            case "a3":
				pizza = "Angel's Pepperoni";
				pricePizza = 515.00;
				break;
            case "a4":
				pizza = "Toppings So Bongga";
				pricePizza = 515.00;
				break;
            case "a5":
				pizza = "Chessy Burger";
				pricePizza = 515.00;
				break;
            case "a6":
				pizza = "Creamy Spinach Dip";
				pricePizza = 515.00;
				break;
			default:
				System.out.println("Please enter the letter beside the order");
				return;

        }
        System.out.println("What is the crust of the pizza? " + "a1 Normal, a2 Thin, a3 Stuffed");
        
        String crust = scan.next();
        double priceCrust = (0);
        switch (crust) {
			case "a1":
				crust = "Normal Crust";
                priceCrust = 0;
				break;
			case "a2":
                crust = "Thin Crust";
                priceCrust = 50;
				break;
            case "a3":
                crust = "Stuffed Crust";
                priceCrust = 100;
				break;
			default:
				System.out.println("Please repeate the crust order again");
				return;

        }
        System.out.println("What is the pizza size: a1 Small, a2 Medium, a3 Large");
        
        String size = scan.next();

        switch (size) {
			case "a1":
				size = "Small";
				break;
			case "a2":
                size = "Medium";
				break;
            case "a3":
                size = "Large";
				break;
			default:
				System.out.println("Please repeate the size the order again");
				return;

        }
        
        System.out.println("How many will you ordered?");
        int quantity = scan.nextInt();

        System.out.println("Your order is: " +quantity+" "+size+" "+ pizza + " with " + priceCrust +"\n"+ " Your total order amount is: ");
		System.out.println(pricePizza * quantity);

		scan.close();
	}
}


