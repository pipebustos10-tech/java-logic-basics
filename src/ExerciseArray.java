public class ExerciseArray {

    public static void main (String[]args){

        int[] cards = {101, 202, -5, 303, 9999, 150};


        int VIPCard = 0;
        int NormalCard = 0;

        for (int card : cards){
            if(!validateCards(card)){
                continue;
            }
        String category  = categoryCards(card);

            if (category.equals("VIP")){
                VIPCard++;
            }else if(category.equals("NORMAL")){
                NormalCard++;
        }
        }

        System.out.println("VIPCard" + " " + VIPCard);
        System.out.println("NormalCard" + " " + NormalCard);
    }
    static boolean validateCards (int card){
        return card >=0 && card <= 1000;
    }
   static String categoryCards(int card){
        if (card >=200){
            return "VIP";
        }else{ return "NORMAL";
        }
   }
}
