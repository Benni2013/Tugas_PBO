package tes;

public class App {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();

        System.out.println(c.x);
        c.tampilInfo();
        System.out.println();

        System.out.println(p.x);
        p.tampilInfo();
    }
}
