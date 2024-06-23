abstract public class Clothes {

    public abstract String getBrandName(); //can be accessed anywhere even out of the package

    protected double price;// can be accessed in same package , and in subclasses even in different packages
    String color;//can be only accessed in same package
    String size;
    private final String name = "Clothes";//can be access only in same class

    public Clothes(double price, String color, String size) {
        this.price = price;
        this.color = color;
        this.size = size;
    }


    public void display() {
        System.out.println(name+" Parent : price = " + price + " ,color = " + color + " size = " + size + " brand = " + getBrandName());
    }
}
