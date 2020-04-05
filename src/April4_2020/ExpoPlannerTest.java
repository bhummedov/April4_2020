package April4_2020;

public class ExpoPlannerTest {
    public static void main(String[] args) {
        ExpoPlanner expo1 = new ExpoPlanner();
        expo1.listAll();
        String[] checklist = {"A", "B", "C", "D", "A", "B", "C", "D", "E", "F"};
        expo1.modifyCheckList("May 30th", checklist);

    }
}
