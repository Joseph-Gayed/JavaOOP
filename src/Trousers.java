public class Trousers extends Clothes {
    String gender;
    int legLength;

    public Trousers(double price, String color, String size, String gender, int legLength) {
        super(price, color, size);//initialize parent constructor
        this.gender = gender;
        this.legLength = legLength;
    }

    @Override
    public String getBrandName() {
        return "Zara";
    }

    @Override
    public void display() {
//        super.display(); //this will call parent's display method
//        System.out.println(super.name);//can't access private fields
        System.out.println("Trousers: price = " + price + " ,color = " + color + " size = " + size + ", Leg length = " + legLength + ", gender = " + gender);
    }
}
