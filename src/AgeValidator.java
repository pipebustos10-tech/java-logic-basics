public class AgeValidator {
    public static void main(String[] args) {

        int[] ages = {15, 22, -3, 45, 101, 18, 12};

        int adultsCount = 0;


        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0 || ages[i] > 100){
            continue;
            }
            if (ages[i] >=18){
                adultsCount++;
            };




        }

        System.out.println("Adults: " + adultsCount);
    }
}