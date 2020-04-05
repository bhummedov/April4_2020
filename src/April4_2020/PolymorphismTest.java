package April4_2020;

public class PolymorphismTest {
    public static void main(String[] args) {
        Polymorphism myPol = new Polymorphism();
        myPol.calculateArea(2,3);
        myPol.calculateArea(3);
        myPol.calculateArea(3.4);
        Polymorphism.calculatePerimeter(3,4);
        Polymorphism.calculatePerimeter(3);
        Polymorphism.calculatePerimeter(3.4);
    }
}
