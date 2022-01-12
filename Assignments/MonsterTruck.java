package Assignments;

public class MonsterTruck {
    public static void main(String[] args) {
        static class car {
        public void m1() {
            System.out.println("car 1");
        }
        public void m2() {
            System.out.println("car 2");
        }
        public String toString() {
            return "vroom";
        }
    }
    public class MonsterTruck extends car {
        public void m1() {
            System.out.println("monster 1");
        }
         
        public void m2() {
            super.m1();
            super.m2();
        }
         
        public String toString() {
            return "monster " + super.toString();
        }
    }
            
}
}
