public class IfElseExample {
    public static void main(String[] args) {

        int age = 101;
        boolean hasId = false;

        if (age < 0 || age > 100) {
            System.out.println("Invalid age");
            return;
        }

        if (age >= 18 && hasId) {
            System.out.println("Access granted");
            return;
        }

        if (age < 13) {
            System.out.println("You are a child");
            return;
        }

        if (age < 18) {
            System.out.println("You are a teenager");
            return;
        }

        System.out.println("Access denied");
    }
}