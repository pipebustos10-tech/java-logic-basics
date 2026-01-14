public class AgeStatistics {

    public static void main(String[] args) {

        int[] ages = {15, 22, -3, 45, 101, 18, 12};

        int children = 0;
        int teenagers = 0;
        int adults = 0;

        for (int age : ages) {

            if (!validateAge(age)) {
                continue;
            }

            String category = classifyAge(age);

            if (category.equals("Child")) {
                children++;
            } else if (category.equals("Teenager")) {
                teenagers++;
            } else if (category.equals("Adult")) {
                adults++;
            }
        }

        System.out.println("Children: " + children);
        System.out.println("Teenagers: " + teenagers);
        System.out.println("Adults: " + adults);
    }

    static boolean validateAge(int age) {
        return age >= 0 && age <= 100;
    }

    static String classifyAge(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 18) {
            return "Teenager";
        } else {
            return "Adult";
        }
    }
}
