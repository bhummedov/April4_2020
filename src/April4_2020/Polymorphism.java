package April4_2020;

public class Polymorphism {

  public static void calculatePerimeter(int a, int b) {
      System.out.println("rectangle = " + (2 * (a * b)));
  }
    public static void calculatePerimeter(int a ) {
        System.out.println("square =" + (4 * a));
    }
    public static void calculatePerimeter(double r ){
      System.out.println("circle ="+ (3.14*2*r));

    }
    public void calculateArea(int a, int b) {
        System.out.println("rectangle = " + (a * b));
    }
    public void calculateArea(int a) {
        System.out.println("square =" + (a * a));
    }
    public void calculateArea(double r ){
        System.out.println("circle ="+( 3.14*r*r));
    }
}
