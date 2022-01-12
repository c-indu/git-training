package exercise;

public class Egg2 {
    public static void main (String[] args) {
        top();
        bot();
        mid();

        top();
        bot();
        mid();
        bot();

        top();
        mid();
        bot();
    }
    public static void top(){
        System.out.println(" _______ ");
        System.out.println("/       \\");
        System.out.println("/        \\");
    }
    public static void mid() {
       System.out.println("-\"-'-\"-'\"-");
    }
    public static void bot() {
        System.out.println("\\         /");
        System.out.println(" \\_______/" );
    }
    
}
