// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Lab 1: Chain of Responsibility ===");
        Lab1 lab1 = new Lab1();
        lab1.demonstrate();

        System.out.println("\n=== Lab 2: Command Pattern ===");
        Lab2 lab2 = new Lab2();
        lab2.demonstrate();

        System.out.println("\n=== Lab 3: Interpreter Pattern ===");
        Lab3 lab3 = new Lab3();
        lab3.demonstrate();

        System.out.println("\n=== Lab 4: Iterator Pattern ===");
        Lab4 lab4 = new Lab4();
        lab4.demonstrate();

        System.out.println("\n=== Lab 5: Observer Pattern ===");
        Lab5 lab5 = new Lab5();
        lab5.demonstrate();

        System.out.println("\n=== Lab 6: State Pattern ===");
        Lab6 lab6 = new Lab6();
        lab6.demonstrate();
    }
}
