//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Trousers t1 = new Trousers(150.0, "Black", "Medium", "Male", 80);
        Shirt s1 = new Shirt(130.0, "Gray", "Medium", 60);

        Clothes c1 = new Trousers(150.0, "Black", "Medium", "Male", 80);
        Clothes c2 = new Shirt(130.0, "Gray", "Medium", 60);

//        c1.legLength;//can't access legLength, since it's not in the Clothes class
//        ((Trousers)c2).legLength  ;//crash because Shirt can't be cast as Trousers

        print(t1);
        print(s1);

        printClothesInstance(c1);
        printClothesInstance(c2);

        System.out.println("-----------------------------------");

//        Clothes clothes = new Clothes(150.0, "Black", "Medium"); //can't instantiate abstract class
    }


    static void print(Clothes c) {
        System.out.println("-------------------print----------------");
        c.display();
    }

    static void printClothesInstance(Clothes c) {
        System.out.println("----------------printClothesInstance-------------------");

        if (c instanceof Trousers) {
            System.out.println("Trouser legLength= " + ((Trousers) c).legLength);
        } else if (c instanceof Shirt) {
            System.out.println("Shirt sleevesSize= " + ((Shirt) c).sleevesSize);
        }
    }

}