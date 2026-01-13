public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = {3,7,10,15};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers: " + numbers[i]);
            if (numbers[i] >10){
                System.out.println("Greater than 10:" + numbers[i]);
            }
        }
    }
}