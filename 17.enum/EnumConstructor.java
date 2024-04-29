enum Laptop{
    Apple(5324), Macbook(345), Surface(324), IdeaPad;
    private int price;

     private Laptop(){
        price = 500;
        System.out.println(
            "in IdealPad"
        );
     }
    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
         for(Laptop l : Laptop.values()) {
            System.out.println(l.getPrice()  );
         }
         
    }
}
