public class bird {

    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;
 
     // pet
    public void sayMyPet() {
        System.out.println("This is: " + description + " weights " + weight + " Quantity " + quantity + " Can be Traded? " + canbetraded);
    }
    public bird(int pri,float wei, int qua, String des, boolean cbt){;
        price = pri;
        weight = wei;
        quantity = qua;
        description = des;
        canbetraded = cbt; 

        //tis is with constractor
    }
}
