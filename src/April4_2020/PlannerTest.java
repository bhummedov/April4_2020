package April4_2020;

public class PlannerTest {
    public static void main(String[] args) {
        Planner plnr = new Planner();
        plnr.addEvent("April 10","Java Strings");
        plnr.addEvent("May 12","Java Collections");
        plnr.addEvent("June 15","Interview prep");
        plnr.deleteEvent("May 12");

    }
}