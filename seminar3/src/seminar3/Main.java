package seminar3;

public class Main {
    public static void main(String[] args) {
        SoferAutobuz sofer1 = SoferAutobuz.getInstance("dorel");
        SoferAutobuz sofer2 = SoferAutobuz.getInstance("marcel");
        System.out.println(sofer1.getNume());
        System.out.println(sofer2.getNume());
    }
}
