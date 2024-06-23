public class Shirt extends Clothes {
    int sleevesSize;

    public Shirt(double price, String color, String size, int sleevesSize) {
        super(price, color, size);
        this.sleevesSize = sleevesSize;
    }

    @Override
    public String getBrandName() {
        return "Polo";
    }

    @Override
    public void display() {
//        super.display();
        System.out.println("Shirt: price = " + price + " ,color = " + color + " size = " + size + ", sleeves size = " + sleevesSize);
    }
}
