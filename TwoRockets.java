package exercise;

public class TwoRockets {
    public static void main(String[] args) {
        triangle();
        square();

        System.out.println("|unites| |united|");
        System.out.println("|states| |states|");

        square();
        triangle();
    }
    public static void triangle() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void square() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
